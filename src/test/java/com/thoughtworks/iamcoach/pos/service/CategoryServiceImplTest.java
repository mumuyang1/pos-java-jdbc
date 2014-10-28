package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CategoryServiceImplTest {

    @Test
    public void should_have_getCategory_by_id_function(){
        CategoryService categoryServiceImpl = new CategoryServiceImpl();
        assertThat(categoryServiceImpl.getCategory(1)).isEqualTo(null);
    }
}
