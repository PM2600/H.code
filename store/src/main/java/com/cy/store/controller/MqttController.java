package com.cy.store.controller;

import com.cy.store.service.IMqttSender;
import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;


@Controller
//@RequestMapping(value = "/")
@RequestMapping("/mq")
public class MqttController {

    /**
     * 注入发送MQTT的Bean
     */
    @Resource
    private IMqttSender iMqttSender;

    /**
     * 发送MQTT消息
     * @param message 消息内容
     * @return 返回
     */
//    @ResponseBody
//    @GetMapping(value = "/mqtt")
//    public ResponseEntity<String> sendMqtt(@RequestParam(value = "msg") String message) {
//        iMqttSender.sendToMqtt(message);
//        // iMqttSender.sen
//        return new ResponseEntity<>("OK", HttpStatus.OK);
//    }

    @ResponseBody
    @GetMapping("/mqtt")
    public ResponseEntity<String> sendMqtt(String message) {
        iMqttSender.sendToMqtt(message);
        // iMqttSender.sen
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    //请求牲畜图片
    @ResponseBody
    @GetMapping("/LiveIm1")
    public ResponseEntity<String> sendToMqttLv1(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);

        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv1(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm2")
    public ResponseEntity<String> sendToMqttLv2(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv2(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm3")
    public ResponseEntity<String> sendToMqttLv3(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv3(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm4")
    public ResponseEntity<String> sendToMqttLv4(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv4(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm5")
    public ResponseEntity<String> sendToMqttLv5(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv5(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm6")
    public ResponseEntity<String> sendToMqttLv6(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv6(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm7")
    public ResponseEntity<String> sendToMqttLv7(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv7(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm8")
    public ResponseEntity<String> sendToMqttLv8(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv8(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm9")
    public ResponseEntity<String> sendToMqttLv9(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv9(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm10")
    public ResponseEntity<String> sendToMqttLv10(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv10(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm11")
    public ResponseEntity<String> sendToMqttLv11(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv11(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm12")
    public ResponseEntity<String> sendToMqttLv12(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv12(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm13")
    public ResponseEntity<String> sendToMqttLv13(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv13(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm14")
    public ResponseEntity<String> sendToMqttLv14(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv14(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm15")
    public ResponseEntity<String> sendToMqttLv15(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv15(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm16")
    public ResponseEntity<String> sendToMqttLv16(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv16(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm17")
    public ResponseEntity<String> sendToMqttLv17(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv17(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm18")
    public ResponseEntity<String> sendToMqttLv18(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv18(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm19")
    public ResponseEntity<String> sendToMqttLv19(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv19(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm20")
    public ResponseEntity<String> sendToMqttLv20(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv20(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm21")
    public ResponseEntity<String> sendToMqttLv21(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv21(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm22")
    public ResponseEntity<String> sendToMqttLv22(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv22(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm23")
    public ResponseEntity<String> sendToMqttLv23(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv23(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/LiveIm24")
    public ResponseEntity<String> sendToMqttLv24(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttLv24(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }
    @ResponseBody
    @GetMapping("/slIm")
    public ResponseEntity<String> sendToMqttsl(Integer id, Integer stage) {
        Map<String,Object> map = new HashMap<>();
        map.put("id", id);
        map.put("stage", stage);
        JSONObject j = new JSONObject(map);
        String message = j.toString();
        iMqttSender.sendToMqttsl(message);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

}