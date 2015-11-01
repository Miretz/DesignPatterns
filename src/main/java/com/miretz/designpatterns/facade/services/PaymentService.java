package com.miretz.designpatterns.facade.services;

public class PaymentService {

    public static boolean makePayment(){
        System.out.println("Payment Accepted.");
        return true;
    }

}
