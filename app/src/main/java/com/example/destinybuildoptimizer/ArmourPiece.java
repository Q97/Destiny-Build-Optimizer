package com.example.destinybuildoptimizer;

public class ArmourPiece extends Item{
    //0: helmet, 1: arms, 2: chest, 3: feet
    int itemSlot;
    int mobility, resilience, recovery, discipline, intellect, strength;
    boolean isMandatory;

    public ArmourPiece(int id, String name, String image, int is, int res, int rec, int d, int i, int s){
        super.ID = id;
        super.name = name;
        super.isFavourite = false;
        super.imageURL = image;
        itemSlot = is;
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
