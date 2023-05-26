package ru.teachmeskills.homework07.task3;

import java.util.Date;

public class EmployeeContract extends Register {
    String dateOfStart;
    String dateOfFinish;
    public EmployeeContract(Date date, int numberOfDocument, String dateOfStart, String dateOfFinish) {
        super.date=date;
        super.numberOfDocument=numberOfDocument;
        this.dateOfStart=dateOfStart;
        this.dateOfFinish=dateOfFinish;
    }



    @Override
    public String showToDocument(Register register) {
        return String.format("Дата документа: %tD, дата начала контракта %s, дата окончания: %s, номер документа: %d.",date,dateOfStart,dateOfFinish,numberOfDocument);
    }
}




