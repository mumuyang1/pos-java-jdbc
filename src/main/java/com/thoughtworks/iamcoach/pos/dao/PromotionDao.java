package com.thoughtworks.iamcoach.pos.dao;

import com.thoughtworks.iamcoach.pos.entity.promotion.Promotion;

import java.util.Set;

public interface PromotionDao {
    Promotion getPromotion(int id);

    Set<String> getPromotionBarcode();
}
