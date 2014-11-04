package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.impl.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Item;

public class ItemServiceImpl implements ItemService {

    @Override
    public Item getItem(String barcode) {

        PromotionService promotionService = new PromotionServiceImpl();
        ItemDao itemDaoImpl = new ItemDaoImpl();
        Item item =itemDaoImpl.getItem(barcode);
        item.setPromotions(promotionService.getItemPromotions(barcode));
        return item;
    }

}
