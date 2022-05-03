package observer;
public interface Observer {
    void update(boolean status);

    void add(Observer observer);
}

