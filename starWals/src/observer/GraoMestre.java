package observer;

import factory.Jedi;

public class GraoMestre implements Jedi {
    @Override
    public void make() {
        System.out.println("Seja Bem-vindo a ordem Jedi!");
        System.out.println("Nosso novo Padawan!");
    }
}
