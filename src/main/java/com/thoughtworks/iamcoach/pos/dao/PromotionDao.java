package com.thoughtworks.iamcoach.pos.dao;

import com.thoughtworks.iamcoach.pos.entity.Promotion;

public interface PromotionDao {
    Promotion getPromotion(int id);

    java.util.Set<String> getPromotionBarcode();
}
