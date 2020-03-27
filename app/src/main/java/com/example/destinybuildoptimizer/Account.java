package com.example.destinybuildoptimizer;

import com.example.destinybuildoptimizer.Character;
import com.example.destinybuildoptimizer.ArmourPiece;
import com.example.destinybuildoptimizer.Item;
import com.example.destinybuildoptimizer.Weapon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class Account {
    ArrayList<Character> characters;
    Character currentCharacter;
    Vault vault;
    HashMap<Integer, ArmourPiece> helmetStorage;
    HashMap<Integer, ArmourPiece> armsStorage;
    HashMap<Integer, ArmourPiece> chestStorage;
    HashMap<Integer, ArmourPiece> legsStorage;
    HashMap<Integer, ArmourPiece> classItemStorage;
    HashMap<Integer, Weapon> kineticStorage;
    HashMap<Integer, Weapon> energyStorage;
    HashMap<Integer, Weapon> heavyStorage;
    HashMap<Integer, Ghost> ghostStorage;

    public Account(){
        characters = new ArrayList<>(3);
        vault = new Vault();
        helmetStorage = new HashMap<>();
        armsStorage = new HashMap<>();
        chestStorage = new HashMap<>();
        legsStorage = new HashMap<>();
        classItemStorage = new HashMap<>();
        kineticStorage = new HashMap<>();
        energyStorage = new HashMap<>();
        heavyStorage = new HashMap<>();
        ghostStorage = new HashMap<>();
    }

    public void setCurrentCharacter(int cNum){
        currentCharacter = characters.get(cNum);
    }

    public void addCharacter(Character c){
        if(characters.size() < 3){
            characters.add(c);
        }
    }

    public void swap(Item i){
        Item tempItem;

        if(i instanceof ArmourPiece){
            switch(((ArmourPiece) i).itemSlot){
                case 0:
                    tempItem = i;
                    i = currentCharacter.equippedHelmet;
                    currentCharacter.equippedHelmet = (ArmourPiece)tempItem;
                    break;
                case 1:
                    tempItem = i;
                    i = currentCharacter.equippedArms;
                    currentCharacter.equippedArms = (ArmourPiece)tempItem;
                    break;
                case 2:
                    tempItem = i;
                    i = currentCharacter.equippedChest;
                    currentCharacter.equippedChest = (ArmourPiece)tempItem;
                    break;
                case 3:
                    tempItem = i;
                    i = currentCharacter.equippedLegs;
                    currentCharacter.equippedLegs = (ArmourPiece)tempItem;
                    break;
                case 4:
                    tempItem = i;
                    i = currentCharacter.equippedClassItem;
                    currentCharacter.equippedClassItem = (ArmourPiece)tempItem;
                    break;
            }
        }
        else if(i instanceof  Weapon){
            switch(((Weapon) i).itemSlot){
                case 0:
                    tempItem = i;
                    i = currentCharacter.equippedKinetic;
                    currentCharacter.equippedKinetic = (Weapon)tempItem;
                    break;
                case 1:
                    tempItem = i;
                    i = currentCharacter.equippedEnergy;
                    currentCharacter.equippedEnergy = (Weapon)tempItem;
                    break;
                case 2:
                    tempItem = i;
                    i = currentCharacter.equippedHeavy;
                    currentCharacter.equippedHeavy= (Weapon)tempItem;
                    break;
            }
        }
        else if(i instanceof Ghost){
            tempItem = i;
            i = currentCharacter.equippedGhost;
            currentCharacter.equippedGhost= (Ghost)tempItem;
        }
    }

    /*
    public void optimize(Integer characterClass, String targetStat){
        ArrayList<ArmourPiece> classHelmets = new ArrayList<>();
        ArrayList<ArmourPiece> classArms = new ArrayList<>();
        ArrayList<ArmourPiece> classChest = new ArrayList<>();
        ArrayList<ArmourPiece> classLegs = new ArrayList<>();

        for (Map.Entry m : helmetStorage.entrySet()){
            ArmourPiece current = (ArmourPiece)m.getValue();
            if(current.getArmourClass() == characterClass)
                classHelmets.add(current);
        }

        for (Map.Entry m : armsStorage.entrySet()){
            ArmourPiece current = (ArmourPiece)m.getValue();
            if(current.getArmourClass() == characterClass)
                classArms.add(current);
        }

        for (Map.Entry m : chestStorage.entrySet()){
            ArmourPiece current = (ArmourPiece)m.getValue();
            if(current.getArmourClass() == characterClass)
                classChest.add(current);
        }

        for (Map.Entry m : legsStorage.entrySet()){
            ArmourPiece current = (ArmourPiece)m.getValue();
            if(current.getArmourClass() == characterClass)
                classLegs.add(current);
        }

        ArmourPiece bestHelmet;
        ArmourPiece bestArms;
        ArmourPiece bestChest;
        ArmourPiece bestLegs;

        bestHelmet = Collections.max(helmetStorage, Comparator.comparing((ArmourPiece a) -> a.getStats().get(targetStat)));
    }*/
}
