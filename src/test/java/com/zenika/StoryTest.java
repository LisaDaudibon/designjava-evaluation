package com.zenika;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StoryTest {

    private final Hero balourd = new Hero( "Balourd",
            "Ce petit ourson aimait se prendre pour un pirate de l'espace. \n" +
                    "Chaque nuit, il partait dans ses rêves visitait de nouvelles planètes à bord de son magnifique vaisseau spatial.");
    private final Weapon pioche = new Weapon("une pioche", 25 );
    private final Place foretEnchantee = new Place("une forêt enchantée", "ce lieu bourdonné de fées et korrigans qui jouaient joyeusement tous ensemble.", pioche);
    private final Enemy alfred = new Enemy("Alfred", "Je te cherche depuis bien longtemps et je t'ai enfin trouvé !", 10);
    private final Story bestTestStoryEver = new Story(balourd, foretEnchantee, alfred);

    @Test
    void shouldSetTheStorysWeaponName() {
        bestTestStoryEver.setTheStorysWeapon(balourd);

        String expectedString = "une pioche";
        String resultString = bestTestStoryEver.getTheStorysWeapon().getName();

        assertEquals(expectedString, resultString);
    }

    @Test
    void shouldSetTheStorysWeaponMaxDamages() {
        bestTestStoryEver.setTheStorysWeapon(balourd);

        int expectedInteger = 25;
        int resultInteger = bestTestStoryEver.getTheStorysWeapon().getMaxDamages();

        assertEquals(expectedInteger, resultInteger);
    }

    @Test
    void shouldDisplayTheStory() {
        bestTestStoryEver.setTheStorysWeapon(balourd);

        String expectedString = """
                ✨ Il était une fois, l'histoire d'un héros. ✨
                                
                🧙🏼‍♂️ Le héros de cette histoire est Balourd.
                Ce petit ourson aimait se prendre pour un pirate de l'espace.\s
                Chaque nuit, il partait dans ses rêves visitait de nouvelles planètes à bord de son magnifique vaisseau spatial.
                                
                📜 Un jour notre héros Balourd, partit à l'aventure dans une forêt enchantée,
                ce lieu bourdonné de fées et korrigans qui jouaient joyeusement tous ensemble.
                Il trouva alors une pioche.
                                
                😈 Peu de temps après, il croisa alors le chemin de Alfred.
                Alfred lui dit alors : Je te cherche depuis bien longtemps et je t'ai enfin trouvé !
                                
                ⚔️ Le combat était maintenant inévitable...
                Balourd : 100 PV
                une pioche : 25 dommage max/tour
                vs
                Alfred : 100 PV
                10 tours pour invoquer son attaque ultime !
                """;
        String resultString = bestTestStoryEver.toString();

        assertEquals(expectedString.trim(), resultString.trim());
    }
}