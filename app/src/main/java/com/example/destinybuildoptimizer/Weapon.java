package com.example.destinybuildoptimizer;

import java.util.Random;

public class Weapon extends Item{
<<<<<<< HEAD
    //0:equippedKinetic, 1: equippedEnergy, 2: equippedHeavy
    Integer itemSlot;
    Integer impact, range, stability, handling, reloadSpeed, RPM, magSize;
=======
    //0:kinetic, 1: energy, 2: heavy
    private Integer weaponSlot;
    private Integer impact, range, stability, handling, reloadSpeed, RPM, magSize;
>>>>>>> origin/master

    public Weapon(int id){
        Random rng = new Random();

        super.ID = id;
        super.name = "";
        super.isFavourite = false;
<<<<<<< HEAD
        super.icon = "";
        super.detailsImage = "";
        super.isExotic = false;
        itemSlot = rng.nextInt(3);
=======
        super.imageURL = "";
        super.isExotic = false;
        weaponSlot = rng.nextInt(3);
>>>>>>> origin/master
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
<<<<<<< HEAD
        super.icon = image;
        super.isExotic = false;
        itemSlot = ws;
=======
        super.imageURL = image;
        super.isExotic = false;
        weaponSlot = ws;
>>>>>>> origin/master
        impact = i;
        range = r;
        stability = s;
        handling = h;
        reloadSpeed = rs;
        RPM = rpm;
        magSize = ms;
    }



}
