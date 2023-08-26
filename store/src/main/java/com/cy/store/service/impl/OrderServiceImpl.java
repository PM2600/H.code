package com.cy.store.service.impl;

import com.cy.store.entity.Address;
import com.cy.store.entity.Order;
import com.cy.store.entity.OrderItem;
import com.cy.store.mapper.OrderMapper;
//import com.cy.store.service.IAddressService;
import com.cy.store.mapper.ProductMapper;
import com.cy.store.mapper.UserMapper;
import com.cy.store.service.ICartService;
import com.cy.store.service.IOrderService;
import com.cy.store.service.ex.InsertException;
import com.cy.store.vo.CartVO;
import com.cy.store.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/** 处理订单和订单数据的业务层实现类 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private ICartService cartService;

    @Autowired
    private ProductMapper productMapper;

    @Transactional
    @Override
    public Order create(Integer[] cids, Integer uid, String username) {
        // 创建当前时间对象
        Date now = new Date();

        // 根据cids查询所勾选的购物车列表中的数据
        List<CartVO> carts = cartService.getVOByCids(uid, cids);

        // 计算这些商品的总价
        Double totalPrice = 0.0;
        for (CartVO cart : carts) {
            totalPrice += cart.getRealPrice() * cart.getNum();
        }
        // 创建订单数据对象

        Order order = new Order();
        // 补全数据：uid
        order.setUid(uid);

        order.setRecvName(username);

        order.setRecvPhone(userMapper.findByUid(uid).getPhone());

        order.setTotalPrice(totalPrice);

        // 补全数据：下单时间
        order.setOrderTime(now);
        // 补全数据：日志
        order.setCreatedUser(username);
        order.setCreatedTime(now);
        order.setModifiedUser(username);
        order.setModifiedTime(now);
        // 插入订单数据
        Integer rows1 = orderMapper.insertOrder(order);
        if (rows1 != 1) {
            throw new InsertException("插入订单数据时出现未知错误，请联系系统管理员");
        }

        // 遍历carts，循环插入订单商品数据
        for (CartVO cart : carts) {
            // 创建订单商品数据
            OrderItem item = new OrderItem();
            // 补全数据：setOid(order.getOid())
            item.setOid(order.getOid());
            // 补全数据：pid, title, image, price, num
            item.setPid(cart.getPid());
            item.setTitle(cart.getTitle());
            //item.setImage(cart.getImage());
            item.setPrice(cart.getRealPrice());
            item.setNum(cart.getNum());
            // 补全数据：4项日志
            item.setCreatedUser(username);
            item.setCreatedTime(now);
            item.setModifiedUser(username);
            item.setModifiedTime(now);
            // 插入订单商品数据
            Integer rows2 = orderMapper.insertOrderItem(item);
            // 减少商品数据库中商品数量
            Integer pid = cart.getPid();
            Integer renum = productMapper.findById(pid).getNum() - item.getNum();
            Integer rows = orderMapper.updateProductNum(pid, renum);

            if(renum <= 0){
                //下架
                Integer status = 2;
                productMapper.updateStatus(pid, 2);
            }

            if (rows2 != 1) {
                throw new InsertException("插入订单商品数据时出现未知错误，请联系系统管理员");
            }
        }
        // 返回
        return order;
    }

    @Override
    public List<OrderVO> getVOByUid(Integer uid) {
        List<OrderVO> list = orderMapper.getVOByUid(uid);
        return list;
    }

    @Override
    public void deleteOrder(Integer oid) {
        orderMapper.deleteOrder(oid);
    }

//    @Override
//    public Integer updateProductNum(Integer pid, Integer renum) {
//        Integer row = orderMapper.updateProductNum(pid, renum);
//        return row;
//    }
}