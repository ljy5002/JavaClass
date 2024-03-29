package org.dimigo.oop;

/*
import java.lang.String;
import java.lang.System;
*/
//java.lang 생략 가능
public class Car3 {
    private String company;
    private String model;
    private String color;
    private int price;
    private int maxSpeed;

    public Car3() {
    }

    public Car3(String company, String model, String color, int maxSpeed,int price) {
        this.company = company;
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
        this.price = price;

    }

    public Car3(String company, String model, String color, int maxSpeed) {
        this(company, model, color,maxSpeed,0);
    }

    public Car3(String company, String model, String color) {
        this(company, model,color,0,0);
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}