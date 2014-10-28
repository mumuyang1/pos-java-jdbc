package com.thoughtworks.iamcoach.pos.entity;


public class Pos {

    private Scanner scanner;
    private Promotion promotion;
    private double discount;

    public Pos() {
    }

    public Pos(Scanner scanner, Promotion promotion, double discount) {
        this.scanner = scanner;
        this.promotion = promotion;
        this.discount = discount;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public Promotion getPromotion() {
        return promotion;
    }

    public void setPromotion(Promotion promotion) {
        this.promotion = promotion;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
