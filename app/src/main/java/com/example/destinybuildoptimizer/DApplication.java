package com.example.destinybuildoptimizer;

import android.app.Application;

public class DApplication extends Application {
    private static Account account;
    private static Integer currentCharacter;
    private static Item currentItem;

    public static void setAccount(Account a){
        account = a;
    }

    public static Account getAccount(){
        return account;
    }

    public static <I extends Item> void setCurrentItem(Item I) {
        DApplication.currentItem = I;
    }

    public static Item getCurrentItem() {
        return currentItem;
    }

    public static void setCurrentCharacter(Integer c){
        currentCharacter = c;
    }

    public static Integer getCurrentCharacter(){
        return currentCharacter;
    }
}
