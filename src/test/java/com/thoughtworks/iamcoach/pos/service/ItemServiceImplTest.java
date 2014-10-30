package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.dao.PromotionDao;
import com.thoughtworks.iamcoach.pos.dao.PromotionDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Item;
import com.thoughtworks.iamcoach.pos.entity.Promotion;
import com.thoughtworks.iamcoach.pos.entity.PromotionFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ItemServiceImplTest {

//    @Test
//    public void should_return_correct_getName_by_getItem_function(){
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
//        item.setPromotions(promotions);
//        ItemService itemServiceImpl = new ItemServiceImpl();
////        System.out.print(itemServiceImpl.getItem("ITEM000001"));
//        assertThat(itemServiceImpl.getItem("ITEM000001").getPromotions()).isEqualTo(null);
//    }



    @Test
    public void should_return_correct_getBarcode_by_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000002").getBarcode()).isEqualTo("ITEM000002");
    }

    @Test
    public void should_return_correct_getId_by_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000003").getId()).isEqualTo(3);
    }

    @Test
    public void should_return_correct_getCategoryId_by_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000004").getCategory()).isEqualTo("全球美食");
    }

    @Test
    public void should_return_correct_getPrice_by_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000005").getPrice()).isEqualTo(30);
    }

    @Test
    public void should_return_correct_getUnit_by_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000006").getUnit()).isEqualTo("个");
    }

    @Test
    public void should_return_correct_getPromotions_by_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000006").getPromotions().get(0).getType()).isEqualTo(1);
    }

    @Test
    public void should_return_no_getPromotions_by_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000002").getPromotions().size()).isEqualTo(0);
    }

}
