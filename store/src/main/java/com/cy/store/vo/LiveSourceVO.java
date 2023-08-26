package com.cy.store.vo;

import java.io.Serializable;
import java.util.Date;

public class LiveSourceVO implements Serializable {
    private String photo;
    private Date time;
    private String slname;

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSlname() {
        return slname;
    }

    public void setSlname(String slname) {
        this.slname = slname;
    }
}
