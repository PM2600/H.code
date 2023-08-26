package com.cy.store.entity;

import java.io.Serializable;
import java.util.Objects;

public class Admin implements Serializable {
    private Integer uid;
    private String username;
    private String password;
    private Integer errCount;
    private Integer errTime;

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getErrCount() {
        return errCount;
    }

    public void setErrCount(Integer errCount) {
        this.errCount = errCount;
    }

    public Integer getErrTime() {
        return errTime;
    }

    public void setErrTime(Integer errTime) {
        this.errTime = errTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Admin admin = (Admin) o;
        return Objects.equals(uid, admin.uid) &&
                Objects.equals(username, admin.username) &&
                Objects.equals(password, admin.password) &&
                Objects.equals(errCount, admin.errCount) &&
                Objects.equals(errTime, admin.errTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uid, username, password, errCount, errTime);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "uid=" + uid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", errCount=" + errCount +
                ", errTime=" + errTime +
                '}';
    }
}
