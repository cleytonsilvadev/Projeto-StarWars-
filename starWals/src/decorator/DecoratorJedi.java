package decorator;
import model.Jedi;

public abstract class DecoratorJedi implements Jedi{
    protected Jedi jedi;

    public DecoratorJedi() {
    }
    public DecoratorJedi(Jedi jedi){
        this.jedi = jedi;
    }
    public abstract void power();
}
