package com.cy.store.service.impl;

import com.cy.store.entity.LvPhoto;
import com.cy.store.mapper.LvPhotoMapper;
import com.cy.store.service.ILvPhotoService;
import com.cy.store.vo.LiveSourceVO;
import com.cy.store.vo.LvVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LvPhotoServiceImpl implements ILvPhotoService {
    @Autowired
    private LvPhotoMapper lvPhotoMapper;

    @Override
    public LvVO showLvById(Integer id) {
        LvVO lvPhoto = lvPhotoMapper.showLvById(id);
        return lvPhoto;
    }

    @Override
    public LiveSourceVO showSourceById1(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById1(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById2(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById2(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById3(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById3(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById4(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById4(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById5(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById5(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById6(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById6(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById7(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById7(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById8(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById8(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById9(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById9(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById10(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById10(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById11(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById11(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById12(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById12(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById13(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById13(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById14(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById14(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById15(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById15(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById16(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById16(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById17(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById17(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById18(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById18(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById19(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById19(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById20(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById20(id);
        return result;    }

    @Override
    public LiveSourceVO showSourceById21(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById21(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById22(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById22(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById23(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById23(id);
        return result;
    }

    @Override
    public LiveSourceVO showSourceById24(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSourceById24(id);
        return result;
    }

    @Override
    public LiveSourceVO showSlSourceById(Integer id) {
        LiveSourceVO result = lvPhotoMapper.showSlSourceById(id);
        return result;
    }
}