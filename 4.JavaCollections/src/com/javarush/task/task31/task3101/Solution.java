package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    private static ArrayList<File> fileList = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        // путь к директории
        File path = new File(args[0]);
        // имя существующего файла, который будет содержать результат
        File resultFileAbsolutePath = new File(args[1]);
        // создаем файл allFilesContent.txt
        // метод getParent() - возвращает только путь (директорию) к текущему файлу, без самого имени
        File allFilesContent = new File(resultFileAbsolutePath.getParent() + "/allFilesContent.txt");
        FileUtils.renameFile(resultFileAbsolutePath, allFilesContent);
        try (FileOutputStream fileOutputStream = new FileOutputStream(allFilesContent)) {
            fullFileList(path.getAbsolutePath());
            Collections.sort(fileList, new FileNameComparator());
            for (File file : fileList) {
                FileInputStream fileInputStream = new FileInputStream(file);
                while (fileInputStream.available() > 0) {
                    fileOutputStream.write(fileInputStream.read());
                }
                fileOutputStream.write(System.lineSeparator().getBytes());
                fileOutputStream.flush();
                fileInputStream.close();
            }
        }
    }

    private static void fullFileList(String path) {
        // File().listFiles() - возвращает массив файлов, которые содержатся в директории
        File[] files = new File(path).listFiles();
        for (File file : files) {
            if (file.isDirectory()) {
                // getAbsolutePath() - возвращает полный путь файла со всеми поддиректориями
                fullFileList(file.getAbsolutePath());
                continue;
            }
            if (file.length() > 50)
                FileUtils.deleteFile(file);
            else fileList.add(file);
        }
    }

    private static class FileNameComparator implements Comparator<File> {

        @Override
        public int compare(File firstFile, File secondFile) {
            return firstFile.getName().compareTo(secondFile.getName());
        }
    }
}