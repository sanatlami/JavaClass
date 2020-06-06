package com.ObjectClass;

public class EbayOrder {
    int item;
    int price;
    String customerName;
    EbayOrder(){} // None prematers
    // here AmazonOrder work as constructer
    EbayOrder(int iteam, int price, String customerName){
        this.item= item;
        this.price= price;
        this.customerName= customerName;
    }

    public void shipingSpeed(){
        if( price>1000){
            System.out.println("2 Days shipping");
        }
        else {
            System.out.println(" 14 days shipping");
        }
}}

