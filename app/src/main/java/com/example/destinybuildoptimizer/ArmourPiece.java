package com.example.destinybuildoptimizer;

import java.util.HashMap;
import java.util.Random;

public class ArmourPiece extends Item{
    //0: helmet, 1: arms, 2: chest, 3: feet, 4:class item
    Integer itemSlot;
    Integer armourClass;
    Integer mobility, resilience, recovery, discipline, intellect, strength;
    HashMap<String, Integer> stats;
    Boolean isMandatory;

    public ArmourPiece(int id){
        Random rng = new Random();

        super.ID = id;
        super.name = "";
        super.isFavourite = false;
        super.icon = "";
        super.detailsImage = "";
        super.isExotic = false;
        itemSlot = rng.nextInt(4);
        mobility = rng.nextInt(100) + 1;
        resilience = rng.nextInt(100) + 1;
        recovery = rng.nextInt(100) + 1;
        discipline = rng.nextInt(100) + 1;
        intellect = rng.nextInt(100) + 1;
        strength = rng.nextInt(100) + 1;
        isMandatory = false;

        stats = new HashMap<String, Integer>();
        stats.put("mobility", mobility);
        stats.put("resilience", resilience);
        stats.put("recovery", recovery);
        stats.put("discipline", discipline);
        stats.put("intellect", intellect);
        stats.put("strength", strength);
    }


    public Integer getArmourClass(){return armourClass;}

    public Integer getItemSlot(){return  itemSlot;}

    public HashMap getStats(){return stats;}

    public void changeMandatory(){
        isMandatory = !isMandatory;
    }
}
