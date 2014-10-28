package com.thoughtworks.iamcoach.pos.entity;

public class PromotionFactory {

    public static final int PROMOTION_SECOND_HALF = 2;

    public static Promotion getPromotionByType(int type){
        Promotion promotion = null;
        switch(type){
            case PROMOTION_SECOND_HALF:
                promotion = new PromotionSecondHalf();
                break;
        }
        return promotion;
    }
}
