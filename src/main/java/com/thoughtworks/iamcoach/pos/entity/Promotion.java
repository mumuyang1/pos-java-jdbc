package com.thoughtworks.iamcoach.pos.entity;

public class Promotion {

    private int id;
    private int type;
    private String description;
    private double discount;

    public Promotion() {
    }

    public Promotion(int id, int type, String description,double discount) {
        this.id = id;
        this.type = type;
        this.description = description;
        this.discount = discount;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
