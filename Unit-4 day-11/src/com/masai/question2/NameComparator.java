package com.masai.question2;

import java.util.Comparator;

public class NameComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        return o2.getProductName().compareTo(o1.getProductName());
    }
}
