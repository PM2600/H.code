package com.cy.store.vo;

import java.io.Serializable;
import java.util.Objects;

public class VeVO implements Serializable {
    private String Head;
    private String m1;
    private String m2;
    private String m3;
    private String m4;
    private String m5;
    private String m6;
    private String m7;
    private String m8;
    private String Harvest;
    private String str_1;
    private String str_2;
    private String str_3;
    private String str_4;
    private String str_5;
    private String str_6;
    private String str_7;
    private String str_8;
    private String certImage;

    public String getHead() {
        return Head;
    }

    public void setHead(String head) {
        Head = head;
    }

    public String getM1() {
        return m1;
    }

    public void setM1(String m1) {
        this.m1 = m1;
    }

    public String getM2() {
        return m2;
    }

    public void setM2(String m2) {
        this.m2 = m2;
    }

    public String getM3() {
        return m3;
    }

    public void setM3(String m3) {
        this.m3 = m3;
    }

    public String getM4() {
        return m4;
    }

    public void setM4(String m4) {
        this.m4 = m4;
    }

    public String getM5() {
        return m5;
    }

    public void setM5(String m5) {
        this.m5 = m5;
    }

    public String getM6() {
        return m6;
    }

    public void setM6(String m6) {
        this.m6 = m6;
    }

    public String getM7() {
        return m7;
    }

    public void setM7(String m7) {
        this.m7 = m7;
    }

    public String getM8() {
        return m8;
    }

    public void setM8(String m8) {
        this.m8 = m8;
    }

    public String getHarvest() {
        return Harvest;
    }

    public void setHarvest(String harvest) {
        Harvest = harvest;
    }

    public String getStr_1() {
        return str_1;
    }

    public void setStr_1(String str_1) {
        this.str_1 = str_1;
    }

    public String getStr_2() {
        return str_2;
    }

    public void setStr_2(String str_2) {
        this.str_2 = str_2;
    }

    public String getStr_3() {
        return str_3;
    }

    public void setStr_3(String str_3) {
        this.str_3 = str_3;
    }

    public String getStr_4() {
        return str_4;
    }

    public void setStr_4(String str_4) {
        this.str_4 = str_4;
    }

    public String getStr_5() {
        return str_5;
    }

    public void setStr_5(String str_5) {
        this.str_5 = str_5;
    }

    public String getStr_6() {
        return str_6;
    }

    public void setStr_6(String str_6) {
        this.str_6 = str_6;
    }

    public String getStr_7() {
        return str_7;
    }

    public void setStr_7(String str_7) {
        this.str_7 = str_7;
    }

    public String getStr_8() {
        return str_8;
    }

    public void setStr_8(String str_8) {
        this.str_8 = str_8;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        VeVO veVO = (VeVO) o;
        return Objects.equals(Head, veVO.Head) &&
                Objects.equals(m1, veVO.m1) &&
                Objects.equals(m2, veVO.m2) &&
                Objects.equals(m3, veVO.m3) &&
                Objects.equals(m4, veVO.m4) &&
                Objects.equals(m5, veVO.m5) &&
                Objects.equals(m6, veVO.m6) &&
                Objects.equals(m7, veVO.m7) &&
                Objects.equals(m8, veVO.m8) &&
                Objects.equals(Harvest, veVO.Harvest) &&
                Objects.equals(str_1, veVO.str_1) &&
                Objects.equals(str_2, veVO.str_2) &&
                Objects.equals(str_3, veVO.str_3) &&
                Objects.equals(str_4, veVO.str_4) &&
                Objects.equals(str_5, veVO.str_5) &&
                Objects.equals(str_6, veVO.str_6) &&
                Objects.equals(str_7, veVO.str_7) &&
                Objects.equals(str_8, veVO.str_8);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Head, m1, m2, m3, m4, m5, m6, m7, m8, Harvest, str_1, str_2, str_3, str_4, str_5, str_6, str_7, str_8);
    }

    @Override
    public String toString() {
        return "VeVO{" +
                "Head='" + Head + '\'' +
                ", m1='" + m1 + '\'' +
                ", m2='" + m2 + '\'' +
                ", m3='" + m3 + '\'' +
                ", m4='" + m4 + '\'' +
                ", m5='" + m5 + '\'' +
                ", m6='" + m6 + '\'' +
                ", m7='" + m7 + '\'' +
                ", m8='" + m8 + '\'' +
                ", Harvest='" + Harvest + '\'' +
                ", str_1='" + str_1 + '\'' +
                ", str_2='" + str_2 + '\'' +
                ", str_3='" + str_3 + '\'' +
                ", str_4='" + str_4 + '\'' +
                ", str_5='" + str_5 + '\'' +
                ", str_6='" + str_6 + '\'' +
                ", str_7='" + str_7 + '\'' +
                ", str_8='" + str_8 + '\'' +
                '}';
    }
}
