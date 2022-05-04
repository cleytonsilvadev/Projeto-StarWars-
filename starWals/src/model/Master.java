package model;
import observer.Observer;

public class Master implements Jedi, Observer {
    @Override
    public void make() {
        comunication();
    }
    private void comunication() {
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
