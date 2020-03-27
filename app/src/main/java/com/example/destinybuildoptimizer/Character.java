package com.example.destinybuildoptimizer;

import java.util.ArrayList;
<<<<<<< HEAD
=======
import java.util.HashMap;
>>>>>>> origin/master

public class Character {
    //0: hunter, 1: titan, 2: warlock
    Integer characterClass;
<<<<<<< HEAD
    ArmourPiece equippedHelmet;
    ArmourPiece equippedArms;
    ArmourPiece equippedChest;
    ArmourPiece equippedLegs;
    ArmourPiece equippedClassItem;
    Weapon      equippedKinetic;
    Weapon      equippedEnergy;
    Weapon      equippedHeavy;
    Ghost       equippedGhost;
=======
    ArmourPiece helmet;
    ArmourPiece arms;
    ArmourPiece chest;
    ArmourPiece legs;
    ArmourPiece classItem;
    Weapon kinetic;
    Weapon energy;
    Weapon heavy;
    Item ghost;
>>>>>>> origin/master

    boolean hasExoticWeapon;
    boolean hasExoticArmour;

<<<<<<< HEAD
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

=======
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
>>>>>>> origin/master
}
