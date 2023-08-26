package com.cy.store.mapper;

import com.cy.store.entity.Livestock;
import com.cy.store.entity.Pro;
import com.cy.store.entity.Product;
import com.cy.store.entity.Vegetable;
import com.cy.store.service.IProductService;
import com.cy.store.util.JsonResult;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductMapperTests {
    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private IProductService productService;

//    @Test
//    public void findHotList() {
//        List<Product> list = productMapper.findHotList();
//        System.out.println("count=" + list.size());
//        for (Product item : list) {
//            System.out.println(item);
//        }
//    }
    @Test
    public void findByName(){
        String tit = "绿色";
        List<Pro> p = productMapper.findByName(tit);
        System.out.println(p);
    }

    @Test
    public void findById() {
        Integer id = 1;
        Product result = productMapper.findById(id);
        System.out.println(result);
    }

//    @Test
//    public void findVeDetail(){
//        Integer id = 1;
//        Vegetable result = productMapper.findVeDetail(id);
//        System.out.println(result);
//    }
//
//    @Test
//    public void findLvDetail(){
//        Integer id = 1;
//        Livestock result = productMapper.findLvDetail(id);
//        System.out.println(result);
//    }

//    @Test
//    public void updateVegetablePhoto1(){
//        productMapper.updateVegetablePhoto1(1, "/A/B/C/d.png");
//    }

}
