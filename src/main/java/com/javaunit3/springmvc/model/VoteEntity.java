package com.javaunit3.springmvc.model;

import org.hibernate.SessionFactory;

import javax.persistence.*;

@Entity
@Table(name = "Form")
public class VoteEntity
{
    @Id
    @GeneratedValue
    private Integer id;

    @Column(name = "Fiance_Name")
    private String fianceName;

    @Column(name = "Service_Length")
    private String servicelength;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFianceName() {
        return fianceName;
    }

    public void setServicelength(String servicelength) {
        this.servicelength = servicelength;
    }
}
