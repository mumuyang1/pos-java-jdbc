package com.thoughtworks.iamcoach.pos.service.impl;

import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.impl.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.dao.impl.PromotionDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Item;
import com.thoughtworks.iamcoach.pos.service.ItemService;

public class ItemServiceImpl implements ItemService {


    @Override
    public Item getItem(String barcode) {
        Item item;
        PromotionDao promotionDaoImpl = new PromotionDaoImpl();
        if (promotionDaoImpl.getPromotionBarcode().contains(barcode)) {
            ItemDao itemDaoImpl = new ItemDaoImpl();
            item = itemDaoImpl.getItem(barcode);
            itemDaoImpl = new ItemDaoImpl();
            item.setPromotions(itemDaoImpl.getItemPromotions(barcode));
            return item;
        }
        ItemDao itemDaoImpl = new ItemDaoImpl();
        item = itemDaoImpl.getItem(barcode);
        return item;
    }
}
