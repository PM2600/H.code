package com.zy.controller;

import com.zy.model.NO1Data;
import com.zy.service.GetDayDataService;
import com.zy.util.JsonResult;
import com.zy.vo.NoDataVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("daydata")
public class GetDayDataController extends BaseController{

    @Autowired
    private GetDayDataService getDayDataService;

    @GetMapping("day")
    public JsonResult<List<NoDataVO>> getDayData(String DeviceID, String dataName, String FewDays) {
        List<NoDataVO> datas = new ArrayList<>();
        Integer few = Integer.valueOf(FewDays);

        for (int i = 0; i < few; i++) {
            Date date = new Date();//获取当前时间
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("2006-01-02T00:00:00.000");//设置格式

            Calendar calendar = Calendar.getInstance(); //创建Calendar 的实例
            calendar.add(Calendar.DAY_OF_MONTH, -1-i); //当前时间减去一天，即一天前的时间
            String BeforeFormat = simpleDateFormat.format(calendar.getTime());

            NoDataVO data = getDayDataService.GetNODayData(DeviceID, dataName, BeforeFormat);
            datas.add(data);

        }
        return new JsonResult<List<NoDataVO>>(OK, datas);
    }
}
