package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.entity.Item;

import java.util.List;

public interface ItemService {

    Item getItem(String barcode);

    List<Item> getItems();
}
