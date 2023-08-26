package com.cy.store.service;

import com.cy.store.entity.LvPhoto;
import com.cy.store.entity.VePhoto;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class LvPhotoServiceTests {
    @Autowired
    private ILvPhotoService lvPhotoService;

//    @Test
//    public void showVeById() {
//        LvPhoto lvPhoto = lvPhotoService.showLvById(1);
//        System.out.println(lvPhoto );;
//    }
}
