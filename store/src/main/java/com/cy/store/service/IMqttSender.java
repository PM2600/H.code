package com.cy.store.service;

import com.cy.store.config.MqttConfig;
import org.json.JSONObject;
import org.springframework.integration.annotation.MessagingGateway;
import org.springframework.integration.mqtt.support.MqttHeaders;
import org.springframework.messaging.handler.annotation.Header;
import org.springframework.stereotype.Component;

/**
 * MQTT生产者消息发送接口
 * <p>MessagingGateway要指定生产者的通道名称</p>
 */

@Component
@MessagingGateway(defaultRequestChannel = MqttConfig.CHANNEL_NAME_OUT)
public interface IMqttSender {

    /**
     * 发送信息到MQTT服务器
     *
     * @param data 发送的文本
     */
    void sendToMqtt(String data);

    /**
     * 发送信息到MQTT服务器
     *
     * @param topic 主题
     * @param payload 消息主体
     */
    void sendToMqtt(@Header(MqttHeaders.TOPIC) String topic,
                    String payload);

    /**
     * 发送信息到MQTT服务器
     *
     * @param topic 主题
     * @param qos 对消息处理的几种机制。<br> 0 表示的是订阅者没收到消息不会再次发送，消息会丢失。<br>
     * 1 表示的是会尝试重试，一直到接收到消息，但这种情况可能导致订阅者收到多次重复消息。<br>
     * 2 多了一次去重的动作，确保订阅者收到的消息有一次。
     * @param payload 消息主体
     */
    void sendToMqtt(@Header(MqttHeaders.TOPIC) String topic,
                    @Header(MqttHeaders.QOS) int qos,
                    String payload);

    /**
     * 请求溯源牲畜图片
     * @param LivestockPhoto1
     */
    void sendToMqttLv1(String LivestockPhoto1);
    void sendToMqttLv2(String LivestockPhoto2);
    void sendToMqttLv3(String LivestockPhoto3);
    void sendToMqttLv4(String LivestockPhoto4);
    void sendToMqttLv5(String LivestockPhoto5);
    void sendToMqttLv6(String LivestockPhoto6);
    void sendToMqttLv7(String LivestockPhoto7);
    void sendToMqttLv8(String LivestockPhoto8);
    void sendToMqttLv9(String LivestockPhoto9);
    void sendToMqttLv10(String LivestockPhoto10);
    void sendToMqttLv11(String LivestockPhoto11);
    void sendToMqttLv12(String LivestockPhoto12);
    void sendToMqttLv13(String LivestockPhoto13);
    void sendToMqttLv14(String LivestockPhoto14);
    void sendToMqttLv15(String LivestockPhoto15);
    void sendToMqttLv16(String LivestockPhoto16);
    void sendToMqttLv17(String LivestockPhoto17);
    void sendToMqttLv18(String LivestockPhoto18);
    void sendToMqttLv19(String LivestockPhoto19);
    void sendToMqttLv20(String LivestockPhoto20);
    void sendToMqttLv21(String LivestockPhoto21);
    void sendToMqttLv22(String LivestockPhoto22);
    void sendToMqttLv23(String LivestockPhoto23);
    void sendToMqttLv24(String LivestockPhoto24);
    void sendToMqttsl(String slPhoto);
}
