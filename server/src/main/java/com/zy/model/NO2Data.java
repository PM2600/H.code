package com.zy.model;

public class NO2Data {
    private String id;     //设备id
    private String Date;   //采集时间
    private String SF;     //土壤肥力，PH、氮、磷、钾
    private String ECOS;   //土壤电导率
    //private String SHMC;   //土壤重金属含量，铜、铅、隔

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

//    public String getSHMC() {
//        return SHMC;
//    }
//
//    public void setSHMC(String SHMC) {
//        this.SHMC = SHMC;
//    }
}
