package com.zy.mapper;

import com.zy.vo.NoDataVO;

public interface GetDayDataMapper {

    NoDataVO GetNODayData(String DeviceID, String dataName, String BeforeFormat);

    //NoDataVO GetNO2DayData(String DeviceID, String dataName, Date BeforeFormat);
}
