package com.zy.mapper;

import com.zy.model.NO1Data;
import com.zy.model.NO2Data;

public interface SaveMapper {

    Integer SaveNO1(NO1Data data);
    //Integer SaveNO1(String id, String Date, String ST, String SM, String CDC, String LI, String AT, String AH, String PM25);
    Integer SaveNO2(NO2Data data);

}
