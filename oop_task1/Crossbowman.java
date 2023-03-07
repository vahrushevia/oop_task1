package oop_task1;
public class Crossbowman extends BaseHero {
   /**
    * Арбалетчик
    * @param name - Имя
    */
    public Crossbowman(String name) {
        super(name, 100);
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
    public void step() {
        System.out.println("Crossbowman walks...");
    }
    @Override
    public String getInfo() {
        return "Я Арбалетчик";
    }
}