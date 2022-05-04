package decorator;
import model.Jedi;

public class Guardiao extends DecoratorJedi{
    public Guardiao() {
    }
    public Guardiao(Jedi jedi) {
        super(jedi);
    }
    @Override
    public void poder() {
        String imprime = "Aptidão: Guardião... \n" +
                "Guerreiro: Velocidade da força e pulo da força! \n" +
                "Arma: Sabre de luz azul";
        System.out.println(imprime);
    }
    public void make(){
        jedi.make();
    }
}
