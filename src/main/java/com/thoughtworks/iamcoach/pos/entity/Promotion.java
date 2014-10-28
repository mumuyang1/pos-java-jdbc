package com.thoughtworks.iamcoach.pos.entity;

public abstract class Promotion {

    private int id;
    private int type;
    private String description;

    public Promotion() {
    }

    public Promotion(int id, int type, String description) {
        this.id = id;
        this.type = type;
        this.description = description;
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

    public abstract double calculate(CartItem cartItem);
}
