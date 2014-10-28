package com.thoughtworks.iamcoach.pos.entity;

public class CartItem {
    private Item item;
    private double count;
    private String category;

    public CartItem(Item item, double count, String category) {
        this.item = item;
        this.count = count;
        this.category = category;
    }

    public Item getItem() {
        return item;
    }

    public double getCount() {
        return count;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}

