package com.thoughtworks.iamcoach.pos.service;

import org.junit.Test;

import static org.fest.assertions.api.Assertions.assertThat;

public class CategoryServiceImplTest {

    @Test
    public void should_return_correct_getName_by_getCategory_function(){
        CategoryService categoryServiceImpl = new CategoryServiceImpl();
        assertThat(categoryServiceImpl.getCategory(1).getName()).isEqualTo("服装鞋包");
    }

    @Test
    public void should_return_correct_getId_by_getCategory_function(){
        CategoryService categoryServiceImpl = new CategoryServiceImpl();
        assertThat(categoryServiceImpl.getCategory(3).getId()).isEqualTo(3);
    }
}
