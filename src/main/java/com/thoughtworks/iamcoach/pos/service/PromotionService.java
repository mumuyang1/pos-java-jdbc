package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.entity.Promotion;

import java.util.Set;

public interface PromotionService {
    Promotion getPromotion(int id);

    Set<String> getPromotionBarcode();
}
