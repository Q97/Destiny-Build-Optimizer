package com.example.destinybuildoptimizer;

<<<<<<< HEAD
public abstract class Item {
    Integer ID;
    String name;
    Boolean isFavourite;
    String icon;
    String detailsImage;
=======
import java.util.Random;

public class Item {
    Integer ID;
    String name;
    Boolean isFavourite;
    String imageURL;
>>>>>>> origin/master
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

<<<<<<< HEAD
    public void setIcon(String url){
        icon = url;
    }
    public void setDetailsImage(String url){
        detailsImage = url;
=======
    public void setImageURL(String url){
        imageURL = url;
>>>>>>> origin/master
    }
}
