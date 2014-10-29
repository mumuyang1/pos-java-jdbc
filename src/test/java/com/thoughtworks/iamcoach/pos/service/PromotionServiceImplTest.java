package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class PromotionServiceImplTest {

    @Test
    public void should_have_getPromotion_by_id_function() {
        PromotionService promotionServiceImpl = new PromotionServiceImpl();
        assertThat(promotionServiceImpl.getPromotion(1).getId()).isEqualTo(1);
    }

    @Test
    public void should_return_promotion_by_id() {
        PromotionService promotionService = new PromotionServiceImpl();
        assertThat(promotionService.getPromotion(1).getType()).isEqualTo(1);
    }

    @Test
    public void should_return_item_barcodes_when_it_has_promotions() {
        PromotionService promotionService = new PromotionServiceImpl();
        assertThat(promotionService.getPromotionBarcode().contains("ITEM000003")).isEqualTo(true);
    }

    @Test
    public void should_not_return_item_barcodes_when_it_has_no_promotions() {
        PromotionService promotionService = new PromotionServiceImpl();
        assertThat(promotionService.getPromotionBarcode().contains("ITEM000002")).isEqualTo(false);
    }

}
