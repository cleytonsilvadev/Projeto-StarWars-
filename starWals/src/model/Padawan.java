package model;
import decorator.*;
import observer.Observer;

public class Padawan implements Jedi, Observer {

    public DecoratorJedi decoratorJedi;

    public Padawan() {
    }
    public Padawan(DecoratorJedi decoratorJedi){
        this.decoratorJedi = decoratorJedi;
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
}
