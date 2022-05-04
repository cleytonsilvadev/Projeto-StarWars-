package model;

public class DarthVader extends Character{

    public DarthVader() {

    }
    public DarthVader(int HP, int ataque) {
        this.setHP(HP);
        this.setAttack(ataque);
    }
    @Override
    public void attack(Padawan padawan, DarthVader darthVader) {
        padawan.setHP(padawan.getHP() - darthVader.getAttack());
    }
    public void printAttDarthVader(){

        System.out.println("Atributos do DARTH VADER:");
        System.out.print("HP: "+ getHP() + " | ");
        System.out.print("Ataque: "+ getAttack() + " | ");
        System.out.println(" ");
        System.out.println(" ");
    }
    public void movement(DarthVader darthVader, Padawan padawan){

        System.out.println("Darth Vader!!! Agora é vez do seu ataque.");
        System.out.println("ATACAR");
        attack(padawan, darthVader);
        System.out.println("");
    }
}
