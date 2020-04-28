package com.example.casein.domain;

import javax.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
public class Machine {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    //Дата установки станка
    private Date installation_date;
    //Статус станка (Какая-то информация от аналитики по грядущим ремонтным работам)
    private String status;
    //Флаг простоя
    private Boolean on_off;




    public Machine() {
    }

    public Machine(Integer id, String status, Boolean on_off) {
        this.id = id;
        this.status = status;
        this.on_off = on_off;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getInstallation_date() {
        return installation_date;
    }

    public void setInstallation_date(Date installation_date) {
        this.installation_date = installation_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getOn_off() {
        return on_off;
    }

    public void setOn_off(Boolean on_off) {
        this.on_off = on_off;
    }
}
