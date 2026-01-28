package tema4;

import java.util.Random;

public class HeroRol {
    public static void main(String[] args) {
        Hero myHero = new Hero("Héroe", 1, 150, 150, 0, 30, 20);
        Random random = new Random();
        int horda = 0;

// bucle de batalla
        while (myHero.getHealth() > 0) {
            horda++;
            System.out.println("----¡HORDA NÚMERO " + horda + "!-----");

            int enemyCount = random.nextInt(3) + 1;
            Hero[] enemys = new Hero[enemyCount];
            int enemysLeft = enemyCount;

            for (int i = 0; i < enemys.length; i++) {
                enemys[i] = new Hero ("Enemigo " + (i+1), 1, 50, 50, 0, 15, 5);
            }
            System.out.println("¡Han aparecido " + enemyCount + " enemigos!");

            while (myHero.getHealth() > 0 && enemysLeft > 0) {

// prob huida del 10%
                for (int i = 0; i < enemys.length; i++) {
                    if (enemys[i] != null) {
                        if (random.nextDouble() == 0.1) {
                            System.out.println("Un enemigo ha huido del combate.");
                            enemys[i] = null;
                            enemysLeft--;
                        }
                    }
                }

                if (enemysLeft <= 0) break;

// ataque del heroe
                for  (int i = 0; i < enemys.length; i++) {
                    if (enemys[i] != null) {
                        System.out.println("¡" + myHero.getName() + " ataca!");
                        myHero.makeAttack(enemys[i]);

                        if (enemys[i].getHealth() <=0) {
                            System.out.println("Un enemigo ha sido derrotado.");
                            enemys[i] = null;
                            enemysLeft--;
                        }
                        break;
                    }
                }

// turno del enemigo
                for (int i = 0; i < enemys.length; i++) {
                    if (enemys[i] != null && myHero.getHealth() > 0) {
                        System.out.println("¡El enemigo contraataca!");
                        enemys[i].makeAttack(myHero);
                    }
                }

            }

// prob de descansar del 0.1%
            if (random.nextDouble() < 0.1) {
                System.out.println("Tomaste un descanso tras la horda y recuperaste 50 puntos de vida.");
                myHero.goRest();
            }

            if (random.nextDouble() < 0.1) {
                System.out.println("Encontraste una poción y te la tomas para recuperar 10 puntos de vida");
                myHero.drinkPotion();
            }

// indicador de vida tras la horda
            System.out.println("Te quedan " + myHero.getHealth() + " puntos de vida tras la horda.");

        }

// termina la partida cuando te quedas sin vida
        System.out.println("¡HAS MUERTO!");
        System.out.println("Sobreviviste " + horda + " hordas.");
        System.out.println("¡ENHORABUENA!");

    }
}
