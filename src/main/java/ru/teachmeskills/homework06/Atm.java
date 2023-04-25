package ru.teachmeskills.homework06;
public class Atm {

    private int existNote20;
    private int existNote50;
    private int existNote100;
    private int allCoins;
    int count100 = 0;
    int count50 = 0;
    int count20 = 0;

    public Atm(int existNote20, int existNote50, int existNote100) {
        this.existNote20 = existNote20;
        this.existNote50 = existNote50;
        this.existNote100 = existNote100;
    }

    public void addCash(int note20, int note50, int note100) {
        existNote20 += note20;
        existNote50 += note50;
        existNote100 += note100;
    }

    public boolean takeCash(int sum) {
        int banknotes20 = 20;
        int banknotes50 = 50;
        int banknotes100 = 100;
        allCoins = existNote20 * 20 + existNote50 * 50 + existNote100 * 100;

        if (allCoins < sum || sum <= 0) {
            return false;
        } else {
            while (sum > 0 && existNote100 > 0) {
                sum -= banknotes100;
                existNote100--;
                count100++;
            }
            if (sum < 0) {
                sum += banknotes100;
                existNote100++;
                count100--;
            }
            while (sum > 0 && existNote50 > 0) {
                sum -= banknotes50;
                existNote50--;
                count50++;
            }
            if (sum < 0) {
                sum += banknotes50;
                existNote50++;
                count50--;
            }
            while (sum > 0 && existNote20 > 0) {
                sum -= banknotes20;
                existNote20--;
                count20++;
            }
            if (sum < 0) {
                sum += banknotes20;
                existNote20++;
                count20--;

            }
        }
        return true;
    }

    @Override
    public String toString() {
        return String.format("Сдача выдана купюрами: номинал 100 - %d шт., номинал 50 - %d шт., номинал 20 - %d шт.", count100, count50, count20);


    }


}




