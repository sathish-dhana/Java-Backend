package com.masai.question2;

import java.util.Comparator;

public class IdComparator implements Comparator<Product> {
    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getProductId() < o2.getProductId())
            return -1;
        else if (o1.getProductId() < o2.getProductId())
            return 1;
        else
            return 0;
    }
}
