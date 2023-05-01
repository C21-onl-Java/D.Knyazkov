package ru.teachmeskills.homework07.task3;


























import java.util.Date;

public class SupplyContract extends Register {
    String typeOfDocuments;
    int amountOfDocuments;

    public SupplyContract() {

    }

    public SupplyContract(Date date, int amountOfDocuments, String typeOfDocuments, int numberOfDocument) {
        this.date=date;
        this.numberOfDocument=numberOfDocument;
        this.amountOfDocuments=amountOfDocuments;
        this.typeOfDocuments=typeOfDocuments;
    }

    @Override
    public String showToDocument(Register register) {

        return String.format("Дата документа: %tD, тип: %s, номер документа: %d, количество: %d шт.",date,typeOfDocuments,numberOfDocument,amountOfDocuments);
    }


}

