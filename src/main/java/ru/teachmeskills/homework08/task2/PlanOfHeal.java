package ru.teachmeskills.homework08.task2;

public class PlanOfHeal {
    public void assignDoctor(int code,Pacient pacient){
        if (code==1)
        {pacient.setDoctor(new Surgeon());
        } else if (code==2) {
            pacient.setDoctor(new Dentist());
        }
        else
        {pacient.setDoctor(new Terapist());
        }
pacient.getDoctor().heal();

    }

}
