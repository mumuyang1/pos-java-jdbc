package com.thoughtworks.iamcoach.pos.entity;

import com.thoughtworks.iamcoach.pos.service.ItemService;
import com.thoughtworks.iamcoach.pos.service.impl.ItemServiceImpl;
import com.thoughtworks.iamcoach.pos.util.FileProcessor;

import java.util.*;

public class Scanner {

    public List<CartItem> getCartItems() {
        List<CartItem> cartItems = new ArrayList<CartItem>();
        List<String> cartList = FileProcessor.readFile("cart.txt");

        for (String aCartList : cartList) {
            if (aCartList.length() > 10) {
                String stringBarcode = aCartList.split("-")[0];
                String stringCount = aCartList.substring(11);
                CartItem cartItem = new CartItem(getItem(stringBarcode), Double.parseDouble(stringCount));
                cartItems.add(cartItem);
            }
        }

        Set<String> uniqueBarcode = new HashSet<String>(cartList);
        for (String barcode : uniqueBarcode) {
            if (barcode.length() <= 10) {
                CartItem cartItem = new CartItem(getItem(barcode), Collections.frequency(cartList, barcode));
                cartItems.add(cartItem);
            }
        }
        return cartItems;
    }

    private Item getItem(String barcode) {
        ItemService itemServiceImpl = new ItemServiceImpl();
        return itemServiceImpl.getItem(barcode);
    }

    public Set<String> getCartCategories(List<CartItem> cartItems) {
        Set<String> cartCategories = new HashSet<String>();
        for (CartItem cartItem : cartItems) {
            cartCategories.add(cartItem.getItem().getCategory());
        }

        return cartCategories;
    }
}
