package com.zenika;

public class Enemy extends Character {
    private String provocationSentence;
    private int castTime;
    public Enemy( String name, String provocationSentence, int castTime) {
        super(name);
        this.provocationSentence = provocationSentence;
        this.castTime = castTime;
    }

    public String getProvocationSentence() {
        return provocationSentence;
    }

    public int getCastTime() {
        return castTime;
    }

}
