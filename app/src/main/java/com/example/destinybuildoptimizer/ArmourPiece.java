package com.example.destinybuildoptimizer;

import java.util.HashMap;
import java.util.Random;

public class ArmourPiece extends Item{
    //0: equippedHelmet, 1: equippedArms, 2: equippedChest, 3: legs, 4:class item
    Integer itemSlot;
    //0: hunter, 1: titan, 2: warlock
    Integer armourClass;
    HashMap<String, Integer> stats;
    Integer mobility, resilience, recovery, discipline, intellect, strength;
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

    public ArmourPiece(int id, String name, String image, int is, int ac, int m, int res, int rec, int d, int i, int s){
        super.ID = id;
        super.name = name;
        super.isFavourite = false;
        super.icon = image;
        super.isExotic = false;
        itemSlot = is;
        armourClass = ac;
        mobility = m;
        resilience = res;
        recovery = rec;
        discipline = d;
        intellect = i;
        strength = s;
        isMandatory = false;
    }

    public Integer getArmourClass(){return armourClass;}

    public Integer getItemSlot(){return  itemSlot;}

    public HashMap getStats(){return stats;}

    public void changeMandatory(){
        isMandatory = !isMandatory;
    }
}
