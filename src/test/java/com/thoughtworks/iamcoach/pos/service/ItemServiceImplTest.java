package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;

public class ItemServiceImplTest {

//    @Test
//    public void should_return_correct_getName_by_getItem_function() throws SQLException {
//        PromotionDao promotionDao = mock(PromotionDaoImpl.class);
//        Set<String> promotionBarcodes = new HashSet<String>();
//        promotionBarcodes.add("ITEM000001");
//        promotionBarcodes.add("ITEM000003");
//        when(promotionDao.getPromotionBarcode()).thenReturn(promotionBarcodes);
//
//        JdbcUtil jdbcUtil = mock(JdbcUtil.class);
//        when(jdbcUtil.getConnection()).thenReturn(DriverManager.getConnection("", "", ""));
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
//        ItemService itemServiceImpl = new ItemServiceImpl();
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
