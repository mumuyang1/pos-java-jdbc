//package com.thoughtworks.iamcoach.pos.entity;
//
//import com.thoughtworks.iamcoach.pos.dao.CategoryDao;
//import com.thoughtworks.iamcoach.pos.dao.CategoryDaoImpl;
//import com.thoughtworks.iamcoach.pos.dao.ItemDaoImpl;
//import com.thoughtworks.iamcoach.pos.util.FileProcessor;
//
//import java.util.*;
//
//public class Scanner {
//
//    public List<CartItem> getCartItems() {
//        List<CartItem> cartItems = new ArrayList<CartItem>();
//        List<String> cartList = FileProcessor.readFile("cart.txt");
//
//        for (String aCartList : cartList) {
//            if (aCartList.length() > 10) {
//                String stringBarcode = aCartList.split("-")[0];
//                String stringCount = aCartList.substring(11);
//                CartItem cartItem = new CartItem(getItem(stringBarcode), Double.parseDouble(stringCount), getCategory(getItem(stringBarcode).getCategoryId()).getName());
//                cartItems.add(cartItem);
//            }
//        }
//
//        Set<String> uniqueBarcode = new HashSet<String>(cartList);
//        for (String barcode : uniqueBarcode) {
//            if (barcode.length() <= 10) {
//                CartItem cartItem = new CartItem(getItem(barcode), Collections.frequency(cartList, barcode), getCategory(getItem(barcode).getCategoryId()).getName());
//                cartItems.add(cartItem);
//            }
//        }
//        return cartItems;
//    }
//
//    private Item getItem(String barcode) {
//        ItemDaoImpl itemDao = new ItemDaoImpl();
//        List<Item> items = itemDao.getItems();
//
//        for (Item item : items) {
//            if (item.getBarcode().equals(barcode)) {
//                return item;
//            }
//        }
//        return null;
//    }
//
//    private Category getCategory(int id) {
//        CategoryDao categoryDao = new CategoryDaoImpl();
//        return categoryDao.getCategory(id);
//    }
//}
