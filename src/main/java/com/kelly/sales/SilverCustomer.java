package com.kelly.sales;

public class SilverCustomer extends Customer {
    public SilverCustomer(String id, int amount) {
        super(id, amount);
    }
    public int getReturnmoney(){return (int) (amount*0.1);}
        @Override
        public void print () {
        System.out.println(id + "\t" + amount + "\t" + (amount-getdiscountmoney()) +"("+getReturnmoney()+")" );
        }
    }