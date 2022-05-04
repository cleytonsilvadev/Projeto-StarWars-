package decorator;
import model.Jedi;

public class Consular extends DecoratorJedi {
    public Consular() {
    }
    public Consular(Jedi jedi) {
        super(jedi);
    }
    @Override
    public void poder() {
        String imprime = "Aptidão: Consular... \n" +
                "Diplomata: Vislumbra o futuro, telepatia e persuasão\n" +
                "Arma: Sabre de luz verde";
        System.out.println(imprime);
    }
    public void make() {
        jedi.make();
    }
}
