package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.dao.impl.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.dao.impl.PromotionDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Item;
import com.thoughtworks.iamcoach.pos.entity.Promotion;
import com.thoughtworks.iamcoach.pos.entity.PromotionFactory;
import com.thoughtworks.iamcoach.pos.service.impl.ItemServiceImpl;
import org.junit.Test;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemServiceImplTest {

//    @Test
//    public void should_return_correct_getName_by_getItem_function() throws SQLException {
//        PromotionDao promotionDao = mock(PromotionDaoImpl.class);
//        Set<String> promotionBarcodes = new HashSet<String>();
//        promotionBarcodes.add("ITEM000001");
//        promotionBarcodes.add("ITEM000003");
//        when(promotionDao.getPromotionBarcode()).thenReturn(promotionBarcodes);
//
//        ItemDao itemDao = mock(ItemDaoImpl.class);
//        Item item = new Item();
//        when(itemDao.getItem("ITEM000001")).thenReturn(new Item(1,"ITEM000001","测试","菜菜",100,"hahaha"));
//        List<Promotion> promotions = new ArrayList<Promotion>();
//        Promotion promotion = PromotionFactory.getPromotionByType(1);
//        promotion.setId(1);
//        promotion.setType(1);
//        promotion.setDiscount(90);
//        promotion.setDescription("打折");
//        promotions.add(0, promotion);
//        when(promotionDao.getPromotion(1)).thenReturn(promotion);
//
//        item.setPromotions(promotions);
//        ItemService itemServiceImpl = new ItemServiceImpl(itemDao,promotionDao);
//        assertThat(itemServiceImpl.getItem("ITEM000001").getPromotions().size()).isEqualTo(0);
//    }

    @Test
    public void should_return_Item_with_promotions() throws SQLException {
        PromotionDao promotionDao = mock(PromotionDaoImpl.class);
        Set<String> promotionBarcodes = new HashSet<String>();
        promotionBarcodes.add("ITEM000001");
        promotionBarcodes.add("ITEM000003");
        when(promotionDao.getPromotionBarcode()).thenReturn(promotionBarcodes);

        ItemDao itemDao = mock(ItemDaoImpl.class);
        Item item = new Item(1,"ITEM000001","测试","菜菜",100,"hahaha");
        List<Promotion> promotions = new ArrayList<Promotion>();
        Promotion promotion = PromotionFactory.getPromotionByType(1);
        promotion.setType(1);
        promotion.setDiscount(90);
        promotion.setDescription("打折");
        promotions.add(0, promotion);
        item.setPromotions(promotions);

        when(promotionDao.getPromotion(1)).thenReturn(promotion);
        when(itemDao.getItemPromotions("ITEM000003")).thenReturn(promotions);
        when(itemDao.getItem("ITEM000003")).thenReturn(item);

        ItemService itemServiceImpl = new ItemServiceImpl(itemDao,promotionDao);
        assertThat(itemServiceImpl.getItem("ITEM000003").getPromotions().size()).isEqualTo(1);
    }
}


