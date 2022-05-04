package model;

public class DarthBane extends Character{

    public DarthBane() {

    }
    public DarthBane(int HP, int ataque) {
        this.setHP(HP);
        this.setAttack(ataque);
    }
    @Override
    public void attack(Padawan padawan, DarthBane darthBane) {
        padawan.setHP(padawan.getHP() - darthBane.getAttack());
    }
    public void printAttDarthBane(){

        System.out.println("Atributos do DARTH BANE:");
        System.out.print("HP: "+ getHP() + " | ");
        System.out.print("Ataque: "+ getAttack() + " | ");
        System.out.println(" ");
        System.out.println(" ");
    }
    public void movement(DarthBane darthBane, Padawan padawan){

        System.out.println("Darth Bane!!! Agora é vez do seu ataque.");
        System.out.println("ATACAR");
        attack(padawan, darthBane);
        System.out.println("");
    }
}
