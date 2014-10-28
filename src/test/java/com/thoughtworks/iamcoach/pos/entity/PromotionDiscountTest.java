package com.thoughtworks.iamcoach.pos.entity;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PromotionDiscountTest {
    @Test
    public void should_return_money_with_a_discount_promotion() {
        PromotionDiscount promotionDiscount = new PromotionDiscount();
        CartItem cartItem = new CartItem(new Item(1,"ITEM000001","麦斯威尔","盒",17,2),2,"全球美食");
        assertThat(promotionDiscount.calculate(cartItem)).isEqualTo(0);
    }
}
