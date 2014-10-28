package com.thoughtworks.iamcoach.pos.entity;

public class PromotionDiscount extends Promotion{

    @Override
    public double calculate(CartItem cartItem) {
        return 0;
    }
}
