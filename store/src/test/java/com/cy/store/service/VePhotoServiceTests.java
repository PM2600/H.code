package com.cy.store.service;

import com.cy.store.entity.VePhoto;
import com.cy.store.mapper.VePhotoMapper;
import com.cy.store.service.ex.ServiceException;

import com.cy.store.vo.VeVO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class VePhotoServiceTests {
    @Autowired
    private IVePhotoService vePhotoService;

    @Test
    public void showVeById() {
        Integer id = 1;
        VeVO result = vePhotoService.showVeById(id);
        System.out.println(result);;
    }
}
