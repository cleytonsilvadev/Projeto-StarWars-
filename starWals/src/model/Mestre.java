package model;
import observer.Observer;

public class Mestre implements Jedi, Observer {
    @Override
    public void make() {
        partyTime();
    }
    private void partyTime() {
        System.out.println("Mestre...");
        System.out.println("Um de nossos cavaleiros criou um novo Padawan");
        System.out.println("Iniciar treinamentos para a sua formação");
    }
    @Override
    public void update(boolean status) {
        if (status) {
            make();
        } else {
            System.out.println("O Padawan ainda não foi escolhido, mas o cavaleiro escolherá em breve!");
        }
    }
}
