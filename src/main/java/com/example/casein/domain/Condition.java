package com.example.casein.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Condition {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCondition;
    //Давление станка
    private Integer P;
    //Напряжение станка
    private Integer U;
    //Скорость вращения
    private Integer W;
    //Номер станка
    @ManyToOne (cascade=CascadeType.ALL)
    @JoinColumn (name = "id_machine_con")
    private Machine id;
    //Дата последней диагностики
    private Date datediag;

    public Condition() {
    }

    public Condition(Integer p, Integer u, Integer w, Machine id) {
        P = p;
        U = u;
        W = w;
        this.id = id;
    }

    public Machine getId() {
        return id;
    }

    public void setId(Machine id) {
        this.id = id;
    }

    public Integer getIdCondition() {
        return idCondition;
    }

    public void setIdCondition(Integer idCondition) {
        this.idCondition = idCondition;
    }

    public Integer getP() {
        return P;
    }

    public void setP(Integer p) {
        P = p;
    }

    public Integer getU() {
        return U;
    }

    public void setU(Integer u) {
        U = u;
    }

    public Integer getW() {
        return W;
    }

    public void setW(Integer w) {
        W = w;
    }

    public Date getDatediag() {
        return datediag;
    }

    public void setDatediag(Date datediag) {
        this.datediag = datediag;
    }
}

