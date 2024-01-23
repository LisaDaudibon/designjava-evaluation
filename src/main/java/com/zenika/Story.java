package com.zenika;

public class Story {
    private Hero theStorysHero;
    public Weapon theStorysWeapon;
    private Place thePlaceOfTheStory;
    private Enemy theStorysEnemy;
    private final int enemyMaximumDamages;
    private int roundCount = 1;
    public Story (Hero theStorysHero, Place thePlaceOfTheStory, Enemy theStorysEnemy) {
        this.theStorysHero = theStorysHero;
        this.theStorysWeapon = thePlaceOfTheStory.getLocalWeapon();
        this.thePlaceOfTheStory = thePlaceOfTheStory;
        this.theStorysEnemy = theStorysEnemy;
        this.enemyMaximumDamages = 1000000;
    }

    public Weapon getTheStorysWeapon() {
        return theStorysWeapon;
    }

    public Weapon setTheStorysWeapon(Hero theStorysHero) {
        return theStorysWeapon = theStorysHero.equipWeapon(thePlaceOfTheStory.getLocalWeapon());
    }

    public void theBestFightOfAllTime(Hero fighter, Enemy vilain){
        System.out.printf("Le héros %s a %s PV ! Allez courage ... \n", fighter.getName(), fighter.getHealth());
        System.out.printf("Le méchant de cette histoire, %s a %s PV ! Booooouuuuhh \n", vilain.getName(), vilain.getHealth());

        while ( fighter.getHealth() > 0 && vilain.getHealth() > 0 ) {
            roundCount = roundCount + 1;
//            System.out.println(roundCount);
            if (roundCount < vilain.getCastTime()){
                int damagesDealt = fighter.dealDamages();
                vilain.takeDamages(damagesDealt);
//                System.out.printf("Notre héros a infligé %s dommages à son adversaire %s. Il reste %s PV à notre méchant. \n",
//                        damagesDealt, vilain.getName(), vilain.getHealth());
            } else {
                fighter.takeDamages(enemyMaximumDamages);
            }
        }

        if (fighter.getHealth() > 0 ) {
            System.out.printf("Heureusement, notre histoire se termine bien et notre héros %s sort victorieux de ce beau combat. \n", fighter.getName());
        } else if (vilain.getHealth() > 0 ) {
            System.out.printf("Malheureusement notre héros %s s'est fait désintégrer par l'attaque surpuissante de %s \n", fighter.getName(), vilain.getName());
        }
    }
    public void storyTime (Hero fighter, Enemy villain) {
        System.out.println(this);
        theBestFightOfAllTime(fighter, villain);
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
                %s : %s dommages max/tour
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
