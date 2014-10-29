package com.thoughtworks.iamcoach.pos.entity;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class ScannerTest {

    @Test
    public void should_return_a_cart_list() {
        Scanner cartItemProcessor = new Scanner();
        assertThat(cartItemProcessor.getCartItems().get(0).getItem().getName()).isEqualTo("五花肉");
    }
}
