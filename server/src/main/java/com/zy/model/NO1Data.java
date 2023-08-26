package com.zy.model;

public class NO1Data {
    private String id;     //设备id
    private String Date;   //采集时间
    private String ST;     //土壤温度
    private String SM;     //土壤湿度
    private String CDC;    //二氧化碳浓度
    private String LI;     //光照强度
    private String AT;     //空气温度
    private String AH;     //空气湿度
    private String PM25;   //PM2.5


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getST() {
        return ST;
    }

    public void setST(String ST) {
        this.ST = ST;
    }

    public String getSM() {
        return SM;
    }

    public void setSM(String SM) {
        this.SM = SM;
    }

    public String getCDC() {
        return CDC;
    }

    public void setCDC(String CDC) {
        this.CDC = CDC;
    }

    public String getLI() {
        return LI;
    }

    public void setLI(String LI) {
        this.LI = LI;
    }

    public String getAT() {
        return AT;
    }

    public void setAT(String AT) {
        this.AT = AT;
    }

    public String getAH() {
        return AH;
    }

    public void setAH(String AH) {
        this.AH = AH;
    }

    public String getPM25() {
        return PM25;
    }

    public void setPM25(String PM25) {
        this.PM25 = PM25;
    }
}
