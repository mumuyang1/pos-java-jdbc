package com.thoughtworks.iamcoach.pos.entity;

public class Item {

    private int id;
    private String barcode;
    private String name;
    private String unit;
    private double price;
    private int categoryId;

    public Item() {
    }

    public Item(int id, String name, String barcode, String unit, double price, int categoryId) {
        this.id = id;
        this.name = name;
        this.barcode = barcode;
        this.unit = unit;
        this.price = price;
        this.categoryId = categoryId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }
}
