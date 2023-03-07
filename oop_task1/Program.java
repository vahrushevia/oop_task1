package oop_task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List <BaseHero> heroList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int heroType = random.nextInt(7); // Случайный тип персонажа от 0 до 6
            switch (heroType) {
                case 0:
                    heroList.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    heroList.add(new Rogue("Разбойник #" + i));
                    break;
                case 2:
                    heroList.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    heroList.add(new Warlock("Колдун #" + i));
                    break;
                case 4:
                    heroList.add(new Spearman("Копейщик #" + i));
                    break;
                case 5:
                    heroList.add(new Crossbowman("Арбалетчик #" + i));
                    break;
                case 6:
                    heroList.add(new Monk("Монах #" + i));
                    break;
            }
        }

        for (BaseHero hero : heroList) {
            System.out.println(hero.getInfo());
        }



        // Peasant peasant = new Peasant("John");
        // Rogue rogue = new Rogue("Jack");
        // Sniper sniper = new Sniper("Emily");
        // Warlock warlock = new Warlock("Victor");
        // Spearman spearman = new Spearman("Gus");
        // Crossbowman crossbowman = new Crossbowman("Lily");
        // Monk monk = new Monk("Olivia");

        // Peasant peasant = new Peasant("John", 150);
        // Rogue rogue = new Rogue("Alice", 150);
        // Sniper sniper = new Sniper("Bob", 120);
        // Warlock warlock = new Warlock("Eve", 80);
        // Spearman spearman = new Spearman("David", 200);
        // Crossbowman crossbowman = new Crossbowman("Olivia", 110);
        // Monk monk = new Monk("Grace", 90);

        // можем использовать каждый персонаж и вызывать их методы
        // peasant.attack(rogue);
        // rogue.attack(spearman);
        // sniper.heal(50);
        // warlock.heal(30);
        // crossbowman.attack(monk);
        // spearman.takeDamage(50);
        // monk.heal(20);
    }
}
