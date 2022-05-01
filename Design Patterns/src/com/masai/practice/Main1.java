package com.masai.practice;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main1 {
    public static void main(String[] args) {
        CustomerOrder c1 = new CustomerOrder(1, 100.0, "customer1");
        CustomerOrder c2 = new CustomerOrder(3, 50.0, "customer3");
        CustomerOrder c3 = new CustomerOrder(2, 300.0, "customer2");

        Queue<CustomerOrder> customerOrders = new PriorityQueue<>();
        customerOrders.add(c1);
        customerOrders.add(c2);
        customerOrders.add(c3);

        while (!customerOrders.isEmpty()) {
            System.out.println(customerOrders.poll());
        }
    }
}
