package com.example.destinybuildoptimizer;

public abstract class Item {
    int ID;
    String name;
    boolean isFavourite;
    String imageURL;

    public void changeFavorite(){
        isFavourite = !isFavourite;
    }
}
