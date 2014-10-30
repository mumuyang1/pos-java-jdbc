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
        assertThat(Calculator.getSubtotal(cartItem)).isEqualTo(42.5);
    }

    @Test
    public void should_return_basic_money_when_item_has_no_promotions() {
        Item item = new Item(1, "ITEM000001", "麦斯威尔", "盒", 17, "咖啡");
        CartItem cartItem = new CartItem(item, 3);
        List<Promotion> noPromotion = new ArrayList<Promotion>();
        item.setPromotions(noPromotion);
        assertThat(Calculator.getSubtotal(cartItem)).isEqualTo(51);
    }

    @Test
    public void should_return_total_money_for_all_cart_items(){

        assertThat(Calculator.getTotalMoney()).isEqualTo(5151);
    }

//    @Test
//    public void should_return_total_money_for_all_cart_items(){
//        Item item1 = new Item(2, "ITEM000002", "全家桶", "桶", 50, "食品");
//
//        List<Promotion> noPromotion = new ArrayList<Promotion>();
//        item1.setPromotions(noPromotion);
//
//        CartItem cartItem1 = new CartItem(item1, 3);
//
//        Item item2 = new Item(1, "ITEM000001", "麦斯威尔", "盒", 17, "咖啡");
//
//        Promotion oneFreePromotion = PromotionFactory.getPromotionByType(1);
//        oneFreePromotion.setType(1);
//        Promotion secondHalfPromotion = PromotionFactory.getPromotionByType(2);
//        secondHalfPromotion.setType(2);
//        Promotion dicountPromotion = PromotionFactory.getPromotionByType(3);
//        dicountPromotion.setType(3);
//        dicountPromotion.setDiscount(50);
//
//        List<Promotion> itemPromotions = new ArrayList<Promotion>();
//        itemPromotions.add(0, oneFreePromotion);
//        itemPromotions.add(1, secondHalfPromotion);
//        itemPromotions.add(2, dicountPromotion);
//
//        item2.setPromotions(itemPromotions);
//
//        CartItem cartItem2 = new CartItem(item2, 5);
//        List<CartItem> cartItems = new ArrayList<CartItem>();
//        cartItems.add(cartItem1);
//        cartItems.add(cartItem2);
//        Scanner scanner = mock(Scanner.class);
//        when(scanner.getCartItems()).thenReturn(cartItems);
//
//        assertThat(Calculator.getTotalMoney()).isEqualTo(233);
//    }

    @Test
    public void should_return_a_total_money_with_promotions_for_all_cart_items(){
        assertThat(Calculator.getTotalMoneyAfterPromoting()).isEqualTo(4608.8);
    }

    @Test
    public void should_return_total_saved_money() {
        assertThat(Calculator.getTotalSavedMoney()).isEqualTo(542.2);
    }


}
