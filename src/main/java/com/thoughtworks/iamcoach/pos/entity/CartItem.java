package com.thoughtworks.iamcoach.pos.entity;

public class CartItem {
    private Item item;
    private double count;
    private int category;

    public CartItem(Item item, double count, int category) {
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

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }
}

