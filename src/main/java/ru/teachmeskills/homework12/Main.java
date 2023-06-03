package ru.teachmeskills.homework12;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String wrongLength="Неверная длина номера документа";
        String wrongStart="Неверная последовательность в начале номера документа";
        char newLine='\n';
        char space=' ';
        try (Scanner scanner = new Scanner(System.in);
             InputStream fileInputStream = Files.newInputStream(Path.of(scanner.nextLine()));
             Writer writerValid=new FileWriter("src\\valid.txt");
             BufferedWriter bufferValid=new BufferedWriter(writerValid);
             Writer writerInvalid=new FileWriter("src\\invalid.txt");
             BufferedWriter bufferInvalid=new BufferedWriter(writerInvalid))

        {
            byte[] bytes = fileInputStream.readAllBytes();
            String temp = new String(bytes);
            String[] array = temp.split("\\s+");
            for (int i = 0; i < array.length; i++) {
                char[] output=array[i].toCharArray();
                if (!(array[i].length() == 15)) {
                    System.out.printf("Документ %d не соответствует критериям.%n", i + 1);
                    bufferInvalid.write(output);
                    bufferInvalid.write(space);
                    bufferInvalid.write(wrongLength);
                    bufferInvalid.write(newLine);}

                else if (!((array[i].startsWith("docnum") || array[i].startsWith("contract"))))
                {  System.out.printf("Документ %d не соответствует критериям.%n", i + 1);
                    bufferInvalid.write(output);
                    bufferInvalid.write(space);
                    bufferInvalid.write(wrongStart);
                    bufferInvalid.write(newLine);
                }

                else {
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
