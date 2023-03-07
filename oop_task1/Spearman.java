package oop_task1;

public class Spearman extends BaseHero {
   
    /**
     * Копейщик
     * 
     * @param name - Имя
     */
    public Spearman(String name) {
        super(name, 150);
    }


    public Spearman() {
        super();
    }

    public void brace() {
        System.out.println(this.name + " is bracing with their spear.");
    }

    public void thrust() {
        System.out.println(this.name + " is thrusting their spear.");
    }
    public void step() {
        System.out.println("Spearman walks...");
    }
    public String getInfo() {
        return "Я Копейщик";
    }
}

