package oop_task1;

public class Peasant extends BaseHero {

   /**
    * Крестьянин
    * @param name - Имя
    */
    public Peasant(String name) {
        super(name, 100);
    }

    public void plow() {
        System.out.println(this.name + " is plowing the field.");
    }

    public void harvest() {
        System.out.println(this.name + " is harvesting the crops.");
    }

    public void step() {
        System.out.println("Peasant walks...");
    }
    @Override
    public String getInfo() {
        return "Я крестьянин";
    }

   
}
