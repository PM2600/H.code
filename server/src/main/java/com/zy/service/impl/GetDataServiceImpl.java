package com.zy.service.impl;

import com.zy.mapper.GetDataMapper;
import com.zy.model.NO1Data;
import com.zy.model.NO2Data;
import com.zy.service.GetDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetDataServiceImpl implements GetDataService {

    @Autowired
    private GetDataMapper getDataMapper;

    @Override
    public List<NO1Data> GetNO1(String DeviceID, Integer limit) {

        List<NO1Data> result = getDataMapper.GetNO1(DeviceID, limit);
//        if (result == null) {
//            // 是：抛出CartNotFoundException
//            throw new CartNotFoundException("尝试访问的购物车数据不存在");
//        }
        // 判断查询结果中的uid与参数uid是否不一致
        return result;
    }

    @Override
    public List<NO2Data> GetNO2(String DeviceID, Integer limit) {
        List<NO2Data> result = getDataMapper.GetNO2(DeviceID, limit);
        return result;
    }
}
