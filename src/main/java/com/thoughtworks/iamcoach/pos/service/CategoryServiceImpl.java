package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.dao.CategoryDao;
import com.thoughtworks.iamcoach.pos.dao.CategoryDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Category;

public class CategoryServiceImpl implements CategoryService {

    private CategoryDao categoryDaoImpl = new CategoryDaoImpl();

    @Override
    public Category getCategory(int id) {
        return categoryDaoImpl.getCategory(id);
    }
}
