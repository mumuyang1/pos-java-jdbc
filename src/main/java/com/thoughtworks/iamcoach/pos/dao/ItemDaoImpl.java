package com.thoughtworks.iamcoach.pos.dao;

import com.thoughtworks.iamcoach.pos.entity.Item;
import com.thoughtworks.iamcoach.pos.entity.Promotion;
import com.thoughtworks.iamcoach.pos.entity.PromotionFactory;
import com.thoughtworks.iamcoach.pos.util.JdbcUtil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ItemDaoImpl implements ItemDao {
    ResultSet rs;
    PreparedStatement pre;
    private JdbcUtil jdbcUtil = new JdbcUtil();
    Connection conn = jdbcUtil.getConnection();

    @Override
    public Item getItem(String barcode) {

        Item item = null;
        try {
            pre = conn.prepareStatement("select * from items i,categories c where  i.i_categoryid = c.c_id and i_barcode =?");
            pre.setString(1, barcode);
            rs = pre.executeQuery();
            rs.next();
            item = new Item(rs.getInt("i_id"), barcode, rs.getString("i_name"), rs.getString("i_unit"), rs.getDouble("i_price"), rs.getString("c_name"));
            rs.close();
            pre.close();
            jdbcUtil.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return item;
    }

    @Override
    public List<Promotion> getItemPromotions(String barcode) {
        List<Promotion> itemPromotions = new ArrayList<Promotion>();

        try {
            pre = conn.prepareStatement("select * from items i,items_promotions ip where i.i_id=ip.itemid  and i_barcode = ?");
            pre.setString(1, barcode);
            rs = pre.executeQuery();

            while (rs.next()) {

                PromotionDao promotionDaoImpl = new PromotionDaoImpl();
                int promotionId = rs.getInt("promotionid");
                Promotion promotionForType = promotionDaoImpl.getPromotion(promotionId);

                Promotion promotion = PromotionFactory.getPromotionByType(promotionForType.getType());
                promotion.setId(promotionForType.getId());
                promotion.setType(promotionForType.getType());
                promotion.setDescription(promotionForType.getDescription());
                promotion.setDiscount(rs.getDouble("discount"));

                itemPromotions.add(promotion);
            }
            rs.close();
            pre.close();
            jdbcUtil.closeConnection();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return itemPromotions;
    }

}
