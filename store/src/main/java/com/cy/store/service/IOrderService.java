package com.cy.store.service;

import com.cy.store.entity.Cart;
import com.cy.store.entity.Order;
import com.cy.store.vo.OrderVO;

import java.util.List;

/** 处理订单和订单数据的业务层接口 */
public interface IOrderService {
    /**
     * 创建订单
     * @param cids 即将购买的商品数据在购物车表中的id
     * @param uid 当前登录的用户的id
     * @param username 当前登录的用户名
     * @return 成功创建的订单数据
     */
    Order create(Integer[] cids, Integer uid, String username);

    /**
     * 查询用户订单
     * @param uid
     * @return
     */
    List<OrderVO> getVOByUid(Integer uid);

    /**
     * 删除订单
     * @param oid 订单号
     */
    void deleteOrder(Integer oid);
}
