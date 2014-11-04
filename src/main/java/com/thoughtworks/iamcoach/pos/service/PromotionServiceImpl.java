package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.dao.impl.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.dao.impl.PromotionDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Promotion;

import java.util.List;

public class PromotionServiceImpl implements PromotionService {

    @Override
    public List<Promotion> getItemPromotions(String barcode) {

        PromotionDao promotionDaoImpl = new PromotionDaoImpl();
        ItemDao itemDaoImpl = new ItemDaoImpl();
        if (promotionDaoImpl.getPromotionBarcode().contains(barcode)) {
            return itemDaoImpl.getItemPromotions(barcode);
        }else {
            return null;
        }
    }
}
