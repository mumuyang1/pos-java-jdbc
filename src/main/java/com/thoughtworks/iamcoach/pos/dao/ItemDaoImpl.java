package com.thoughtworks.iamcoach.pos.dao;

import com.thoughtworks.iamcoach.pos.entity.Item;
import com.thoughtworks.iamcoach.pos.util.JdbcUtil;

import java.sql.*;
import java.util.List;


public class ItemDaoImpl implements ItemDao{
    ResultSet rs;
    PreparedStatement pre;
    private JdbcUtil jdbcUtil = new JdbcUtil();
    Connection conn = jdbcUtil.getConnection();

    @Override
    public Item getItem(String barcode) {
        Item item = null;
        try {
            pre = conn.prepareStatement( "SELECT * FROM items WHERE barcode = ?");
            pre.setString(1, barcode);
            rs = pre.executeQuery();
            rs.next();
            item = new Item(rs.getInt("id"),barcode, rs.getString("name"), rs.getString("unit"), rs.getDouble("price"),rs.getInt("categoryid"));
            rs.close();
            pre.close();
            jdbcUtil.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public List<Item> getItems() {
        return null;
    }


}
