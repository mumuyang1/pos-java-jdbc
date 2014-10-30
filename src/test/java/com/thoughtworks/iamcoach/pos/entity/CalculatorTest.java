package com.thoughtworks.iamcoach.pos.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class CalculatorTest {
    @Test
    public void should_getSubtotal_function_return_a_lowest_money() {
        Item item = new Item(1, "ITEM000001", "麦斯威尔", "盒", 17, "咖啡");

        Promotion oneFreePromotion = PromotionFactory.getPromotionByType(1);
        oneFreePromotion.setType(1);
        Promotion secondHalfPromotion = PromotionFactory.getPromotionByType(2);
        secondHalfPromotion.setType(2);
        Promotion dicountPromotion = PromotionFactory.getPromotionByType(3);
        dicountPromotion.setType(3);
        dicountPromotion.setDiscount(50);
        List<Promotion> itemPromotions = new ArrayList<Promotion>();
        itemPromotions.add(0, oneFreePromotion);
        itemPromotions.add(1, secondHalfPromotion);
        itemPromotions.add(2, dicountPromotion);

        item.setPromotions(itemPromotions);
        CartItem cartItem = new CartItem(item, 5);
        assertThat(Calculator.getSubtotal(cartItem)).isEqualTo(0);
    }

    @Test
    public void should_return_basic_money_when_item_has_no_peomotions() {
        Item item = new Item(1, "ITEM000001", "麦斯威尔", "盒", 17, "咖啡");
        CartItem cartItem = new CartItem(item, 3);
        List<Promotion> noPromotion = new ArrayList<Promotion>();
        item.setPromotions(noPromotion);
        assertThat(Calculator.getSubtotal(cartItem)).isEqualTo(0);
    }
}
