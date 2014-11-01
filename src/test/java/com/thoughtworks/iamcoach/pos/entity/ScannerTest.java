package com.thoughtworks.iamcoach.pos.entity;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.fest.assertions.api.Assertions.assertThat;

public class ScannerTest {

//    @Test
//    public void should_return_a_cart_list() {
//        Scanner cartItemProcessor = new Scanner();
//        assertThat(cartItemProcessor.getCartItems().get(0).getItem().getName()).isEqualTo("五花肉");
//    }
//
    @Test
    public void should_return_a_cartItems_category_list() {
        Item item1 = new Item(2, "ITEM000002", "全家桶", "桶", 50, "食品");
        Item item2 = new Item(1, "ITEM000001", "麦斯威尔", "盒", 17, "咖啡");

        List<Promotion> noPromotion = new ArrayList<Promotion>();
        item1.setPromotions(noPromotion);

        CartItem cartItem1 = new CartItem(item1, 3);

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

        item2.setPromotions(itemPromotions);

        CartItem cartItem2 = new CartItem(item2, 5);

        List<CartItem> cartItems = new ArrayList<CartItem>();
        cartItems.add(cartItem1);
        cartItems.add(cartItem2);
        Scanner scanner = new Scanner();
        assertThat(scanner.getCartCategories(cartItems).contains("食品")).isEqualTo(true);
        assertThat(scanner.getCartCategories(cartItems).contains("咖啡")).isEqualTo(true);
        assertThat(scanner.getCartCategories(cartItems).size()).isEqualTo(2);
    }
}
