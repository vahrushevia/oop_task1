package oop_task1;

public class Sniper extends BaseHero {

    /**
     * Снайпер
     * 
     * @param name - Имя
     */
    public Sniper(String name) {
        super(name, 50);
    }

    public Sniper() {
        super();
    }

    public void aim() {
        System.out.println(this.name + " is aiming the sniper rifle.");
    }

    public void shoot() {
        System.out.println(this.name + " is shooting the sniper rifle.");
    }
    public void step() {
        System.out.println("Sniper walks...");
    }
    public String getInfo() {
        return "Я Снайпер";
    }
}