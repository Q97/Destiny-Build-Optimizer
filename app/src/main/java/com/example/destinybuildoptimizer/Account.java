package com.example.destinybuildoptimizer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class Account {
    ArrayList<Character> characters;
    Character currentCharacter;
    ArrayList<Item> vault;
    ArrayList<ArmourPiece> helmetStorage;
    ArrayList<ArmourPiece> armsStorage;
    ArrayList<ArmourPiece> chestStorage;
    ArrayList<ArmourPiece> legsStorage;
    ArrayList<ArmourPiece> classItemStorage;
    ArrayList<Weapon> kineticStorage;
    ArrayList<Weapon> energyStorage;
    ArrayList<Weapon> heavyStorage;
    ArrayList<Ghost> ghostStorage;

    public Account(){
        characters = new ArrayList<>(3);
        vault = new ArrayList<>();
        helmetStorage = new ArrayList<>();
        armsStorage = new ArrayList<>();
        chestStorage = new ArrayList<>();
        legsStorage = new ArrayList<>();
        classItemStorage = new ArrayList<>();
        kineticStorage = new ArrayList<>();
        energyStorage = new ArrayList<>();
        heavyStorage = new ArrayList<>();
        ghostStorage = new ArrayList<>();
    }

    public void addCharacter(Character c){
        if(characters.size() < 3){
            characters.add(c);
        }
    }

    public <I extends Item> void addToVault(I i){
        vault.add(i);
    }

    public <I extends Item> void addToInventory(ArrayList<I> inv, I i){
        if (inv.size() < 9){
            inv.add(i);
        }
        else{
            vault.add(i);
        }
    }

    public void equipItem(Item i){
        Item tempItem;

        if(i instanceof ArmourPiece){
            switch(((ArmourPiece) i).itemSlot){
                case 0:
                    tempItem = i;
                    i = currentCharacter.equippedHelmet;
                    currentCharacter.equippedHelmet = (ArmourPiece)tempItem;
                    addToInventory(helmetStorage, (ArmourPiece)i);
                    break;
                case 1:
                    tempItem = i;
                    i = currentCharacter.equippedArms;
                    currentCharacter.equippedArms = (ArmourPiece)tempItem;
                    addToInventory(armsStorage, (ArmourPiece)i);
                    break;
                case 2:
                    tempItem = i;
                    i = currentCharacter.equippedChest;
                    currentCharacter.equippedChest = (ArmourPiece)tempItem;
                    addToInventory(chestStorage, (ArmourPiece)i);

                    break;
                case 3:
                    tempItem = i;
                    i = currentCharacter.equippedLegs;
                    currentCharacter.equippedLegs = (ArmourPiece)tempItem;
                    addToInventory(legsStorage, (ArmourPiece)i);

                    break;
                case 4:
                    tempItem = i;
                    i = currentCharacter.equippedClassItem;
                    currentCharacter.equippedClassItem = (ArmourPiece)tempItem;
                    addToInventory(classItemStorage, (ArmourPiece)i);
                    break;
            }
        }
        else if(i instanceof  Weapon){
            switch(((Weapon) i).itemSlot){
                case 0:
                    tempItem = i;
                    i = currentCharacter.equippedKinetic;
                    currentCharacter.equippedKinetic = (Weapon)tempItem;
                    addToInventory(kineticStorage, (Weapon)i);

                    break;
                case 1:
                    tempItem = i;
                    i = currentCharacter.equippedEnergy;
                    currentCharacter.equippedEnergy = (Weapon)tempItem;
                    addToInventory(energyStorage, (Weapon)i);
                    break;
                case 2:
                    tempItem = i;
                    i = currentCharacter.equippedHeavy;
                    currentCharacter.equippedHeavy= (Weapon)tempItem;
                    addToInventory(heavyStorage, (Weapon)i);
                    break;
            }
        }
        else if(i instanceof Ghost){
            tempItem = i;
            i = currentCharacter.equippedGhost;
            currentCharacter.equippedGhost = (Ghost)tempItem;
            addToInventory(ghostStorage, (Ghost)i);
        }
    }

    public void optimize(Integer characterClass, String targetStat){
        ArrayList<ArmourPiece> classHelmets = new ArrayList<>();
        ArrayList<ArmourPiece> classArms = new ArrayList<>();
        ArrayList<ArmourPiece> classChest = new ArrayList<>();
        ArrayList<ArmourPiece> classLegs = new ArrayList<>();

        for (ArmourPiece m : helmetStorage){
            if(m.getArmourClass() == characterClass)
                classHelmets.add(m);
        }

        for (ArmourPiece m : armsStorage){
            if(m.getArmourClass() == characterClass)
                classArms.add(m);
        }

        for (ArmourPiece m : chestStorage){
            if(m.getArmourClass() == characterClass)
                classChest.add(m);
        }

        for (ArmourPiece m : legsStorage){
            if(m.getArmourClass() == characterClass)
                classLegs.add(m);
        }

        ArmourPiece bestHelmet = helmetStorage.get(0);
        ArmourPiece bestArms = armsStorage.get(0);
        ArmourPiece bestChest = chestStorage.get(0);
        ArmourPiece bestLegs = legsStorage.get(0);

        for (ArmourPiece a : classHelmets){
            Integer x = (Integer)bestHelmet.getStats().get(targetStat);
            Integer y = (Integer)a.getStats().get(targetStat);
            if( x > y) bestHelmet = a;
    }

        for (ArmourPiece a : classArms){
            Integer x = (Integer)bestArms.getStats().get(targetStat);
            Integer y = (Integer)a.getStats().get(targetStat);
            if(x > y) bestArms = a;
        }

        for (ArmourPiece a : classChest){
            Integer x = (Integer)bestChest.getStats().get(targetStat);
            Integer y = (Integer)a.getStats().get(targetStat);
            if(x > y) bestChest = a;
        }

        for (ArmourPiece a : classLegs){
            Integer x = (Integer)bestLegs.getStats().get(targetStat);
            Integer y = (Integer)a.getStats().get(targetStat);
            if(x > y) bestLegs = a;
        }

        equipItem(bestHelmet);
        equipItem(bestArms);
        equipItem(bestChest);
        equipItem(bestLegs);
    }
}
