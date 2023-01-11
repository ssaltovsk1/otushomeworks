package ru.otus.homeworks.hw05;

import java.io.*;

public class ImportFromFile {

    public static void writeGoodsFromFile(String fileName) throws IOException {
        File file = new File("C:\\" + fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(String.valueOf(new Good(12, 10)));

        writer.close();
    }
}
