package com.example.destinybuildoptimizer;

import java.util.Random;

public class Weapon extends Item{
    //0:equippedKinetic, 1: equippedEnergy, 2: equippedHeavy
    Integer itemSlot;
    Integer impact, range, stability, handling, reloadSpeed, RPM, magSize;

    public Weapon(int id){
        Random rng = new Random();

        super.ID = id;
        super.name = "";
        super.isFavourite = false;
        super.icon = "";
        super.detailsImage = "";
        super.isExotic = false;
        itemSlot = rng.nextInt(3);
        impact = rng.nextInt(100) + 1;
        range = rng.nextInt(100) + 1;
        stability = rng.nextInt(100) + 1;
        handling = rng.nextInt(100) + 1;
        reloadSpeed = rng.nextInt(100) + 1;
        RPM = rng.nextInt(500) + 1;
        magSize = rng.nextInt(50) + 1;
    }

    public Weapon(int id, String name, String image, int ws, int i, int r, int s, int h, int rs, int rpm, int ms){
        super.ID = id;
        super.name = name;
        super.isFavourite = false;
        super.icon = image;
        super.isExotic = false;
        itemSlot = ws;
        impact = i;
        range = r;
        stability = s;
        handling = h;
        reloadSpeed = rs;
        RPM = rpm;
        magSize = ms;
    }



}
