package subject;

public class Knight extends Subject{
    private boolean status = false;

    public Knight() {
    }
    public Knight(boolean status) {
        this.status = status;
    }
    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status) {
        this.status = status;
        comunicationObservers(status);
    }
}
