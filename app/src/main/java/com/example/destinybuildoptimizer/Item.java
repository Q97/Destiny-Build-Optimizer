package com.example.destinybuildoptimizer;

public abstract class Item {
    Integer ID;
    String name;
    Boolean isFavourite;
    String icon;
    String detailsImage;
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

    public void setIcon(String url){
        icon = url;
    }
    public void setDetailsImage(String url){
        detailsImage = url;
    }
}
