package oop_task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Program {
    public static void main(String[] args) {

        List<BaseHero> heroesList1 = new ArrayList<>();
        List<BaseHero> heroesList2 = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int heroType1 = random.nextInt(4); // Случайный тип персонажа от 0 до 3
            int heroType2 = random.nextInt(4) + 4; // Случайный тип персонажа от 4 до 7
            switch (heroType1) {
                case 0:
                    heroesList1.add(new Peasant("Крестьянин #" + i));
                    break;
                case 1:
                    heroesList1.add(new Rogue("Разбойник #" + i));
                    break;
                case 2:
                    heroesList1.add(new Sniper("Снайпер #" + i));
                    break;
                case 3:
                    heroesList1.add(new Warlock("Колдун #" + i));
                    break;
            }
            switch (heroType2) {
                case 4:
                    heroesList2.add(new Peasant("Крестьянин #" + i));
                    break;
                case 5:
                    heroesList2.add(new Spearman("Копейщик #" + i));
                    break;
                case 6:
                    heroesList2.add(new Crossbowman("Арбалетчик #" + i));
                    break;
                case 7:
                    heroesList2.add(new Monk("Монах #" + i));
                    break;
            }
        }

        List<BaseHero> allHeroes = new ArrayList<>();
        allHeroes.addAll(heroesList1);
        allHeroes.addAll(heroesList2);

        // Сортируем всех персонажей по скорости
        Collections.sort(allHeroes, (h1, h2) -> h2.getSpeed() - h1.getSpeed());

        // Выводим информацию обо всех персонажах
        for (BaseHero hero : allHeroes) {
            System.out.println(hero.getInfo());
        }
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
