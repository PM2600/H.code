package com.cy.store.entity;

import java.io.Serializable;
import java.util.Objects;

public class VePhoto extends BaseEntity implements Serializable {
    private Integer id;
    private String str_1;
    private String str_2;
    private String str_3;
    private String str_4;
    private String str_5;
    private String str_6;
    private String str_7;
    private String str_8;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        VePhoto that = (VePhoto) o;
        return Objects.equals(id, that.id) &&
                Objects.equals(str_1, that.str_1) &&
                Objects.equals(str_2, that.str_2) &&
                Objects.equals(str_3, that.str_3) &&
                Objects.equals(str_4, that.str_4) &&
                Objects.equals(str_5, that.str_5) &&
                Objects.equals(str_6, that.str_6) &&
                Objects.equals(str_7, that.str_7) &&
                Objects.equals(str_8, that.str_8);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, str_1, str_2, str_3, str_4, str_5, str_6, str_7, str_8);
    }

    @Override
    public String toString() {
        return "VegetablePhoto{" +
                "id=" + id +
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
