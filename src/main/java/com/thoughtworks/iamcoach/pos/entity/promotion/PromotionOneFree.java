package com.thoughtworks.iamcoach.pos.entity.promotion;

import com.thoughtworks.iamcoach.pos.entity.CartItem;

public class PromotionOneFree extends Promotion {
    @Override
    public double calculate(CartItem cartItem) {

        return (cartItem.getCount() - (int) (cartItem.getCount() / 3)) * cartItem.getItem().getPrice();
    }
}
