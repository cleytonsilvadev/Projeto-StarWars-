package decorator;
public class Sentinela implements Poderes{
    @Override
    public void poder() {
        System.out.println("Espião: Presentir perigo, invisibilidade e telecinese");
        arma();
    }
    public void arma(){
        System.out.println("Arma: Sabre de luz amarelo");
    }
}
