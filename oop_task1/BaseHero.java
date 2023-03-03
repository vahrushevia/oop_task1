package oop_task1;
import java.util.Random;

public abstract class BaseHero {
    protected static int number;
    protected static Random r;

    protected String name;
    protected int hp;
    protected int maxHp;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
    }

    public BaseHero() {
        this(String.format("Hero #%d", ++BaseHero.number),
                BaseHero.r.nextInt(100, 200));
    }

    public String getInfo() {
        return String.format("Name: %s  Hp: %d  Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    public void heal(int hp) {
        this.hp = hp + this.hp > this.maxHp ? this.maxHp : hp + this.hp;
    }

    public void takeDamage(int damage) {
        if (this.hp - damage > 0) {
            this.hp -= damage;
        }
        // else { die(); }
    }

    public void attack(BaseHero target) {
        int damage = BaseHero.r.nextInt(10, 20);
        target.takeDamage(damage);
    }

    // метод, который должен быть переопределен в классах-потомках
    public abstract void specialAbility();
}
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
