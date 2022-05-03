import factory.Jedi;
import observer.GraoMestre;
import decorator.*;

import java.util.Random;

public class Aplicacao {

    public static void cria(String nome, Jedi jedi){
        jedi.make();
    }

    public static void main(String[] args) {
       /*Padawan pad = new Padawan("Padawan");
       JediFactory obs = null;
       obs = new JediFactory();
       obs.criarPadawan("Padawan");
       System.out.println("Jedi criado: " + pad.getNome());*/
        cria("Andre", new Consular(new GraoMestre()));
    }
    public static void escolha(){
        Random ale = new Random();
        Guardiao guardiao = new Guardiao();
        Consular consular = new Consular();
        Sentinela sentinela = new Sentinela();

        int numero = Math.abs(ale.nextInt(100));
        System.out.println(numero);
        if (numero <= 33){
            guardiao.poder();
        }
        else if (numero > 34 && numero <= 67){
            consular.make();
        }
        else if (numero > 68 && numero <= 100){
            sentinela.poder();
        }
    }
    public void menu(){

    }
}
