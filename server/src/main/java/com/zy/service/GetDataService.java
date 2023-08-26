package com.zy.service;

import com.zy.model.NO1Data;
import com.zy.model.NO2Data;

import java.util.List;

public interface GetDataService {

    List<NO1Data> GetNO1(String DeviceID, Integer limit);

    List<NO2Data> GetNO2(String DeviceID, Integer limit);
}
