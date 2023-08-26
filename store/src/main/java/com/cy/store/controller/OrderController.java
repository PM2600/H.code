package com.cy.store.controller;

import com.cy.store.entity.Order;
import com.cy.store.service.IOrderService;
import com.cy.store.util.JsonResult;
import com.cy.store.vo.CartVO;
import com.cy.store.vo.OrderVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("orders")
public class OrderController extends BaseController {
    @Autowired
    private IOrderService orderService;

    @RequestMapping("create")
    public JsonResult<Order> create(Integer[] cids, HttpSession session) {
        // 从Session中取出uid和username
        Integer uid = getUidFromSession(session);
        String username = getUsernameFromSession(session);
        // 调用业务对象执行业务
        Order data = orderService.create(cids, uid, username);

        // 返回成功与数据
        return new JsonResult<Order>(OK, data);
    }

    @GetMapping("/")
    public JsonResult<List<OrderVO>> getVOByUid(HttpSession session){
        Integer uid = getUidFromSession(session);
        List<OrderVO> data = orderService.getVOByUid(uid);
        return new JsonResult<List<OrderVO>>(OK, data);
    }

    @RequestMapping("/delete")
    public JsonResult<Void> delete(Integer oid){
        orderService.deleteOrder(oid);
        return new JsonResult<Void>(OK);
    }
}