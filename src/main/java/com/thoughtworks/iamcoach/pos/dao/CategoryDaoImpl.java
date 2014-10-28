package com.thoughtworks.iamcoach.pos.dao;

import com.thoughtworks.iamcoach.pos.entity.Category;
import com.thoughtworks.iamcoach.pos.util.JdbcUtil;

import java.sql.*;

public class CategoryDaoImpl implements CategoryDao {
    ResultSet rs;
    PreparedStatement pre;
    private JdbcUtil jdbcUtil = new JdbcUtil();
    Connection conn = jdbcUtil.getConnection();
    @Override
    public Category getCategory(int id) {
        Category category = null;
        try {
            pre = conn.prepareStatement( "SELECT * FROM categories WHERE id = ?");
            pre.setInt(1,id);
            rs = pre.executeQuery();
            rs.next();
            category = new Category(id,rs.getString("name"));
            rs.close();
            pre.close();
            jdbcUtil.closeConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return category;
    }
}
