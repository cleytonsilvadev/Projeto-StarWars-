package decorator;
import model.Jedi;

public class Guardian extends DecoratorJedi{
    public Guardian() {
    }
    public Guardian(Jedi jedi) {
        super(jedi);
    }
    @Override
    public void power() {
        String power = "Aptidão: Guardião... \n" +
                "Guerreiro: Velocidade da força e pulo da força! \n" +
                "Arma: Sabre de luz azul";
        System.out.println(power);
    }
    public void make(){
        jedi.make();
    }
}
