package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.dao.ItemDao;
import com.thoughtworks.iamcoach.pos.dao.ItemDaoImpl;
import com.thoughtworks.iamcoach.pos.entity.Item;

import java.util.List;

public class ItemServiceImpl implements ItemService {
    private ItemDao itemDaoImpl = new ItemDaoImpl();

    @Override
    public Item getItem(String barcode) {
        return itemDaoImpl.getItem(barcode);
    }

    @Override
    public List<Item> getItems() {
        return null;
    }
}
