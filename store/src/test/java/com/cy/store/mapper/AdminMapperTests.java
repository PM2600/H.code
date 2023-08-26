package com.cy.store.mapper;

import com.cy.store.entity.*;
import com.cy.store.vo.CartVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminMapperTests {
    @Autowired
    private AdminMapper adminMapper;

    @Test
    public void findByUsername() {
        String username = "小明";
        Admin admin = adminMapper.findAdByUsername(username);
        System.out.println(admin);
    }

    @Test
    public void t_proInsertveId() {
        VePhoto vp = new VePhoto();
        Integer id = 11;
        vp.setId(id);
        adminMapper.t_proInsertveId(vp);
    }

    @Test
    public void ve_Insert(){
        Vegetable vege = new Vegetable();
        vege.setId(66);
        adminMapper.ve_Insert(vege);
    }

    @Test
    public void findPro(){
        List<Product> list = adminMapper.findPro();
        System.out.println(list);
    }
}
