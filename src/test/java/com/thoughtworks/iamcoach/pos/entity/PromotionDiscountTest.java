package com.thoughtworks.iamcoach.pos.entity;

import com.thoughtworks.iamcoach.pos.service.ItemService;
import com.thoughtworks.iamcoach.pos.service.ItemServiceImpl;
import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PromotionDiscountTest {
    @Test
    public void should_return_money_with_a_discount_promotion() {
        PromotionDiscount promotionDiscount = new PromotionDiscount();
        ItemService itemServiceImpl = new ItemServiceImpl();
        Item item = itemServiceImpl.getItem("ITEM000005");
        CartItem cartItem = new CartItem(item, 5);
        assertThat(promotionDiscount.calculate(cartItem)).isEqualTo(127.5);
    }
}
