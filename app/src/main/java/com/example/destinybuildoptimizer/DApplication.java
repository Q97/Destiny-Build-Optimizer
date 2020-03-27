package com.example.destinybuildoptimizer;

import android.app.Application;

public class DApplication extends Application {
    static Account account;

    public static void setAccount(Account a){
        account = a;
    }

    public static Account getAccount(){
        return account;
    }
}
