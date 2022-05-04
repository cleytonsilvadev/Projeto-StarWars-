package decorator;
import model.Jedi;

public class Consular extends DecoratorJedi {
    public Consular() {
    }
    public Consular(Jedi jedi) {
        super(jedi);
    }
    @Override
    public void power() {
        String power = "Aptidão: Consular... \n" +
                "Diplomata: Vislumbra o futuro, telepatia e persuasão\n" +
                "Arma: Sabre de luz verde";
        System.out.println(power);
    }
    public void make() {
        jedi.make();
    }
}
