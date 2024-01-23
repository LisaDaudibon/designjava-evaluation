package com.zenika;

public abstract class Character {
    private String name;

    private int pv;
    public Character ( String name) {
        this.name = name;
        this.pv = 100;
    }
    public String getName() {
        return name;
    }
    public int getHealth() {
        return pv;
    }

    public int setHealth() { return pv = this.pv; }

    public int takeDamages ( int enemyWeaponDamages) {
        return pv = Math.subtractExact(this.getHealth(), enemyWeaponDamages);
    }
}
