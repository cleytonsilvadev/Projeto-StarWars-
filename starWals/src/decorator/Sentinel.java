package decorator;
import model.Jedi;

public class Sentinel extends DecoratorJedi{
    public Sentinel() {
    }
    public Sentinel(Jedi jedi) {
        super(jedi);
    }

    @Override
    public void power() {
        String power = "Aptidão: Sentinela...\n" +
                "Espião: Presentir perigo, invisibilidade e telecinese\n" +
                "Arma: Sabre de luz amarelo";
        System.out.println(power);
    }
    public void make(){
        jedi.make();
    }
}
