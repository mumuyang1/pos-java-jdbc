package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PromotionServiceImplTest {

    @Test
    public void should_have_getPromotion_by_id_function(){
        PromotionService promotionServiceImpl = new PromotionServiceImpl();
        assertThat(promotionServiceImpl.getPromotion(1)).isEqualTo(null);

    }

}
