package ru.teachmeskills.homework07.task3;



import java.util.Date;

public abstract class Register {
    int count=0;
    int numberOfDocument;
    Date date;
    Register[] registers=new Register[10];



    public void saveToDocument(Register register) {
        while (true)
            if (registers[count] != null)
            {count++;}
            else
            {registers[count]=register;
                break;}
    }
    public abstract String showToDocument(Register register);

}

