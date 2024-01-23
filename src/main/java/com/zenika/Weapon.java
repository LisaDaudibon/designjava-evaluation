package com.zenika;

public class Weapon {
    private String name;
    private int maxDamages;
    private Weapon (String name, int maxDamages){
        this.name = name;
        this.maxDamages = maxDamages;
    }

    public String getName() {
        return name;
    }

    public int getMaxDamages() {
        return maxDamages;
    }
}
