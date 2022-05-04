package subject;

public class Cavaleiro extends Subject{
    private boolean status = false;

    public Cavaleiro() {
    }
    public Cavaleiro(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
        notifyObservers(status);
    }
}
