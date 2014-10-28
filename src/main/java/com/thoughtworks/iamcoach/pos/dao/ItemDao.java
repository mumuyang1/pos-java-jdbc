package com.thoughtworks.iamcoach.pos.dao;

import com.thoughtworks.iamcoach.pos.entity.Item;
import java.util.List;

public interface ItemDao {

    Item getItem(String barcode);

    List<Item> getItems();
}
