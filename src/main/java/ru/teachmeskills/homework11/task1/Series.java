package ru.teachmeskills.homework11.task1;

import org.apache.commons.lang3.StringUtils;

public class Series {
    static String numberOfDocument = "2331-QqI-5529-MhG-1u6L";


    public void checkNumber(String text) throws WrongContainsException {

        String newNumberOfDocument = numberOfDocument.toLowerCase();
        String newText = text.toLowerCase();
        if (!(newNumberOfDocument.contains(newText))) {
            throw new WrongContainsException("Слово не содержит нужной последовательности");
        }
        if (StringUtils.isEmpty(text)) {
            throw new WrongContainsException("Содержимое не может быть пустым");
        }


    }


    public void checkSequencetoStart(String text) throws WrongStartException {

        if (!(text.startsWith("555"))) ;

        {
            throw new WrongStartException("Слово начинается с неверной последовательности");
        }

    }


    public void checkSequencetoFinish(String text) throws WrongFinishException {

        if (!(text.endsWith("1a2b"))) ;
        {
            throw new WrongFinishException("Слово заканчивается неверной последовательностью");
        }
    }


}
