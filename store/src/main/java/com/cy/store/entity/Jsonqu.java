package com.cy.store.entity;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.multipart.MultipartFile;

import java.io.Serializable;
import java.util.Date;

public class Jsonqu{
    private Integer id;
    private Date time;
    private Integer stage;
    private String file;
    private String name;

    public Jsonqu(Integer id, Date time, Integer stage, String file, String name) {
        this.id = id;
        this.time = time;
        this.stage = stage;
        this.file = file;
        name = name;
    }

    public Jsonqu() {
    }

    public Jsonqu(String json) throws JsonProcessingException {
        Jsonqu jsonqu = new ObjectMapper().readValue(json, Jsonqu.class);
        id = jsonqu.getId();
        time = jsonqu.getTime();
        stage = jsonqu.getStage();
        file = jsonqu.getFile();
        name = jsonqu.getName();
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    public Integer getStage() {
        return stage;
    }

    public void setStage(Integer stage) {
        this.stage = stage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
