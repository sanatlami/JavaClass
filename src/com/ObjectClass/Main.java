package com.ObjectClass;

import sun.security.util.AuthResources_zh_CN;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AmazonOrder Sandyorder= new AmazonOrder(12, 400,"Sandy");
        Sandyorder.shipingSpeed();
        EbayOrder Mandyorder=new EbayOrder(5, 900, "Sanat");
        Mandyorder.shipingSpeed();

        AmazonOrder sheya =new AmazonOrder();
        sheya.shipingSpeed();


    }

}
