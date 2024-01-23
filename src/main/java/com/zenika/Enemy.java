package com.zenika;

public class Enemy {
    private String name;
    private String provocationSentence;
    private int pv;
    private int castTime;
    public Enemy ( String name, String provocationSentence, int castTime) {
        this.name = name;
        this.provocationSentence = provocationSentence;
        this.pv = 100;
        this.castTime = castTime;
    }

    public String getName() {
        return name;
    }

    public String getProvocationSentence() {
        return provocationSentence;
    }

    public int getPv() {
        return pv;
    }

    public int getCastTime() {
        return castTime;
    }

    public int takeDamages (int pv, Weapon heroWeapon) {
        return Math.subtractExact(pv, heroWeapon.getMaxDamages());
    }
}
