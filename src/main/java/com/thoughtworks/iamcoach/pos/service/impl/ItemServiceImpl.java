package com.thoughtworks.iamcoach.pos.service.impl;

import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.dao.impl.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.dao.impl.PromotionDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Item;
import com.thoughtworks.iamcoach.pos.service.ItemService;

public class ItemServiceImpl implements ItemService {
    private ItemDao itemDaoImpl;
    private PromotionDao promotionDaoImpl;

    public ItemServiceImpl(ItemDao itemDaoImpl,PromotionDao promotionDaoImpl) {
        this.itemDaoImpl = itemDaoImpl;
        this.promotionDaoImpl = promotionDaoImpl;
    }


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

//    修改后，担忧bug
//    @Override
//    public Item getItem(String barcode) {
//        Item item;
//
//        if (this.promotionDaoImpl.getPromotionBarcode().contains(barcode)) {
//            item = this.itemDaoImpl.getItem(barcode);
//            item.setPromotions(itemDaoImpl.getItemPromotions(barcode));
//            return item;
//        }
//        item = itemDaoImpl.getItem(barcode);
//        return item;
//    }
}
