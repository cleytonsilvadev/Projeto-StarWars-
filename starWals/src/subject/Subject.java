package subject;
import observer.Observer;

public abstract class Subject {

    private Observer observers;
    public void add(Observer observer) {
        observer.add(observer);
    }
    public void notifyObservers(boolean status) {
        observers.update(status);
    }
}
