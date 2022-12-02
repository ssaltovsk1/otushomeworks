package ru.otus.homeworks.hw05;

public class Goods {

    private int goodsPrice;
    private static int goodsAmount;
    private static int goodsTotalPrice;

    Goods(int goodsAmount, int goodsTotalPrice) {
        this.goodsAmount = goodsAmount;
        this.goodsTotalPrice = goodsTotalPrice;
        try {
            this.goodsPrice = goodsTotalPrice / goodsAmount;
        } catch (NullPointerException e) {
            System.out.println("NullPointerException");
        }
        catch (IllegalArgumentException e) {
            System.out.println("IllegalArgument");
        }
        catch (Exception e) {
            System.out.println("Непонятная ошибка Exception. Как отловить конкретный тип?");
        }
    }
    private Goods(int goodsPrice, int goodsAmount, int goodsTotalPrice) {
        this.goodsAmount = goodsAmount;
        this.goodsPrice = goodsPrice;
        this.goodsTotalPrice = goodsTotalPrice;
    }
}