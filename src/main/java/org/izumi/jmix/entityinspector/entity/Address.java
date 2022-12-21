package org.izumi.jmix.entityinspector.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import io.jmix.core.metamodel.annotation.JmixEntity;

@JmixEntity
@Embeddable
public class Address {
    @Column(name = "STREET")
    private String street;

    @Column(name = "HOUSE")
    private String house;

    public String getHouse() {
        return house;
    }

    public void setHouse(String house) {
        this.house = house;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }
}