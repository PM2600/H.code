package com.cy.store.service.impl;

import com.cy.store.mapper.VePhotoMapper;
import com.cy.store.service.IVePhotoService;
import com.cy.store.vo.VeVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VePhotoServiceImpl implements IVePhotoService {
    @Autowired
    private VePhotoMapper vePhotoMapper;

    @Override
    public VeVO showVeById(Integer id) {
        VeVO vePhoto = vePhotoMapper.showVeById(id);
        return vePhoto;
    }
}