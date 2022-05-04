package model;
import decorator.*;
import observer.Observer;

import java.util.Scanner;

public class Padawan extends  Character implements Jedi, Observer {

    public DecoratorJedi decoratorJedi;

    public Padawan() {
    }
    public Padawan(DecoratorJedi decoratorJedi){
        this.decoratorJedi = decoratorJedi;
    }
    public Padawan(int HP, int attack) {
        this.setHP(HP);
        this.setAttack(attack);
    }
    @Override
    public void attack(Padawan padawan, DarthBane darthBane) {
        darthBane.setHP(darthBane.getHP() - padawan.getAttack());
    }
    @Override
    public void make() {
        comunication();
    }
    private void comunication() {
        System.out.println("Olá, eu sou o novo Padawan!");
        System.out.println("Quero dar o meu melhor nos treinamentos!!!");
        System.out.println("É um privilégio ser escolhido por um cavaleiro!");
    }
    @Override
    public void update(boolean status) {
        if (status) {
            make();
        } else {
            System.out.println("Na espera de uma oportunidade ^_^!");
        }
    }
    public void printAttPadawan(){

        System.out.println("Atributos do PADAWAN:");
        System.out.print("HP: "+ getHP() + " | ");
        System.out.print("Ataque: "+ getAttack() + " | ");
        System.out.println(" ");
        System.out.println(" ");
    }
    public void movement(DarthBane darthBane, Padawan padawan){

        Scanner in = new Scanner(System.in);

        System.out.println("Padawan!!! Agora é vez do seu ataque.");
        System.out.print("1 - Atacar | ");
        System.out.print("Escolha o movimento: ");
        int selectNumber = in.nextInt();

        if (selectNumber == 1) {
            attack(padawan, darthBane);
            System.out.println("ATACAR");
        }
        System.out.println("");
    }
}
