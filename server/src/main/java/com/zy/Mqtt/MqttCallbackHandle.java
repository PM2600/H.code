package com.zy.Mqtt;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.zy.mapper.SaveMapper;
import com.zy.model.Data;
import com.zy.model.NO1Data;
import com.zy.model.NO2Data;
import com.zy.service.IMqttSender;
import com.zy.service.SaveService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.*;

@Service
public class MqttCallbackHandle {

    @Autowired
    private SaveService saveService;

    @Autowired
    private SaveMapper saveMapper;

    private static final Logger logger = LoggerFactory.getLogger(MqttCallbackHandle.class);

    @Resource
    private IMqttSender iMqttSender;


    public void handle(Message<?> message){

        String str = message.getPayload().toString();

        try {
            Data da = new ObjectMapper().readValue(str, Data.class);

            if(da.getSequence().equals("NO.1")){
                NO1Data no1Data = new NO1Data();

                no1Data.setId(da.getId());
                no1Data.setDate(da.getDate());
                no1Data.setST(da.getST());
                no1Data.setSM(da.getSM());
                no1Data.setCDC(da.getCD());
                no1Data.setLI(da.getLI());
                no1Data.setAT(da.getAT());
                no1Data.setAH(da.getAH());
                no1Data.setPM25(da.getPM25());

                System.out.println("收到第一序列数据");

                saveService.SaveNO1(no1Data);

            }else if(da.getSequence().equals("NO.2")){
                NO2Data no2Data = new NO2Data();

                no2Data.setId(da.getId());
                no2Data.setDate(da.getDate());
                no2Data.setSF(da.getSF());
                no2Data.setECOS(da.getECOS());

                System.out.println("收到第二序列数据");

                saveService.SaveNO2(no2Data);

            }
        } catch (JsonProcessingException e) {
            e.printStackTrace();
            // 处理JSON解析异常
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}