package com.zy.service;

import com.zy.model.NO1Data;
import com.zy.model.NO2Data;
import com.zy.vo.NoDataVO;

import java.util.Date;
import java.util.List;

public interface GetDayDataService {

    NoDataVO GetNODayData(String DeviceID, String dataName, String BeforeFormat);

    //NoDataVO GetNO2DayData(String DeviceID, String dataName, Date BeforeFormat);

}
