package com.example.destinybuildoptimizer;

public class Weapon extends Item{
    //0:kinetic, 1: energy, 2: heavy
    private int weaponSlot;
    private int impact, range, stability, handling, reloadSpeed, RPM, magSize;

    public Weapon(int id, String name, String image, int ws, int i, int r, int s, int h, int rs, int rpm, int ms){
        super.ID = id;
        super.name = name;
        super.isFavourite = false;
        super.imageURL = image;
        weaponSlot = ws;
        impact = i;
        range = r;
        stability = s;
        handling = h;
        reloadSpeed = rs;
        RPM = rpm;
        magSize = ms;
    }


}
