package decorator;
public class Guardiao implements Poderes{
    @Override
    public void poder() {
        //String retorno = "Guerreiro: Velocidade da força e pulo da força!";
        System.out.println("Guerreiro: Velocidade da força e pulo da força!");
        arma();
    }
    public void arma(){
        System.out.println("Arma: Sabre de luz azul");
    }
}
