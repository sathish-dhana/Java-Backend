package com.masai.Question4;

public interface CurrencyPaper {
    abstract public String getPager();
}

class PaperS1 implements CurrencyPaper {

    @Override
    public String getPager() {
        return "Type : S1";
    }
}
class PaperS2 implements CurrencyPaper {

    @Override
    public String getPager() {
        return "Type : S2";
    }
}
class PaperS3 implements CurrencyPaper {

    @Override
    public String getPager() {
        return "Type : S3";
    }
}