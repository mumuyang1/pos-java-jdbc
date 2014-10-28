package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class ItemServiceImplTest {

    @Test
    public void should_have_getItem_function(){
        ItemService itemServiceImpl = new ItemServiceImpl();
        assertThat(itemServiceImpl.getItem("ITEM000001")).isEqualTo(null);

    }

}
