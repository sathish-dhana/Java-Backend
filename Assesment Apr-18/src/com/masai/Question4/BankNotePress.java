package com.masai.Question4;

public class BankNotePress {
    public static void main(String[] args) {
        CurrencyPaper c1 = PaperFactory.getPaperForCurrency(10);
        System.out.println(c1.getPager());

        CurrencyPaper c2 = PaperFactory.getPaperForCurrency(100);
        System.out.println(c2.getPager());

        CurrencyPaper c3 = PaperFactory.getPaperForCurrency(1000);
        System.out.println(c3.getPager());
    }
}
