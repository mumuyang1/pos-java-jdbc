package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class ItemServiceImplTest {

    @Test
    public void should_return_correct_getName_by_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000001").getName()).isEqualTo("女装");
    }

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

}
