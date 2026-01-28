package tema4;

import java.util.Random;

public class Hero {
    String name;
    int level;
    int health;
    int maxHealth;
    int experience;
    int attack;
    int defense;
    static final int potion = 10;
    static final int rest = 50;
    static final int lvlUpXp = 50;

    public Hero() {
        name = "Nick";
        level = 0;
        health = 0;
        maxHealth = 150;
        experience = 0;
        attack = 0;
        defense = 0;
    }

    public Hero(String name, int level, int health, int maxHealth, int experience, int attack,  int defense) {
        this.name = name;
        this.level = level;
        this.health = health;
        this.maxHealth = maxHealth;
        this.experience = experience;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getLevel() {return level;}
    public void setLevel(int level) {this.level = level;}
    public int getHealth() {return health;}
    public void setHealth(int health) {this.health = health;}
    public int getMaxHealth() {return maxHealth;}
    public void setMaxHealth(int maxHealth) {this.maxHealth = maxHealth;}
    public int getExperience() {return experience;}
    public void setExperience(int experience) {this.experience = experience;}
    public int getAttack() {return attack;}
    public void setAttack(int attack) {this.attack = attack;}
    public int getDefense() {return defense;}
    public void setDefense(int defense) {this.defense = defense;}


    public void drinkPotion() {
        health += potion;
        if (health > maxHealth) health = maxHealth;
    }

    public void goRest() {
        health += rest;
        if (health > maxHealth) health = maxHealth;
    }

    public String toString() {
        return String.format("Name: " + name
        + "\nLvl-> " + level
        + "\nHp--> " + health + "/" + maxHealth
        + "\nXp--> " + experience
        + "\nAtt-> " + attack
        + "\nDf--> " + defense);
    }

    public void makeAttack(Hero hero1, Hero hero2) {
        int maxAttack = Math.max(hero1.attack - hero2.defense, 10);
        Random rand = new Random();
        int damageDone = rand.nextInt(maxAttack);
        if (damageDone <=0) {
            damageDone = 1;
        }
        hero2.health -= damageDone;
        if (hero2.health <= 0) {
            hero2.health = 0;
        }

        hero1.experience += 10;
        if (hero1.experience == lvlUpXp) {
            levelUp();
            experience = 0;
        }
    }

    public void levelUp() {
            experience = 0;
            level++;
            health += 10;
            if (health > maxHealth) health = maxHealth;
            attack += 1;
            defense += 1;
    }

}
