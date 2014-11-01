package com.thoughtworks.iamcoach.pos.service.impl;

import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.dao.impl.PromotionDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Promotion;
import com.thoughtworks.iamcoach.pos.service.PromotionService;

import java.util.Set;

public class PromotionServiceImpl implements PromotionService {

    private PromotionDao promotionDaoImpl = new PromotionDaoImpl();

    @Override
    public Promotion getPromotion(int id) {
        return promotionDaoImpl.getPromotion(id);
    }

    @Override
    public Set<String> getPromotionBarcode() {
        return promotionDaoImpl.getPromotionBarcode();
    }
}
