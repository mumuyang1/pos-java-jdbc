package com.thoughtworks.iamcoach.pos.dao;

import com.thoughtworks.iamcoach.pos.entity.Promotion;
import com.thoughtworks.iamcoach.pos.util.JdbcUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PromotionDaoImpl implements PromotionDao {
    ResultSet rs;
    PreparedStatement pre;
    private JdbcUtil jdbcUtil = new JdbcUtil();
    Connection conn = jdbcUtil.getConnection();
    @Override
    public Promotion getPromotion(int id) {
        Promotion promotion = null;
        try {
            pre = conn.prepareStatement( "SELECT * FROM categories WHERE id = ?");
            pre.setInt(1,id);
            rs = pre.executeQuery();
            rs.next();
            promotion = new Promotion(id,rs.getInt("type"),rs.getString("name"));
            rs.close();
            pre.close();
            jdbcUtil.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return promotion;
    }

}
