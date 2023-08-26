package com.zy.controller;

import com.zy.mapper.SaveMapper;
import com.zy.model.NO1Data;
import com.zy.model.NO2Data;
import com.zy.service.GetDataService;
import com.zy.util.JsonResult;
import org.eclipse.core.internal.runtime.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
@RequestMapping("getdata")
public class GetDataController extends BaseController{

    @Autowired
    private SaveMapper saveMapper;

    @Autowired
    private GetDataService getDataService;

    @GetMapping("NO1")
    public JsonResult<List<NO1Data>> getNO1Data(String DeviceID, Integer limit) {
        List<NO1Data> data = getDataService.GetNO1(DeviceID, limit);
        // 返回成功与数据
        return new JsonResult<List<NO1Data>>(OK, data);
    }

    @GetMapping("NO2")
    public JsonResult<List<NO2Data>> getNO2Data(String DeviceID, Integer limit) {
        List<NO2Data> data = getDataService.GetNO2(DeviceID, limit);
        // 返回成功与数据
        return new JsonResult<List<NO2Data>>(OK, data);
    }

//    @RequestMapping("save")
//    public JsonResult<Void> add(){
//        NO1Data data = new NO1Data();
//        String id = "t";
//        String Date = "t";
//        String ST = "t";
//        String SM = "t";
//        String CDC = "t";
//        String LI = "t";
//        String AT = "t";
//        String AH = "t";
//        String PM25 = "t";
//
//        saveMapper.SaveNO1(id, Date, ST, SM, CDC, LI, AT, AH, PM25);
//        return new JsonResult<Void>(OK);
//    }
}
