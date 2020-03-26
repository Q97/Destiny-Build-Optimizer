package com.example.destinybuildoptimizer;

import java.util.Random;

public class Item {
    Integer ID;
    String name;
    Boolean isFavourite;
    String imageURL;
    Boolean isExotic;

    public void changeFavorite(){
        isFavourite = !isFavourite;
    }

    public void changeExotic(){
        isExotic = !isExotic;
    }

    public void setName(String n){
        name = n;
    }

    public void setImageURL(String url){
        imageURL = url;
    }
}
