package com.example.destinybuildoptimizer;

import java.util.Random;

public class ArmourPiece extends Item{
    //0: helmet, 1: arms, 2: chest, 3: feet, 4:class item
    Integer itemSlot;
    Integer armourClass;
    Integer mobility, resilience, recovery, discipline, intellect, strength;
    Boolean isMandatory;

    public ArmourPiece(int id){
        Random rng = new Random();

        super.ID = id;
        super.name = "";
        super.isFavourite = false;
        super.imageURL = "";
        super.isExotic = false;
        itemSlot = rng.nextInt(3);
        resilience = rng.nextInt(100) + 1;
        recovery = rng.nextInt(100) + 1;
        discipline = rng.nextInt(100) + 1;
        intellect = rng.nextInt(100) + 1;
        strength = rng.nextInt(100) + 1;
        isMandatory = false;
    }

    public ArmourPiece(int id, String name, String image, int is, int ac, int res, int rec, int d, int i, int s){
        super.ID = id;
        super.name = name;
        super.isFavourite = false;
        super.imageURL = image;
        super.isExotic = false;
        itemSlot = is;
        armourClass = ac;
        resilience = res;
        recovery = rec;
        discipline = d;
        intellect = i;
        strength = s;
        isMandatory = false;
    }

    public void changeMandatory(){
        isMandatory = !isMandatory;
    }
}
