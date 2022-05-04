package decorator;
import model.Jedi;

public class Sentinela extends DecoratorJedi{
    public Sentinela() {
    }
    public Sentinela(Jedi jedi) {
        super(jedi);
    }

    @Override
    public void poder() {
        String imprime = "Aptidão: Sentinela...\n" +
                "Espião: Presentir perigo, invisibilidade e telecinese\n" +
                "Arma: Sabre de luz amarelo";
        System.out.println(imprime);
    }
    public void make(){
        jedi.make();
    }
}
