package com.ObjectClass;

public class AmazonOrder {
    int item;
    int price;
    String customerName;

    AmazonOrder(){} // None prematers
    // here AmazonOrder work as constructer
    AmazonOrder(int iteam, int price, String customerName){
        this.item= item;
        this.price= price;
        this.customerName= customerName;
    }

    public void shipingSpeed(){
        if( price>100){
            System.out.println("2 Days shipping");
        }
        else {
            System.out.println(" 14 days shipping");
        }

        }
}
