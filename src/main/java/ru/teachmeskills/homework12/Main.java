package ru.teachmeskills.homework12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    static String wrongLength = "Неверная длина номера документа";
    static String wrongStart = "Неверная последовательность в начале номера документа";
    static String bothVariants = "Ни одно из условий не соблюдено";
    static char newLine = '\n';
    static char space = ' ';

    public static void main(String[] args) throws IOException {
        checkNumber();
    }

    public static void checkNumber() {
        try (Scanner scanner = new Scanner(System.in);
             InputStream fileInputStream = Files.newInputStream(Path.of(scanner.nextLine()));
             Writer writerValid = new FileWriter("src\\main\\java\\ru\\teachmeskills\\homework12\\invalid.txt");
             BufferedWriter bufferValid = new BufferedWriter(writerValid);
             Writer writerInvalid = new FileWriter("src\\main\\java\\ru\\teachmeskills\\homework12\\valid.txt");
             BufferedWriter bufferInvalid = new BufferedWriter(writerInvalid)) {

            //Считываем с потока в массив байтов, который затем переводим в массив string
            byte[] bytes = fileInputStream.readAllBytes();
            String temp = new String(bytes);
            String[] array = temp.split("\\s+");

            for (int i = 0; i < array.length; i++) {
                char[] output = array[i].toCharArray();
                //Проверка на несоответствие обоим условиям
                if (!((array[i].startsWith("docnum") || array[i].startsWith("contract")))) {
                    System.out.printf("Документ %d не соответствует критериям.%n", i + 1);
                    bufferInvalid.write(output);
                    bufferInvalid.write(space);
                    if ((!(array[i].length() == 15))) {
                        bufferInvalid.write(bothVariants);
                        bufferInvalid.write(newLine);
                    } else {
                        bufferInvalid.write(wrongStart);
                        bufferInvalid.write(newLine);
                    }
                }
                //Проверка на соответствие длине
                else if (!(array[i].length() == 15)) {
                    System.out.printf("Документ %d не соответствует критериям.%n", i + 1);
                    bufferInvalid.write(output);
                    bufferInvalid.write(space);
                    bufferInvalid.write(wrongLength);
                    bufferInvalid.write(newLine);
                } else {
                    System.out.printf("Документ %d соответствует критериям.%n", i + 1);
                    bufferValid.write(output);
                    bufferValid.write(newLine);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
