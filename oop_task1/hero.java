package oop_task1;
/**
 * Каждый из этих классов наследует свойства и методы от 
 * базового класса BaseHero и добавляет свои уникальные 
 * свойства и методы в соответствии с конкретным классом персонажа.
 */
public class Peasant extends BaseHero {
    public Peasant(String name, int hp) {
        super(name, hp);
    }

    public Peasant() {
        super();
    }

    public void plow() {
        System.out.println(this.name + " is plowing the field.");
    }

    public void harvest() {
        System.out.println(this.name + " is harvesting the crops.");
    }

    @Override
    public void specialAbility() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'specialAbility'");
    }
}

public class Rogue extends BaseHero {
    public Rogue(String name, int hp) {
        super(name, hp);
    }

    public Rogue() {
        super();
    }

    public void pickPocket() {
        System.out.println(this.name + " is picking pockets.");
    }

    public void sneak() {
        System.out.println(this.name + " is sneaking around.");
    }
}

public class Sniper extends BaseHero {
    public Sniper(String name, int hp) {
        super(name, hp);
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
}

public class Warlock extends BaseHero {
    public Warlock(String name, int hp) {
        super(name, hp);
    }

    public Warlock() {
        super();
    }

    public void curse() {
        System.out.println(this.name + " is cursing the enemy.");
    }

    public void summonDemon() {
        System.out.println(this.name + " is summoning a demon.");
    }
}

public class Spearman extends BaseHero {
    public Spearman(String name, int hp) {
        super(name, hp);
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
}

public class Crossbowman extends BaseHero {
    public Crossbowman(String name, int hp) {
        super(name, hp);
    }

    public Crossbowman() {
        super();
    }

    public void reload() {
        System.out.println(this.name + " is reloading their crossbow.");
    }

    public void fire() {
        System.out.println(this.name + " is firing their crossbow.");
    }
}

public class Monk extends BaseHero {
    public Monk(String name, int hp) {
        super(name, hp);
    }

    public Monk() {
        super();
    }

    public void meditate() {
        System.out.println(this.name + " is meditating.");
    }

    public void heal() {
        System.out.println(this.name + " is using their healing powers.");
    }
}

