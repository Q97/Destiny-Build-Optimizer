package com.example.destinybuildoptimizer;

public class Ghost extends Item{

    public Ghost(int id, String name, String iconURL, String detailURL){
        super.ID = id;
        super.name = name;
        super.isFavourite = false;
        super.icon = iconURL;
        super.detailsImage = detailURL;
        super.isExotic = false;

        Account account = DApplication.getAccount();
        account.ghostStorage.add(this);
    }
}
