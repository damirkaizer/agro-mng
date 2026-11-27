package service;

import java.io.FileWriter;
import java.io.IOException;

public class FileStorageManager {

    public void saveToFile(
            String fileName, String content) {

        try (FileWriter writer =
                     new FileWriter(fileName)) {

            writer.write(content);

            System.out.println(
                    "Отчет сохранен: " + fileName);

        } catch (IOException e) {

            System.out.println(
                    "Ошибка сохранения файла: " + e.getMessage());
        }
    }
}