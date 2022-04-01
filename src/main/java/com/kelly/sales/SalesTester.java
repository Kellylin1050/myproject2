package com.kelly.sales;

import java.util.ArrayList;
import java.util.List;

public class SalesTester {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        customers.add(new Customer("0001",2000));
        customers.add(new Customer("0002",800));
        customers.add(new SilverCustomer("0003",2500));
        customers.add(new GoldenCustomer("0004",2500));
        customers.add(new PlatinumCustomer("0005",2000));

        for (Customer c: customers) {c.print();} //都叫c 一個一個印

       /* for (int i = 0; i < 5; i++) {
            customers.get(i).print();
        }*/

        /*Customer c1 = new Customer("0001",2000);
        c1.print();
        Customer c2 =new Customer("0002",800) ;
        c2.print();
        Customer c3 = new SilverCustomer("0003",2500);
        c3.print();
        Customer c4 = new GoldenCustomer("0004",2500);
        c4.print();
        Customer c5 = new PlatinumCustomer("0005",2000);
        c5.print();*/
    }
}
