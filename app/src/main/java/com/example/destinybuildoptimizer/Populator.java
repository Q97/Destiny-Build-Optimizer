package com.example.destinybuildoptimizer;

import java.util.ArrayList;

public class Populator {
    public static void populate(){
        Account account = new Account();
        DApplication.setAccount(account);

        ArmourPiece a0 = new ArmourPiece(0, "a", "drawable/abhorrent_imperative_mask_icon.png", "drawable/abhorrent_imperative_mask_preview.jpg", 0,0);
        ArmourPiece a1 = new ArmourPiece(1, "b", "drawable/abhorrent_imperative_grasps_icon.png", "drawable/abhorrent_imperative_grasps_preview.jpg", 1,0);
        ArmourPiece a2 = new ArmourPiece(2, "c", "drawable/abhorrent_imperative_vest_icon.png", "drawable/abhorrent_imperative_vest_preview.jpg", 2,0);
        ArmourPiece a3 = new ArmourPiece(3, "d", "drawable/abhorrent_imperative_strides_icon.png", "drawable/abhorrent_imperative_strides_preview.jpg", 3,0);
        ArmourPiece a4 = new ArmourPiece(4, "e", "drawable/abhorrent_imperative_cloak_icon.png", "drawable/abhorrent_imperative_cloak_preview.jpg", 4,0);
        ArmourPiece a5 = new ArmourPiece(5, "", "drawable/gensym_knight_casque_icon1.jpg", "drawable/gensym_knight_casque_preview.jpg", 0,1);
        ArmourPiece a6 = new ArmourPiece(6, "", "drawable/gensym_knight_grips_icon.jpg", "drawable/gensym_knight_grips_preview.jpg", 1,1);
        ArmourPiece a7 = new ArmourPiece(7, "", "drawable/gensym_knight_cuirass_icon.jpg", "drawable/gensym_knight_cuirass_preview.jpg", 2,1);
        ArmourPiece a8 = new ArmourPiece(8, "", "drawable/gensym_knight_strides_icon.jpg", "drawable/gensym_knight_strides_preview.jpg", 3,1);
        ArmourPiece a9 = new ArmourPiece(9, "", "drawable/gensym_knight_cloak_icon.jpg", "drawable/gensym_knight_cloak_preview.jpg",4,1);
        ArmourPiece a10 = new ArmourPiece(10, "", "","" ,0,2);
        ArmourPiece a11 = new ArmourPiece(11, "", "", "",1,2);
        ArmourPiece a12 = new ArmourPiece(12, "", "", "",2,2);
        ArmourPiece a13 = new ArmourPiece(13, "", "", "",3,2);
        ArmourPiece a14 = new ArmourPiece(14, "", "", "",4,2);

        Weapon w0 = new Weapon(15, "", "", "", 0);
        Weapon w1 = new Weapon(16, "", "", "", 1);
        Weapon w2 = new Weapon(17, "", "", "", 2);
        Weapon w3 = new Weapon(18, "", "", "", 0);
        Weapon w4 = new Weapon(19, "", "", "", 1);
        Weapon w5 = new Weapon(20, "", "", "", 2);
        Weapon w6 = new Weapon(21, "", "", "", 0);
        Weapon w7 = new Weapon(22, "", "", "", 1);
        Weapon w8 = new Weapon(23, "", "", "", 2);

        Ghost g0 = new Ghost(24, "", "","");
        Ghost g1 = new Ghost(25, "", "","");
        Ghost g2 = new Ghost(26, "", "","");

        Character ch0 = new Character(a0, a1, a2, a3, a4, w0, w1, w2, g0);
        Character ch1 = new Character(a5, a6, a7, a8, a9, w3, w4, w5, g1);
        Character ch2 = new Character(a10, a11, a12, a13, a14, w6, w7, w8, g2);

        account.addCharacter(ch0);
        account.addCharacter(ch1);
        account.addCharacter(ch2);

        ArmourPiece a100 = new ArmourPiece(100, "aa", "drawable/the_took_offense_helmet_icon.jpg", "drawable/the_took_offense_helmet_preview.jpg", 0,0);
        ArmourPiece a101 = new ArmourPiece(101, "ab", "drawable/the_took_offense_gauntlets_icon.jpg", "drawable/the_took_offense_gauntlets_preview.jpg", 1,0);

        account.addToInventory(ch0.helmetInventory, a100);
        account.addToVault(a101);

    }
}
