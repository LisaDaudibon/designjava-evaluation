package com.zenika;

public class Place {
    private String name;
    private String description;
    private Weapon localWeapon;
    public Place (String name, String description, Weapon localWeapon) {
        this.name = name;
        this.description = description;
        this.localWeapon = localWeapon;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Weapon getLocalWeapon() {
        return localWeapon;
    }
}
