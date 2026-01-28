package tema4;

import java.util.Scanner;

public class HeroMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Hero hero1 = new Hero("Heroe1", 0, 100, 150, 0, 20, 5);
        Hero hero2 =new Hero("Heroe2", 0, 100, 150, 0, 20, 5);

        System.out.println("Introduce las stats del héroe: ");
        System.out.println("Nombre: ");
        hero2.setName(sc.nextLine());
        System.out.println("Salud: ");
        hero2.setHealth(sc.nextInt());
        System.out.println("Ataque: ");
        hero2.setAttack(sc.nextInt());
        System.out.println("Defensa: ");
        hero2.setDefense(sc.nextInt());

        hero1.drinkPotion();
        hero1.goRest();
        hero1.levelUp();
        hero1.makeAttack(hero2);
        System.out.println(hero1);
        System.out.println(hero2);
    }
}
