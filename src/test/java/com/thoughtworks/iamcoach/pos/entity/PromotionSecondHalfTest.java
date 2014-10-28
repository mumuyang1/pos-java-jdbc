package com.thoughtworks.iamcoach.pos.entity;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PromotionSecondHalfTest {

    @Test
    public void should_return_money_with_a_second_half_money_promotion() {
        PromotionSecondHalf promotionSecondHalf = new PromotionSecondHalf();
        CartItem cartItem = new CartItem(new Item(1,"ITEM000001","麦斯威尔","盒",17,2),2,"全球美食");
        assertThat(promotionSecondHalf.calculate(cartItem)).isEqualTo(0);
    }

}