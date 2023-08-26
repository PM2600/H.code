package com.zy.model;

import javax.sound.midi.Sequence;
import java.util.Date;

public class Data {
    private String Sequence;  //序列
    private String id;        //设备id
    private String Date;      //采集时间
    private String ST;        //土壤温度
    private String SM;        //土壤湿度
    private String CD;        //二氧化碳浓度
    private String LI;        //光照强度
    private String AT;        //空气温度
    private String AH;        //空气湿度
    private String PM25;      //PM2.5
    private String SF;        //土壤肥力，PH、氮、磷、钾
    private String ECOS;      //土壤电导率

    public Data(){

    }

    public Data(String Sequence, String id, String Date, String ST, String SM, String CD,
                String LI, String AT, String AH, String PM25, String SF, String ECOS) {
        this.Sequence = Sequence;
        this.id = id;
        this.Date = Date;
        this.ST = ST;
        this.SM = SM;
        this.CD = CD;
        this.LI = LI;
        this.AT = AT;
        this.AH = AH;
        this.PM25 = PM25;
        this.SF = SF;
        this.ECOS = ECOS;
    }


    public String getSequence() {
        return Sequence;
    }

    public void setSequence(String sequence) {
        Sequence = sequence;
    }

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

    public String getCD() {
        return CD;
    }

    public void setCD(String CD) {
        this.CD = CD;
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
}


