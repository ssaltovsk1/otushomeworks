package ru.otus.homeworks.hw05;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

public class WriteToFile {
    public static void writeToFile(Path filePath, Good good) {
        try (BufferedWriter bw = Files.newBufferedWriter(filePath)) {
            bw.write(good.toString());
            bw.newLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
