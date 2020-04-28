package com.example.casein.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Repair {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idRepair;

    //Приоритет ремонтной работы
    private Integer priority;
    //Статус ремонтной работы (сообщение получено, выполняется, выполнено,
    private String status;
    //Описание работы
    private String description;
    //Номер станка
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn (name = "id_machine")
    private Machine id;
    //ФИО ремонтного рабочего
    @ManyToOne(cascade=CascadeType.ALL)
    @JoinColumn (name = "fio")
    private User username;
    //Дата отправки заявки
    private Date date;

    public Repair() {
    }

    public Repair(Integer priority, String status, String description, Machine id, User username) {
        this.priority = priority;
        this.status = status;
        this.description = description;
        this.id = id;
        this.username = username;
    }

    public Machine getId() {
        return id;
    }

    public void setId(Machine id) {
        this.id = id;
    }

    public Integer getIdRepair() {
        return idRepair;
    }

    public void setIdRepair(Integer id) {
        this.idRepair = id;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUsername() {
        return username;
    }

    public void setUsername(User username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}

