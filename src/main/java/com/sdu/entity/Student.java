package com.sdu.entity;

import java.util.Date;

public class Student {
    private Integer stduentId;

    private String stduentName;

    private Byte stduentSex;

    private Date stduentBirthday;

    private Byte state;

    private Date createTime;

    private Date updateTime;

    public Integer getStduentId() {
        return stduentId;
    }

    public void setStduentId(Integer stduentId) {
        this.stduentId = stduentId;
    }

    public String getStduentName() {
        return stduentName;
    }

    public void setStduentName(String stduentName) {
        this.stduentName = stduentName;
    }

    public Byte getStduentSex() {
        return stduentSex;
    }

    public void setStduentSex(Byte stduentSex) {
        this.stduentSex = stduentSex;
    }

    public Date getStduentBirthday() {
        return stduentBirthday;
    }

    public void setStduentBirthday(Date stduentBirthday) {
        this.stduentBirthday = stduentBirthday;
    }

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}