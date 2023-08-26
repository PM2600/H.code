package com.cy.store.service;

import com.cy.store.entity.*;
import com.cy.store.mapper.AdminMapper;
import com.cy.store.mapper.ProductMapper;
import com.cy.store.service.ex.InsertException;
import com.cy.store.service.ex.ServiceException;
import com.cy.store.vo.CartVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceTests {
    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private IAdminService adminService;

    @Autowired
    private ProductMapper productMapper;

    @Test
    public void login() {
        try {
            String username = "小明";
            String password = "46";
            Admin admin = adminService.login(username, password);
            System.out.println("登录成功！" + admin);
        } catch (ServiceException e) {
            System.out.println("登录失败！" + e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void UpImages2(){
        try {
            Integer id = 101;
            String str_2 = "Ve/Ph/Sh";
            adminService.updatePhoto1(id, str_2);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void addt_product() {
        Integer id = 20, cid = 1, nu = 0, sta = 1;
        Double price = 5.2;
        String item = "test8";
        String title = "test8";
        String adr = "test8";

        Product prod = new Product();
        prod.setId(id);
        prod.setCategoryId(cid);
        prod.setTitle(title);
        prod.setPrice(price);
        prod.setNum(nu);
        prod.setStatus(sta);
        prod.setAddress(adr);

        adminService.addt_product(prod);
    }

    @Test
    public void ve_Insert(){
        Vegetable vege = new Vegetable();
        Integer id = 10;
        String va = "lvse";
        String name = "x";
        vege.setId(id);
        adminMapper.ve_Insert(vege);
    }

    @Test
    public void UploadVegetableImages1(){
        try {
            Integer id = 15;
            String str_2 = "Ve/Ph/Sh";
            adminService.UploadVegetableImages1(id, str_2);
            System.out.println("OK.");
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void t_proDelete(){
        Integer id = 20;
        adminService.t_proDelete(id);
    }

    @Test
    public void userdelete(){
        Integer id = 1;
        adminService.userDelete(1);
    }

    @Test
    public void findUser(){
        List<User> list = adminService.findUser();
        System.out.println(list);
    }


}