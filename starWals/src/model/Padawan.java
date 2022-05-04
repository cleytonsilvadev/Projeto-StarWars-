package model;
import decorator.*;
import observer.Observer;

public class Padawan implements Jedi, Observer {
    public Padawan(){
    }
    public Padawan(Consular consular) {
    }
    public Padawan(Guardiao guardiao){
    }
    public Padawan(Sentinela sentinela){
    }
    @Override
    public void make() {
        partyTime();
    }
    private void partyTime() {
        System.out.println("Olá, eu sou o novo Padawan!");
        System.out.println("Quero dar o meu melhor nos treinamentos!!!");
        System.out.println("Na espera para ser escolhido por um cavaleiro!");
    }
    @Override
    public void update(boolean status) {
        if (status) {
            make();
        } else {
            System.out.println("Na espera de uma oportunidade ^_^!");
        }
    }
}
