package com.cy.store.entity;

import java.util.Objects;

public class Livestock {
    private Integer id;
    private String s1;
    private String s2;
    private String s3;
    private String s4;
    private String s5;
    private String s6;
    private String s7;
    private String s8;
    private String s9;
    private String s10;
    private String s11;
    private String s12;
    private String s13;
    private String s14;
    private String s15;
    private String s16;
    private String s17;
    private String s18;
    private String s19;
    private String s20;
    private String s21;
    private String s22;
    private String s23;
    private String s24;
    private String slaughter_tm;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getS1() {
        return s1;
    }

    public void setS1(String s1) {
        this.s1 = s1;
    }

    public String getS2() {
        return s2;
    }

    public void setS2(String s2) {
        this.s2 = s2;
    }

    public String getS3() {
        return s3;
    }

    public void setS3(String s3) {
        this.s3 = s3;
    }

    public String getS4() {
        return s4;
    }

    public void setS4(String s4) {
        this.s4 = s4;
    }

    public String getS5() {
        return s5;
    }

    public void setS5(String s5) {
        this.s5 = s5;
    }

    public String getS6() {
        return s6;
    }

    public void setS6(String s6) {
        this.s6 = s6;
    }

    public String getS7() {
        return s7;
    }

    public void setS7(String s7) {
        this.s7 = s7;
    }

    public String getS8() {
        return s8;
    }

    public void setS8(String s8) {
        this.s8 = s8;
    }

    public String getS9() {
        return s9;
    }

    public void setS9(String s9) {
        this.s9 = s9;
    }

    public String getS10() {
        return s10;
    }

    public void setS10(String s10) {
        this.s10 = s10;
    }

    public String getS11() {
        return s11;
    }

    public void setS11(String s11) {
        this.s11 = s11;
    }

    public String getS12() {
        return s12;
    }

    public void setS12(String s12) {
        this.s12 = s12;
    }

    public String getS13() {
        return s13;
    }

    public void setS13(String s13) {
        this.s13 = s13;
    }

    public String getS14() {
        return s14;
    }

    public void setS14(String s14) {
        this.s14 = s14;
    }

    public String getS15() {
        return s15;
    }

    public void setS15(String s15) {
        this.s15 = s15;
    }

    public String getS16() {
        return s16;
    }

    public void setS16(String s16) {
        this.s16 = s16;
    }

    public String getS17() {
        return s17;
    }

    public void setS17(String s17) {
        this.s17 = s17;
    }

    public String getS18() {
        return s18;
    }

    public void setS18(String s18) {
        this.s18 = s18;
    }

    public String getS19() {
        return s19;
    }

    public void setS19(String s19) {
        this.s19 = s19;
    }

    public String getS20() {
        return s20;
    }

    public void setS20(String s20) {
        this.s20 = s20;
    }

    public String getS21() {
        return s21;
    }

    public void setS21(String s21) {
        this.s21 = s21;
    }

    public String getS22() {
        return s22;
    }

    public void setS22(String s22) {
        this.s22 = s22;
    }

    public String getS23() {
        return s23;
    }

    public void setS23(String s23) {
        this.s23 = s23;
    }

    public String getS24() {
        return s24;
    }

    public void setS24(String s24) {
        this.s24 = s24;
    }

    public String getSlaughter_tm() {
        return slaughter_tm;
    }

    public void setSlaughter_tm(String slaughter_tm) {
        this.slaughter_tm = slaughter_tm;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livestock livestock = (Livestock) o;
        return Objects.equals(id, livestock.id) &&
                Objects.equals(s1, livestock.s1) &&
                Objects.equals(s2, livestock.s2) &&
                Objects.equals(s3, livestock.s3) &&
                Objects.equals(s4, livestock.s4) &&
                Objects.equals(s5, livestock.s5) &&
                Objects.equals(s6, livestock.s6) &&
                Objects.equals(s7, livestock.s7) &&
                Objects.equals(s8, livestock.s8) &&
                Objects.equals(s9, livestock.s9) &&
                Objects.equals(s10, livestock.s10) &&
                Objects.equals(s11, livestock.s11) &&
                Objects.equals(s12, livestock.s12) &&
                Objects.equals(s13, livestock.s13) &&
                Objects.equals(s14, livestock.s14) &&
                Objects.equals(s15, livestock.s15) &&
                Objects.equals(s16, livestock.s16) &&
                Objects.equals(s17, livestock.s17) &&
                Objects.equals(s18, livestock.s18) &&
                Objects.equals(s19, livestock.s19) &&
                Objects.equals(s20, livestock.s20) &&
                Objects.equals(s21, livestock.s21) &&
                Objects.equals(s22, livestock.s22) &&
                Objects.equals(s23, livestock.s23) &&
                Objects.equals(s24, livestock.s24) &&
                Objects.equals(slaughter_tm, livestock.slaughter_tm);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20, s21, s22, s23, s24, slaughter_tm);
    }

    @Override
    public String toString() {
        return "Livestock{" +
                "id=" + id +
                ", s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", s5='" + s5 + '\'' +
                ", s6='" + s6 + '\'' +
                ", s7='" + s7 + '\'' +
                ", s8='" + s8 + '\'' +
                ", s9='" + s9 + '\'' +
                ", s10='" + s10 + '\'' +
                ", s11='" + s11 + '\'' +
                ", s12='" + s12 + '\'' +
                ", s13='" + s13 + '\'' +
                ", s14='" + s14 + '\'' +
                ", s15='" + s15 + '\'' +
                ", s16='" + s16 + '\'' +
                ", s17='" + s17 + '\'' +
                ", s18='" + s18 + '\'' +
                ", s19='" + s19 + '\'' +
                ", s20='" + s20 + '\'' +
                ", s21='" + s21 + '\'' +
                ", s22='" + s22 + '\'' +
                ", s23='" + s23 + '\'' +
                ", s24='" + s24 + '\'' +
                ", slaughter_tm='" + slaughter_tm + '\'' +
                '}';
    }
}
