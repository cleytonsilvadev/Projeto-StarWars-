package decorator;
import factory.DecoratorJedi;
import factory.Jedi;

public class Consular extends DecoratorJedi {

    public Consular() {

    }
    public Consular(Jedi jedi) {
        super(jedi);
    }
    @Override
    public void make() {
        jedi.make();
        System.out.println("Diplomata: Vislumbra o futuro, telepatia e persuasão");
        System.out.println("Arma: Sabre de luz verde");
    }
}
