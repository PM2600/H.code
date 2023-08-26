package com.cy.store.Mqtt;

//import com.jiakong.mappers.AreaMapper;
import com.cy.store.controller.ex.*;
import com.cy.store.entity.Jsonqu;
import com.cy.store.mapper.AdminMapper;
import com.cy.store.service.IAdminService;
import com.cy.store.service.IMqttSender;
//import com.cy.store.util.TopicContants;
//import net.sf.json.JSONArray;
//import net.sf.json.JSONObject;
import com.cy.store.util.JsonResult;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.eclipse.paho.client.mqttv3.MqttMessage;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.system.ApplicationHome;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.util.*;


@Service
public class MqttCallbackHandle {

    @Autowired
    private IAdminService adminService;
    @Autowired
    private AdminMapper adminMapper;

    private static final Logger logger = LoggerFactory.getLogger(MqttCallbackHandle.class);

//    @Resource
//    private IMqttSender iMqttSender;
//    public void handle(String topic, String payload){
//        logger.info("MqttCallbackHandle:" + topic + "---"+ payload);
//        // 根据topic分别进行消息处理。
//        if (topic.equalsIgnoreCase("topic1")){
//        }
//    }
    /** 文件大小的上限值(10MB) */
    public static final int AVATAR_MAX_SIZE = 10 * 1024 * 1024;
    /** 允许上传的的文件类型 */
    public static final List<String> AVATAR_TYPES = new ArrayList<String>();

    /** 初始化允许上传的的文件类型 */
    static {
        AVATAR_TYPES.add("image/jpeg");
        AVATAR_TYPES.add("image/png");
        AVATAR_TYPES.add("image/bmp");
        AVATAR_TYPES.add("image/gif");
    }

    @Resource
    private IMqttSender iMqttSender;
    public void handle(Message<?> message){

        String str = message.getPayload().toString();

        try {
            Jsonqu js = new ObjectMapper().readValue(str, Jsonqu.class);
            String base64 = js.getFile();

            ApplicationHome ah = new ApplicationHome(getClass());
            File file3 = ah.getSource();
            String parent = file3.getParentFile()+"/Lsource".toString();
            File dir = new File(parent);
            if (!dir.exists()) {
                dir.mkdirs();
            }


            // 图片分类路径+图片名+图片后缀
            String imgClassPath = UUID.randomUUID().toString().concat(".jpg");

            // 去掉base64前缀 data:image/jpeg;base64,
            base64 = base64.substring(base64.indexOf(",", 1) + 1);
            // 解密，解密的结果是一个byte数组
            Base64.Decoder decoder = Base64.getDecoder();
            byte[] imgbytes = decoder.decode(base64);
            for (int i = 0; i < imgbytes.length; ++i) {
                if (imgbytes[i] < 0) {
                    imgbytes[i] += 256;
                }
            }
            File dest = new File(dir, imgClassPath);
            // 保存图片
            OutputStream out = new FileOutputStream(dest);
            out.write(imgbytes);
            out.flush();
            out.close();

            String Image = "/Lsource/" + imgClassPath;

            switch (js.getStage()){
                case 1:
                    adminService.updateLivestockPhoto1(js.getId(), Image);
                    adminMapper.updateLvTime1(js.getId(), js.getTime());
                    break;
                case 2:
                    adminService.updateLivestockPhoto2(js.getId(), Image);
                    adminMapper.updateLvTime2(js.getId(), js.getTime());
                    break;
                case 3:
                    adminService.updateLivestockPhoto3(js.getId(), Image);
                    adminMapper.updateLvTime3(js.getId(), js.getTime());
                    break;
                case 4:
                    adminService.updateLivestockPhoto4(js.getId(), Image);
                    adminMapper.updateLvTime4(js.getId(), js.getTime());
                    break;
                case 5:
                    adminService.updateLivestockPhoto5(js.getId(), Image);
                    adminMapper.updateLvTime5(js.getId(), js.getTime());
                    break;
                case 6:
                    adminService.updateLivestockPhoto6(js.getId(), Image);
                    adminMapper.updateLvTime6(js.getId(), js.getTime());
                    break;
                case 7:
                    adminService.updateLivestockPhoto7(js.getId(), Image);
                    adminMapper.updateLvTime7(js.getId(), js.getTime());
                    break;
                case 8:
                    adminService.updateLivestockPhoto8(js.getId(), Image);
                    adminMapper.updateLvTime8(js.getId(), js.getTime());
                    break;
                case 9:
                    adminService.updateLivestockPhoto9(js.getId(), Image);
                    adminMapper.updateLvTime9(js.getId(), js.getTime());
                    break;
                case 10:
                    adminService.updateLivestockPhoto10(js.getId(), Image);
                    adminMapper.updateLvTime10(js.getId(), js.getTime());
                    break;
                case 11:
                    adminService.updateLivestockPhoto11(js.getId(), Image);
                    adminMapper.updateLvTime11(js.getId(), js.getTime());
                    break;
                case 12:
                    adminService.updateLivestockPhoto12(js.getId(), Image);
                    adminMapper.updateLvTime12(js.getId(), js.getTime());
                    break;
                case 13:
                    adminService.updateLivestockPhoto13(js.getId(), Image);
                    adminMapper.updateLvTime13(js.getId(), js.getTime());
                    break;
                case 14:

                    adminService.updateLivestockPhoto14(js.getId(), Image);
                    adminMapper.updateLvTime14(js.getId(), js.getTime());
                    break;
                case 15:

                    adminService.updateLivestockPhoto15(js.getId(), Image);
                    adminMapper.updateLvTime15(js.getId(), js.getTime());
                    break;
                case 16:

                    adminService.updateLivestockPhoto16(js.getId(), Image);
                    adminMapper.updateLvTime16(js.getId(), js.getTime());
                    break;
                case 17:

                    adminService.updateLivestockPhoto17(js.getId(), Image);
                    adminMapper.updateLvTime17(js.getId(), js.getTime());
                    break;
                case 18:
                    adminService.updateLivestockPhoto18(js.getId(), Image);
                    adminMapper.updateLvTime18(js.getId(), js.getTime());
                    break;
                case 19:
                    adminService.updateLivestockPhoto19(js.getId(), Image);
                    adminMapper.updateLvTime19(js.getId(), js.getTime());
                    break;
                case 20:
                    adminService.updateLivestockPhoto20(js.getId(), Image);
                    adminMapper.updateLvTime20(js.getId(), js.getTime());
                    break;
                case 21:
                    adminService.updateLivestockPhoto21(js.getId(), Image);
                    adminMapper.updateLvTime21(js.getId(), js.getTime());
                    break;
                case 22:
                    adminService.updateLivestockPhoto22(js.getId(), Image);
                    adminMapper.updateLvTime22(js.getId(), js.getTime());
                    break;
                case 23:
                    adminService.updateLivestockPhoto23(js.getId(), Image);
                    adminMapper.updateLvTime23(js.getId(), js.getTime());
                    break;
                case 24:
                    adminService.updateLivestockPhoto24(js.getId(), Image);
                    adminMapper.updateLvTime24(js.getId(), js.getTime());
                    break;
                case 25:
                    adminService.updateSlaughter_ph(js.getId(), Image);
                    adminMapper.updateslTime(js.getId(), js.getTime());
                    adminMapper.updateslName(js.getId(), js.getName());
                    break;
            }
        } catch (JsonProcessingException | FileNotFoundException e) {
            e.printStackTrace();
            // 处理JSON解析异常
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}