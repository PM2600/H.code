package com.cy.store.mapper;

import com.cy.store.entity.Order;
import com.cy.store.entity.OrderItem;
import com.cy.store.vo.OrderVO;

import java.util.List;

/** 处理订单及订单商品数据的持久层接口 */
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param order 订单数据
     * @return 受影响的行数
     */
    Integer insertOrder(Order order);

    /**
     * 插入订单商品数据
     * @param orderItem 订单商品数据
     * @return 受影响的行数
     */
    Integer insertOrderItem(OrderItem orderItem);

    /**
     * 根据用户uid查询用户的（几个）订单
     * @param uid
     * @return
     */
    List<OrderVO> getVOByUid(Integer uid);

//    /**
//     * 查询订单中具体商品
//     * @param Oids
//     * @return
//     */
//    List<OrderVO> getVOByOids(Integer[] Oids);

    /**
     * 创建订单后减少商品的数量
     * @param pid 商品的id
     * @param renum 剩余数量
     * @return 受影响的行数
     */
    Integer updateProductNum(Integer pid, Integer renum);

    /**
     * 删除订单
     * @param oid 订单号
     */
    void deleteOrder(Integer oid);
}