package com.zy.service.impl;

import com.zy.mapper.SaveMapper;
import com.zy.model.NO1Data;
import com.zy.model.NO2Data;
import com.zy.service.SaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SaveServiceImpl implements SaveService {
    @Autowired
    private SaveMapper saveMapper;

    @Override
    public void SaveNO1(NO1Data data) {
        int row = saveMapper.SaveNO1(data);
    }

    @Override
    public void SaveNO2(NO2Data data) {
        int row = saveMapper.SaveNO2(data);
    }

}
