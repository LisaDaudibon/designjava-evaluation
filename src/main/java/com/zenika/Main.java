package com.zenika;

public class Main {
    public static void main(String[] args) {
        Hero balourd = new Hero( "Balourd",
                "Ce petit ourson aimait se prendre pour un pirate de l'espace. \n" +
                        "Chaque nuit, il partait dans ses rêves visitait de nouvelles planètes à bord de son magnifique vaisseau spatial.");
        Weapon pioche = new Weapon("une pioche", 25 );
        Place foretEnchantee = new Place("une forêt enchantée", "ce lieu bourdonné de fées et korrigans qui jouaient joyeusement tous ensemble.", pioche);
        Enemy alfred = new Enemy("Alfred", "Je te cherche depuis bien longtemps et je t'ai enfin trouvé !", 10);

        Story bestStoryEver = new Story(balourd, foretEnchantee, alfred);
        bestStoryEver.setTheStorysWeapon(balourd);
        bestStoryEver.storyTime(balourd, alfred);
    }
}