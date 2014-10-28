package com.thoughtworks.iamcoach.pos.entity;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PromotionOneFreeTest {
    @Test
    public void should_return_money_with_a_one_free_promotion() {
        PromotionOneFree promotionOneFree = new PromotionOneFree();
        CartItem cartItem = new CartItem(new Item(1,"ITEM000001","麦斯威尔","盒",17,2),2,"全球美食");
        assertThat(promotionOneFree.calculate(cartItem)).isEqualTo(0);
    }
}
