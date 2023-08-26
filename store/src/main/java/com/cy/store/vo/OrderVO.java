package com.cy.store.vo;

import java.util.Objects;

/** 订单数据的Value Object类 */
public class OrderVO {
    private Integer oid;
    private Integer uid;
    private Integer pid;
    private String recv_name;
    private String recv_phone;
    private Double total_price;
    private String order_time;
    private String title;
    private Integer price;
    private Integer num;

    public Integer getOid() {
        return oid;
    }

    public void setOid(Integer oid) {
        this.oid = oid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getRecv_name() {
        return recv_name;
    }

    public void setRecv_name(String recv_name) {
        this.recv_name = recv_name;
    }

    public String getRecv_phone() {
        return recv_phone;
    }

    public void setRecv_phone(String recv_phone) {
        this.recv_phone = recv_phone;
    }

    public Double getTotal_price() {
        return total_price;
    }

    public void setTotal_price(Double total_price) {
        this.total_price = total_price;
    }

    public String getOrder_time() {
        return order_time;
    }

    public void setOrder_time(String order_time) {
        this.order_time = order_time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderVO orderVO = (OrderVO) o;
        return Objects.equals(oid, orderVO.oid) &&
                Objects.equals(uid, orderVO.uid) &&
                Objects.equals(pid, orderVO.pid) &&
                Objects.equals(recv_name, orderVO.recv_name) &&
                Objects.equals(recv_phone, orderVO.recv_phone) &&
                Objects.equals(total_price, orderVO.total_price) &&
                Objects.equals(order_time, orderVO.order_time) &&
                Objects.equals(title, orderVO.title) &&
                Objects.equals(price, orderVO.price) &&
                Objects.equals(num, orderVO.num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid, uid, pid, recv_name, recv_phone, total_price, order_time, title, price, num);
    }

    @Override
    public String toString() {
        return "OrderVO{" +
                "oid=" + oid +
                ", uid=" + uid +
                ", pid=" + pid +
                ", recv_name='" + recv_name + '\'' +
                ", recv_phone='" + recv_phone + '\'' +
                ", total_price=" + total_price +
                ", order_time='" + order_time + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", num=" + num +
                '}';
    }
}
