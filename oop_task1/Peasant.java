package oop_task1;

public class Peasant extends BaseHero {

   /**
    * Крестьянин
    * @param name - Имя
    */
    private int attack;
    private int defense;
    private int shots;
    private int damage;
    private int health;
    private int speed;
    private int delivery;
    private int magic;

    public Peasant(String name) {
        super(name);
        this.attack = 1;
        this.defense = 1;
        this.shots = 0;
        this.damage = 1;
        this.health = 11;
        this.speed = 3;
        this.delivery = 3;
        this.magic = 0;
    }

    public Peasant(String name, int attack, int defense, int shots, int damage, int health, int speed, int delivery, int magic) {
        super(name);
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.damage = damage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getShots() {
        return shots;
    }

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public int getSpeed() {
        return speed;
    }

    public int getDelivery() {
        return delivery;
    }

    public int getMagic() {
        return magic;
    }
    // private static final int ATTACK = 1;
    // private static final int DEFENSE = 1;
    // private static final int SHOTS = 0;
    // private static final int DAMAGE = 1;
    // private static final int HEALTH = 1;
    // private static final int SPEED = 3;
    // private static final int CARRYING_CAPACITY = 1;
    // private static final int MAGIC = 0;

    // public Peasant(String name, int hp) {
    //     super(name, hp);
    // }

    // public Peasant(String name) {
    //     super(name, HEALTH);
    // }

    // public Peasant() {
    //     super();
    // }

    // @Override
    // public void step() {
    //     System.out.println("Peasant walks...");
    // }

    // @Override
    // public void specialAbility() {
    //     // Peasant does not have a special ability
    // }

    // @Override
    // public String getInfo() {
    //     return String.format("Я крестьянин: %s  Hp: %d  Type: %s  Attack: %d  Defense: %d  Shots: %d  Damage: %d  Health: %d  Speed: %d  Carrying capacity: %d  Magic: %d",
    //             this.name, this.hp, this.getClass().getSimpleName(), ATTACK, DEFENSE, SHOTS, DAMAGE, HEALTH, SPEED, CARRYING_CAPACITY, MAGIC);
    // }
  

   
}
