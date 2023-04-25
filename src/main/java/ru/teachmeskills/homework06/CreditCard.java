package ru.teachmeskills.homework06;

public class CreditCard {
    private String accNumber;
    private double summ;

    public CreditCard(String accNumber,double summ) {
        this.accNumber = accNumber;
        this.summ = summ;
    }

    public String getAccNumber() {
        return accNumber;
    }

    public double getSumm() {
        return summ;
    }

    public void setAccNumber(String accNumber) {
        this.accNumber = accNumber;
    }

    public void setSumm(double summ) {
        this.summ = summ;
    }

    public void add(double cash) {
        summ += cash;
    }

    public void pay(  double cash   )
    {if (summ<cash)
    {
        System.out.println("Недостаточно средств");
    }
    else
    {summ-=cash; }
    }


    @Override
    public String toString(){
        return (String.format("Card number: %s Balance: %2f",accNumber,summ ));
    }
}
