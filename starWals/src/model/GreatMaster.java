package model;
import observer.Observer;

public class GreatMaster implements Jedi, Observer {
    @Override
    public void make() {
        comunication();
    }
    private void comunication() {
        System.out.println("Grão Mestre...");
        System.out.println("Seja Bem-vindo a ordem Jedi!");
        System.out.println("Nosso novo Padawan!");
    }
    @Override
    public void update(boolean status) {
        if (status) {
            make();
        } else {
            System.out.println("Na espera da escolha do novo Padawan!");
        }
    }
}
