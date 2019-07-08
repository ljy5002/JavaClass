package org.dimigo.oop;
/*
import java.lang.String;
import java.lang.System;
*/
//java.lang 생략 가능
public class CAR {

    public CAR() {
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setMaxSpeed(int maxSpeed){
        this.maxSpeed = maxSpeed;
    }


    private String company;

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getPrice() {
        return price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private String model;
    private String color;
    private int price;
    private int maxSpeed;

}