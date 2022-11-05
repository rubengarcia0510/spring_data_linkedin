package com.example.jpa.domain;

import javax.persistence.*;

@Entity
@Table(name = "staff")
public class Staff {
    @Id
    @GeneratedValue
    private Integer id;

    @Embedded
    private Person member;

    public Staff() {
    }

    public Staff(Person member) {
        this.member = member;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}