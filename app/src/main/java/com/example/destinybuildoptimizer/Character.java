package com.example.destinybuildoptimizer;

import java.util.ArrayList;
import java.util.HashMap;

public class Character {
    //0: hunter, 1: titan, 2: warlock
    Integer characterClass;
    ArmourPiece helmet;
    ArmourPiece arms;
    ArmourPiece chest;
    ArmourPiece legs;
    ArmourPiece classItem;
    Weapon kinetic;
    Weapon energy;
    Weapon heavy;
    Item ghost;

    boolean hasExoticWeapon;
    boolean hasExoticArmour;

    HashMap<Integer, ArmourPiece> helmetInventory;
    HashMap<Integer, ArmourPiece> armsInventory;
    HashMap<Integer, ArmourPiece> chestInventory;
    HashMap<Integer, ArmourPiece> legsInventory;
    HashMap<Integer, ArmourPiece> classItemInventory;
    HashMap<Integer, Weapon> kineticInventory;
    HashMap<Integer, Weapon> energyInventory;
    HashMap<Integer, Weapon> heavyInventory;
    HashMap<Integer, Item> ghostInventory;

    public Character(ArmourPiece hel, ArmourPiece arm, ArmourPiece che, ArmourPiece leg, ArmourPiece ci, Weapon kin, Weapon ene, Weapon hea, Item gho){
        helmet = hel;
        arms = arm;
        chest = che;
        legs = leg;
        classItem = ci;
        kinetic = kin;
        energy = ene;
        heavy = hea;
        ghost = gho;

        if (kinetic.isExotic || energy.isExotic || heavy.isExotic){
            hasExoticWeapon = true;
        }

        if (helmet.isExotic || arms.isExotic || chest.isExotic || legs.isExotic){
            hasExoticArmour = true;
        }

        helmetInventory = new HashMap<Integer, ArmourPiece>(9);
        armsInventory = new HashMap<Integer, ArmourPiece>(9);
        chestInventory = new HashMap<Integer, ArmourPiece>(9);
        legsInventory = new HashMap<Integer, ArmourPiece>(9);
        classItemInventory = new HashMap<Integer, ArmourPiece>(9);
    }
}
