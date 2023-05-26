package ru.teachmeskills.homework10.task3;

public class Different {

    public String findStringWithMinDifferentSymbols(String text) {
        String[] splitText = text.split(" ");
        int minDifferentSymbolsInWord = 0;
        String wordWithMinDifferentSymbols = splitText[0];
        for (String word : splitText) {
            char[] charArray = word.toCharArray();
            int countOfDifferentSymbolsInWord = 0;
            boolean[] charSet = new boolean[256];
            for (int number : charArray) {
                if (!charSet[number]) {
                    countOfDifferentSymbolsInWord++;
                }
                    charSet[number] = true;

            }
            if (countOfDifferentSymbolsInWord < minDifferentSymbolsInWord) {
                minDifferentSymbolsInWord = countOfDifferentSymbolsInWord;
                wordWithMinDifferentSymbols = word;

            }
        }
        return wordWithMinDifferentSymbols;
    }
}