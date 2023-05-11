package ru.teachmeskills.homework07.task3;

import java.util.Date;

public class Invoice extends Register {
    double totalAmountOfMonth;
    int codeOfDepartment;

    public Invoice(Date date, int numberOfDocument, double totalAmountOfMonth, int codeOfDepartment) {
        super.date=date;
        super.numberOfDocument=numberOfDocument;
        this.totalAmountOfMonth=totalAmountOfMonth;
        this.codeOfDepartment=codeOfDepartment;
    }



    @Override
    public String showToDocument(Register register) {
        return String.format("Дата документа: %tD, итоговая сумма за месяц: %.2f, номер документа: %d, код департамента: %d.",date,totalAmountOfMonth,numberOfDocument,codeOfDepartment);
    }
}

