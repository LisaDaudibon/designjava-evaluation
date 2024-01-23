package com.zenika;

public class Story {
    private Hero theStorysHero;
    public Weapon theStorysWeapon;
    private Place thePlaceOfTheStory;
    private Enemy theStorysEnemy;
    public Story (Hero theStorysHero, Place thePlaceOfTheStory, Enemy theStorysEnemy) {
        this.theStorysHero = theStorysHero;
        this.theStorysWeapon = thePlaceOfTheStory.getLocalWeapon();
        this.thePlaceOfTheStory = thePlaceOfTheStory;
        this.theStorysEnemy = theStorysEnemy;
    }

    public Weapon getTheStorysWeapon() {
        return theStorysWeapon;
    }

    public Weapon setTheStorysWeapon(Hero theStorysHero) {
        return theStorysWeapon = theStorysHero.equipWeapon(thePlaceOfTheStory.getLocalWeapon());
    }

    @Override
    public String toString (){
        return String.format("""
                ✨ Il était une fois, l'histoire d'un héros. ✨
                
                🧙🏼‍♂️ Le héros de cette histoire est %s.
                %s
                
                📜 Un jour notre héros %s, partit à l'aventure dans %s, 
                %s
                Il trouva alors %s.
                
                😈 Peu de temps après, il croisa alors le chemin de %s.
                %s lui dit alors : %s
                
                ⚔️ Le combat était maintenant inévitable...
                %s : %s PV
                %s : %s dommage max/tour
                vs
                %s : %s PV
                %s tours pour invoquer son attaque ultime !
                """, theStorysHero.getName(), theStorysHero.getOriginStory(), theStorysHero.getName(),
                thePlaceOfTheStory.getName(), thePlaceOfTheStory.getDescription(), thePlaceOfTheStory.getLocalWeapon().getName(),
                theStorysEnemy.getName(), theStorysEnemy.getName(), theStorysEnemy.getProvocationSentence(),
                theStorysHero.getName(), theStorysHero.getHealth(), theStorysHero.getWeapon().getName(), theStorysHero.getWeapon().getMaxDamages(),
                theStorysEnemy.getName(), theStorysEnemy.getHealth(), theStorysEnemy.getCastTime());
    }
}
