package com.cy.store.mapper;

import com.zy.StoreApplication;
import com.zy.mapper.GetDataMapper;
import com.zy.model.NO1Data;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;
import java.util.List;

// @RunWith(SpringRunner.class)注解是一个测试启动器，可以加载Springboot测试注解
@RunWith(SpringRunner.class)
@SpringBootTest(classes = StoreApplication.class)
public class GetDataTests {

    @Autowired
    private GetDataMapper getDataMapper;

    @Test
    public void GetData(){
        String DeviceID = "46";
        Integer limit = 2;
        List<NO1Data> result = getDataMapper.GetNO1(DeviceID, limit);
        System.out.println(result);
    }
}

