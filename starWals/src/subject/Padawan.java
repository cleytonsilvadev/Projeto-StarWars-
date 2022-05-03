package subject;

import observer.Observer;

public class Padawan implements Observer {
    private String nome;

    public Padawan() {

    }
    public Padawan(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Padawan{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void update(boolean status) {

    }

    @Override
    public void add(Observer observer) {

    }
}
