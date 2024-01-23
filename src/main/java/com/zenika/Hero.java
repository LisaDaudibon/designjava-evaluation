package com.zenika;

public class Hero {
    private String name;
    private String originStory;
    private Weapon heroWeapon;
    private int pv;

    public Hero(String name, String originStory) {
        this.name = name;
        this.originStory = originStory;
        this.heroWeapon = null;
        this.pv = 100;
    }

    public String getOriginStory() {
        return originStory;
    }

    public String getName() {
        return name;
    }

    public Weapon equipWeapon( Weapon weapon) {
        return heroWeapon = weapon;
    }

    public Weapon getWeapon(){
        return heroWeapon;
    }

    public int takeDamages ( int pv, Weapon heroWeapon) {
        return Math.subtractExact(pv, heroWeapon.getMaxDamages());
    }
}
