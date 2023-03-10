package oop_task1;
import java.util.Random;

public abstract class BaseHero {
    private int attack;
    private int defense;
    private int shots;
    private int minDamage;
    private int maxDamage;
    private int health;
    private int speed;
    private int delivery;
    private int magic;

    public Rogue(String name) {
        super(name);
        this.attack = 8;
        this.defense = 3;
        this.shots = 0;
        this.minDamage = 2;
        this.maxDamage = 4;
        this.health = 10;
        this.speed = 6;
        this.delivery = 0;
        this.magic = 0;
    }

    public Rogue(String name, int attack, int defense, int shots, int minDamage, int maxDamage, int health, int speed, int delivery, int magic) {
        super(name);
        this.attack = attack;
        this.defense = defense;
        this.shots = shots;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.health = health;
        this.speed = speed;
        this.delivery = delivery;
        this.magic = magic;
    }
    private String getName(String name) {
        return name;
    }
    private Object getAttack() {
        return attack;
    }

    private Object getDefense() {
        return defense;
    }

    private Object getShots() {
        return shots;
    }

    private Object getDamageMin() {
        return minDamage;
    }

    private Object getDamageMax() {
        return maxDamage;
    }

    private Object getHealth() {
        return health;
    }

    private Object getSpeed() {
        return speed;
    }

    private Object getDelivery() {
        return delivery;
    }

    private Object getMagic() {
        return magic;
    }

    public String getShortDescription() {
        return String.format("Name: %s, Health: %d, Attack: %d, Defense: %d, Damage: %d-%d",
                this.getName(), this.getHealth(), this.getAttack(), this.getDefense(),
                this.getDamageMin(), this.getDamageMax());
    }
    public String getInfo() {
        return String.format("Name: %s, Health: %d, Attack: %d, Defense: %d, Damage: %d-%d, Shots: %d, Speed: %d, Delivery: %d, Magic: %d",
                this.getName(), this.getHealth(), this.getAttack(), this.getDefense(),
                this.getDamageMin(), this.getDamageMax(), this.getShots(), this.getSpeed(),
                this.getDelivery(), this.getMagic());
    }

 

  
}
    // protected static int number;
    // protected static Random r;

    // protected String name;
    // protected int hp;
    // protected int maxHp;

    // static {
    //     BaseHero.number = 0;
    //     BaseHero.r = new Random();
    // }

    // public BaseHero(String name, int hp) {
    //     this.name = name;
    //     this.hp = hp;
    //     this.maxHp = hp;
    // }

    // public BaseHero() {
    //     this(String.format("Hero #%d", ++BaseHero.number),
    //             BaseHero.r.nextInt(100, 200));
    // }

    // public String getInfo() {
    //     return String.format("Name: %s  Hp: %d  Type: %s",
    //             this.name, this.hp, this.getClass().getSimpleName());
    // }

    // public void heal(int hp) {
    //     this.hp = hp + this.hp > this.maxHp ? this.maxHp : hp + this.hp;
    // }

    // public void takeDamage(int damage) {
    //     if (this.hp - damage > 0) {
    //         this.hp -= damage;
    //     }
    //     // else { die(); }
    // }

    // public void attack(BaseHero target) {
    //     int damage = BaseHero.r.nextInt(10, 20);
    //     target.takeDamage(damage);
    // }
    // public abstract void step();
    // // метод, который должен быть переопределен в классах-потомках
    // public abstract void specialAbility();


// import java.util.Random;

// public class BaseHero {
// protected static int number;
// protected static Random r;

// protected String name;
// protected int hp;
// protected int maxHp;

// static {
// BaseHero.number = 0;
// BaseHero.r = new Random();
// }

// public BaseHero(String name, int hp) {
// this.name = name;
// this.hp = hp;
// this.maxHp = hp;
// }

// public BaseHero() {
// this(String.format("Hero_Priest #%d", ++BaseHero.number),
// BaseHero.r.nextInt(100, 200));
// }

// public String getInfo() {
// return String.format("Name: %s Hp: %d Type: %s",
// this.name, this.hp, this.getClass().getSimpleName());
// }

// public void healed(int Hp) {
// this.hp = Hp + this.hp > this.maxHp ? this.maxHp : Hp + this.hp;
// }

// public void GetDamage(int damage) {
// if (this.hp - damage > 0) {
// this.hp -= damage;
// }
// // else { die(); }
// }

// public void Attack(BaseHero target) {
// int damage = BaseHero.r.nextInt(10, 20);
// target.GetDamage(damage);
// }
// }
