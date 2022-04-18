package com.masai.Question4;

public class PaperFactory {
    public static CurrencyPaper getPaperForCurrency(int money) {
        CurrencyPaper currencyPaper;
        if (money == 10) {
            currencyPaper = new PaperS1();
        } else if (money == 100) {
            currencyPaper = new PaperS2();
        } else if (money == 1000) {
            currencyPaper = new PaperS3();
        } else {
            currencyPaper = null;
        }
        return currencyPaper;
    }
}
