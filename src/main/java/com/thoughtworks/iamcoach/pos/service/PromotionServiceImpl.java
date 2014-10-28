package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.dao.PromotionDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Promotion;

public class PromotionServiceImpl implements PromotionService {

    private PromotionDao promotionDaoImpl = new PromotionDaoImpl();
    @Override
    public Promotion getPromotion(int id) {
        return promotionDaoImpl.getPromotion(id);
    }
}
