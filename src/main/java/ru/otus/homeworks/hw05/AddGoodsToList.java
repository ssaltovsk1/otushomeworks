package ru.otus.homeworks.hw05;

import static ru.otus.homeworks.hw05.ExceptionsWork.*;

public class AddGoodsToList {

    public static void addGoodToList(int goodsAmount, int goodsTotalPrice) throws PersonalException {
        if (goodsAmount < 1000) {
            goodsList.add(new Goods(goodsAmount, goodsTotalPrice));
        } else { throw new PersonalException("Too many goods!"); }
    }


}
