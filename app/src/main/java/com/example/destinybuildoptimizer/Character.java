package com.example.destinybuildoptimizer;

import java.util.ArrayList;

public class Character {
    //0: hunter, 1: titan, 2: warlock
    Integer characterClass;
    ArmourPiece equippedHelmet;
    ArmourPiece equippedArms;
    ArmourPiece equippedChest;
    ArmourPiece equippedLegs;
    ArmourPiece equippedClassItem;
    Weapon      equippedKinetic;
    Weapon      equippedEnergy;
    Weapon      equippedHeavy;
    Ghost       equippedGhost;

    boolean hasExoticWeapon;
    boolean hasExoticArmour;

    ArrayList<ArmourPiece> helmetInventory;
    ArrayList<ArmourPiece> armsInventory;
    ArrayList<ArmourPiece> chestInventory;
    ArrayList<ArmourPiece> legsInventory;
    ArrayList<ArmourPiece> classItemInventory;
    ArrayList<Weapon>      kineticInventory;
    ArrayList<Weapon>      energyInventory;
    ArrayList<Weapon>      heavyInventory;
    ArrayList<Item>        ghostInventory;

    public Character(ArmourPiece hel, ArmourPiece arm, ArmourPiece che, ArmourPiece leg, ArmourPiece ci, Weapon kin, Weapon ene, Weapon hea, Ghost gho){
        equippedHelmet = hel;
        equippedArms = arm;
        equippedChest = che;
        equippedLegs = leg;
        equippedClassItem = ci;
        equippedKinetic = kin;
        equippedEnergy = ene;
        equippedHeavy = hea;
        equippedGhost = gho;

        if (equippedKinetic.isExotic || equippedEnergy.isExotic || equippedHeavy.isExotic){
            hasExoticWeapon = true;
        }

        if (equippedHelmet.isExotic || equippedArms.isExotic || equippedChest.isExotic || equippedLegs.isExotic){
            hasExoticArmour = true;
        }

        helmetInventory = new ArrayList<ArmourPiece>(9);
        armsInventory = new ArrayList<ArmourPiece>(9);
        chestInventory = new ArrayList<ArmourPiece>(9);
        legsInventory = new ArrayList<ArmourPiece>(9);
        classItemInventory = new ArrayList<ArmourPiece>(9);
        kineticInventory = new ArrayList<Weapon>(9);
        energyInventory = new ArrayList<Weapon>(9);
        heavyInventory = new ArrayList<Weapon>(9);
        ghostInventory = new ArrayList<Item>(9);
    }

}
