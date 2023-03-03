package oop_task1;
public class Program {
    public static void main(String[] args) {
        Peasant peasant = new Peasant("John", 100);
        Rogue rogue = new Rogue("Alice", 150);
        Sniper sniper = new Sniper("Bob", 120);
        Warlock warlock = new Warlock("Eve", 80);
        Spearman spearman = new Spearman("David", 200);
        Crossbowman crossbowman = new Crossbowman("Olivia", 110);
        Monk monk = new Monk("Grace", 90);

        // можем использовать каждый персонаж и вызывать их методы
        peasant.attack(rogue);
        rogue.attack(spearman);
        sniper.heal(50);
        warlock.heal(30);
        crossbowman.attack(monk);
        spearman.takeDamage(50);
        monk.heal(20);
    }
}
/