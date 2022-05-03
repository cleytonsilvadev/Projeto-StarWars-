package observer;

public class Mestre implements Observer {

    public Mestre() {
        
    }

    @Override
    public void update(boolean status) {
        if (status) {
            partyTime();
        }
    }
    @Override
    public void add(Observer observer) {

    }
    private void partyTime() {
        System.out.println("Um de nossos cavaleiros criou um novo Padawan");
        System.out.println("Iniciar treinamentos para a sua formação");
    }
}
