package com.zy.service.impl;

import com.zy.mapper.GetDayDataMapper;
import com.zy.model.NO1Data;
import com.zy.model.NO2Data;
import com.zy.service.GetDayDataService;
import com.zy.vo.NoDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class GetDayDataServiceImpl implements GetDayDataService {

    @Autowired
    private GetDayDataMapper getDayDataMapper;

    @Override
    public NoDataVO GetNODayData(String DeviceID, String dataName, String BeforeFormat) {
        NoDataVO result = getDayDataMapper.GetNODayData(DeviceID, dataName, BeforeFormat);
        return result;
    }

//    @Override
//    public NoDataVO GetNO2DayData(String DeviceID, String dataName, Date BeforeFormat) {
//        NoDataVO result = getDayDataMapper.GetNO2DayData(DeviceID, dataName, BeforeFormat);
//        return result;
//    }
}
