package com.thoughtworks.iamcoach.pos.service.impl;

import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.impl.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Item;
import com.thoughtworks.iamcoach.pos.service.ItemService;
import com.thoughtworks.iamcoach.pos.service.PromotionService;

public class ItemServiceImpl implements ItemService {

    private PromotionService promotionService ;
    public ItemServiceImpl(PromotionService promotionService){
        this.promotionService=promotionService;
    }

    @Override
    public Item getItem(String barcode) {

        ItemDao itemDaoImpl = new ItemDaoImpl();
        Item item =itemDaoImpl.getItem(barcode);
        item.setPromotions(promotionService.getItemPromotions(barcode));
        return item;
    }

}
