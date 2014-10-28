package com.thoughtworks.iamcoach.pos.dao;

import com.thoughtworks.iamcoach.pos.entity.Promotion;

import java.util.List;

public interface PromotionDao {
    List<Promotion> getPromotions();
}
