package com.zy.mapper;

import com.zy.model.NO1Data;
import com.zy.model.NO2Data;

import java.util.Date;
import java.util.List;

public interface GetDataMapper {

    List<NO1Data> GetNO1(String DeviceID, Integer limit);

    List<NO2Data> GetNO2(String DeviceID, Integer limit);
}
