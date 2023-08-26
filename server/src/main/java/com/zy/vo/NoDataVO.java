package com.zy.vo;

import java.io.Serializable;

public class NoDataVO implements Serializable {
    private String id;     //设备id
    private String Date;   //采集时间
    private String ST;     //土壤温度
    private String SM;     //土壤湿度
    private String CDC;    //二氧化碳浓度
    private String LI;     //光照强度
    private String AT;     //空气温度
    private String AH;     //空气湿度
    private String PM25;   //PM2.5

    private String SF;     //土壤肥力，PH、氮、磷、钾
    private String ECOS;   //土壤电导率
    private String SHMC;   //土壤重金属含量，铜、铅、隔

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

    public String getSF() {
        return SF;
    }

    public void setSF(String SF) {
        this.SF = SF;
    }

    public String getECOS() {
        return ECOS;
    }

    public void setECOS(String ECOS) {
        this.ECOS = ECOS;
    }

    public String getSHMC() {
        return SHMC;
    }

    public void setSHMC(String SHMC) {
        this.SHMC = SHMC;
    }
}
