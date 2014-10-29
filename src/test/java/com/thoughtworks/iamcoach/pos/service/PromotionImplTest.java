package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PromotionImplTest {
    @Test
    public void should_return_promotion_by_id(){
        PromotionService promotionService = new PromotionServiceImpl();
        assertThat(promotionService.getPromotion(1).getType()).isEqualTo(1);
    }
}
