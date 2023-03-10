package oop_task1;
public class Crossbowman extends BaseHero {
   /**
    * Арбалетчик
    * @param name - Имя
    */
    private int shots;
    private int minDamage;
    private int maxDamage;
    
    public Crossbowman(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic) {
        super(name, attack, defense, health, speed, delivery, magic);
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
    }
    
    public Crossbowman(String name, int health, int speed) {
        super(name, 6, 3, health, speed, 0, 0);
        this.shots = 16;
        this.minDamage = 2;
        this.maxDamage = 3;
    }
    
    public int getShots() {
        return shots;
    }
    
    public int getMinDamage() {
        return minDamage;
    }
    
    public int getMaxDamage() {
        return maxDamage;
    }
    // public Crossbowman(String name) {
    //     super(name, 100);
    // }

    // public Crossbowman() {
    //     super();
    // }

    // public void reload() {
    //     System.out.println(this.name + " is reloading their crossbow.");
    // }

    // public void fire() {
    //     System.out.println(this.name + " is firing their crossbow.");
    // }
    // public void step() {
    //     System.out.println("Crossbowman walks...");
    // }
    // @Override
    // public String getInfo() {
    //     return "Я Арбалетчик";
    // }
}