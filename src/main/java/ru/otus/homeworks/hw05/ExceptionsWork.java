package ru.otus.homeworks.hw05;

import java.io.*;

public class ExceptionsWork {

    public static void main(String[] args) {

        GoodsStorage.setPriceListAddGoods(0, 10);
    }


   public static class GoodsStorage{
       private int goodsPrice;
       private static int goodsAmount;
       private static int goodsTotalPrice;


        private GoodsStorage(int goodsPrice, int goodsAmount, int goodsTotalPrice) {
            this.goodsAmount = goodsAmount;
            this.goodsPrice = goodsPrice;
        }

        public static GoodsStorage setPriceListAddGoods(int goodsAmount, int goodsTotalPrice) {

            GoodsStorage newGood = null;
            try {
                newGood = new GoodsStorage(goodsTotalPrice / goodsAmount, goodsAmount, goodsTotalPrice);
            } catch (Exception e) {
                System.out.println("Ошибка при создании товара");
            }

            return newGood;
        }

       public void writeGoodsToFile(String fileName) throws IOException {
           File file = new File("C:\\Users\\Username\\Desktop\\" + fileName);
           BufferedWriter writer = new BufferedWriter(new FileWriter(file));
           writer.write(String.valueOf(setPriceListAddGoods( 0, 10)));

           writer.close();
       }

        }
   }
