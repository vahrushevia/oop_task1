package oop_task1;

public class Warlock extends BaseHero {

    // Конструктор с параметрами
    public Warlock(String name) {
        super(17, 12, 0, "-5", 30, 9, 0, 1, name);
    }

    // Второй конструктор с возможностью задания всех характеристик героя
    public Warlock(int attack, int defense, int shots, String damage, int health, int speed, int delivery, int magic, String name) {
        super(attack, defense, shots, damage, health, speed, delivery, magic, name);
    }
     /**
     * Колдун
     * 
     * @param name - Имя
     */

    // public Warlock(String name) {
    //     super(name, 50);
    // }

    // public Warlock() {
    //     super();
    // }

    // public void curse() {
    //     System.out.println(this.name + " is cursing the enemy.");
    // }

    // public void summonDemon() {
    //     System.out.println(this.name + " is summoning a demon.");
    // }
    // public void step() {
    //     System.out.println("Warlock walks...");
    // }
    // public String getInfo() {
    //     return "Я Колдун";
    // }
}