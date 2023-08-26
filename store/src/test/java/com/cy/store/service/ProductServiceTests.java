package com.cy.store.service;

import com.cy.store.entity.Livestock;
import com.cy.store.entity.Pro;
import com.cy.store.entity.Product;
import com.cy.store.entity.Vegetable;
import com.cy.store.mapper.AdminMapper;
import com.cy.store.mapper.ProductMapper;
import com.cy.store.mapper.UserMapper;
import com.cy.store.service.ex.InsertException;
import com.cy.store.service.ex.ProductNotFoundException;
import com.cy.store.service.ex.ServiceException;
import com.cy.store.util.JsonResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTests {
    @Autowired
    private IProductService productService;

    @Autowired
    private AdminMapper adminMapper;

    @Autowired
    private ProductMapper productMapper;



    @Test
    public void getKind() {
        try {
            Integer id = 101;
            Product result = productService.findById(id);
            System.out.println(result);
            ApplicationHome ah = new ApplicationHome(getClass());
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }

    @Test
    public void findById() {
        try {
            Integer id = 1;
            Product result = productService.findById(id);
            System.out.println(result);
        } catch (ServiceException e) {
            System.out.println(e.getClass().getSimpleName());
            System.out.println(e.getMessage());
        }
    }


//    @Test
//    public void findVeDetail(){
//        Integer id = 1;
//        Vegetable res = productService.findVeDetail(id);
//        System.out.println(res);
//    }
//
//    @Test
//    public void findLvDetail(){
//        Integer id = 1;
//        Livestock res = productService.findLvDetail(id);
//        System.out.println(res);
//    }
    @Test
    public void findByName(){
        String tit = "绿色";
        List<Pro> list = productService.findByName(tit);
        System.out.println(list);
    }

}
