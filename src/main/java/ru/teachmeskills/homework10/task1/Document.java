package ru.teachmeskills.homework10.task1;

public class Document {
    static   String numberOfDocument="2331-QqI-5529-MhG-1u6L";

    private static final int INDEX_OF_FIRST_NUMBER_BLOCK=0;
    private static final int INDEX_OF_SECOND_NUMBER_BLOCK=1;
    private static final int INDEX_OF_THIRD_NUMBER_BLOCK=2;
    private static final int INDEX_OF_FOURTH_NUMBER_BLOCK=3;
    private static final int INDEX_OF_FIFTH_NUMBER_BLOCK=4;


//- Вывести на экран в одну строку два первых блока по 4 цифры.
    public  void showDigital(String text){
        String[] arrayOfDocument=text.split("-");
        System.out.println(text.join("-",arrayOfDocument[INDEX_OF_FIRST_NUMBER_BLOCK],arrayOfDocument[INDEX_OF_THIRD_NUMBER_BLOCK]));
    }


//- Вывести на экран номер документа, но блоки из трех букв заменить на *** (каждая буква заменятся на *).
    public void replaceWord(String text){
       StringBuilder builder=new StringBuilder(text);
        builder.replace(5,9,"***");
           System.out.println(builder.replace(14,17,"***"));
    }


    //- Вывести на экран только одни буквы из номера документа в формате yyy/yyy/y/y в нижнем регистре.
    public void showOnlyLetters(String text){
        String[] array = text.split("-");
        String s = text.valueOf(array[INDEX_OF_FIFTH_NUMBER_BLOCK].charAt(INDEX_OF_SECOND_NUMBER_BLOCK));
        String b = text.valueOf(array[INDEX_OF_FIFTH_NUMBER_BLOCK].charAt(INDEX_OF_FOURTH_NUMBER_BLOCK));
        System.out.println(text.join("/", array[INDEX_OF_SECOND_NUMBER_BLOCK], array[INDEX_OF_FOURTH_NUMBER_BLOCK], s, b).toLowerCase());
    }


//- Вывести на экран буквы из номера документа в формате "Letters:yyy/yyy/y/y" в верхнем регистре(реализовать с помощью StringBuilder).
    public void showLetters(String text){
        StringBuilder builder=new StringBuilder(text);
        builder.delete(0,5);
        builder.delete(4,9);
        builder.setCharAt(3,'/');
        builder.setCharAt(7,'/');
        String result=String.valueOf(builder);
        System.out.println("Letters:"+ result.toUpperCase()) ;
    }


    //- Проверить содержит ли номер документа последовательность abc и вывести сообщение содержит или нет(причем, abc и ABC считается одинаковой последовательностью).
    public void checkNumber(String text){

      String  newNumberOfDocument=numberOfDocument.toLowerCase();
      String newText=text.toLowerCase();

        System.out.println(newNumberOfDocument.contains(newText));
    }


//- Проверить начинается ли номер документа с последовательности 555.
public  void checkSequencetoStart(String text){
    System.out.println(text.startsWith("555"));
}



//-- Проверить заканчивается ли номер документа на последовательность 1a2b.
    public void checkSequencetoFinish(String text) {

        System.out.println(text.endsWith("1a2b"));
    }
}
































