package com.cy.store.entity;

import java.io.Serializable;
import java.util.Objects;

public class Vegetable implements Serializable {
    private Integer id;
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vegetable vegetable = (Vegetable) o;
        return Objects.equals(id, vegetable.id) &&
                Objects.equals(Head, vegetable.Head) &&
                Objects.equals(m1, vegetable.m1) &&
                Objects.equals(m2, vegetable.m2) &&
                Objects.equals(m3, vegetable.m3) &&
                Objects.equals(m4, vegetable.m4) &&
                Objects.equals(m5, vegetable.m5) &&
                Objects.equals(m6, vegetable.m6) &&
                Objects.equals(m7, vegetable.m7) &&
                Objects.equals(m8, vegetable.m8) &&
                Objects.equals(Harvest, vegetable.Harvest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Head, m1, m2, m3, m4, m5, m6, m7, m8, Harvest);
    }

    @Override
    public String toString() {
        return "Vegetable{" +
                "id=" + id +
                ", Head='" + Head + '\'' +
                ", m1='" + m1 + '\'' +
                ", m2='" + m2 + '\'' +
                ", m3='" + m3 + '\'' +
                ", m4='" + m4 + '\'' +
                ", m5='" + m5 + '\'' +
                ", m6='" + m6 + '\'' +
                ", m7='" + m7 + '\'' +
                ", m8='" + m8 + '\'' +
                ", Harvest='" + Harvest + '\'' +
                '}';
    }
}
