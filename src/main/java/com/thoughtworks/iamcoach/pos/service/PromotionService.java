package com.thoughtworks.iamcoach.pos.service;

import com.thoughtworks.iamcoach.pos.entity.Promotion;

import java.util.List;

/**
 * Created by xueqian on 11/4/14.
 */
public interface PromotionService {
    List<Promotion> getPromotion(String barcode);
}
