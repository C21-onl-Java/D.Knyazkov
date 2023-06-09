package ru.teachmeskills.homework10;

import org.apache.commons.lang3.StringUtils;
import ru.teachmeskills.homework10.task1.Document;
import ru.teachmeskills.homework10.task2.Sentences;
import ru.teachmeskills.homework10.task3.Different;
import ru.teachmeskills.homework10.task4.Palindrome;
import ru.teachmeskills.homework10.task5.Dual;

public class Main {
    static String numberOfDocument = "2331-QqI-5529-MhG-1u6L";

    public static void main(String[] args) {
        Document document = new Document();
        Palindrome palindrome = new Palindrome();
        Dual dual = new Dual();
        Sentences sentences = new Sentences();
        Different different = new Different();
        document.showDigital(numberOfDocument);
        document.replaceWord(numberOfDocument);
        document.showOnlyLetters(numberOfDocument);
        document.showLetters(numberOfDocument);
        document.checkNumber("mhG");
        document.checkSequencetoStart(numberOfDocument);
        document.checkSequencetoFinish(numberOfDocument);
        sentences.showToShottestWord();
        sentences.showToLongestWord();
        System.out.println(palindrome.checkPalindromе("шалаш"));
        System.out.println(palindrome.checkToWord(3));
        System.out.println(different.findStringWithMinDifferentSymbols("ftrew ggggg kfdss utuuu laqlf"));
        dual.showToDouble("Барселона");


    }


}
