package com.zenika;

import java.util.Random;

public class Hero extends Character implements Fighter {
    private String originStory;
    private Weapon heroWeapon;

    private int damagesDealt;

    public Hero(String name, String originStory) {
        super(name);
        this.originStory = originStory;
        this.heroWeapon = null;
    }

    public String getOriginStory() {
        return originStory;
    }

    public Weapon equipWeapon( Weapon weapon) {
        return heroWeapon = weapon;
    }

    public Weapon getWeapon(){
        return heroWeapon;
    }
    @Override
    public int dealDamages() {
        if (heroWeapon == null) {
            return damagesDealt = 0;
        } else {
            Random rand = new Random();
            return damagesDealt = rand.nextInt(1, heroWeapon.getMaxDamages());
        }
    }
}
