package com.thoughtworks.iamcoach.pos.entity;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class ScannerTest {

    @Test
    public void should_return_a_cart_list() {
        Scanner cartItemProcessor = new Scanner();
        assertThat(cartItemProcessor.getCartItems().get(0).getItem().getName()).isEqualTo("五花肉");
    }

    @Test
    public void should_return_a_cartItems_category_list() {
        Scanner scanner = new Scanner();
        assertThat(scanner.getCartCategories().contains("全球美食")).isEqualTo(false);
    }
}
