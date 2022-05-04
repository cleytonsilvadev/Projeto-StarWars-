import model.*;
import decorator.*;
import subject.Cavaleiro;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Aplicacao {
    public static void criaPadawan(String nome, Jedi jedi){
        System.out.println("Criando o Padawan: " + nome);
        jedi.make();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Cavaleiro cav = new Cavaleiro();
        Padawan pad = new Padawan();
        DecoratorJedi jedi = null;
        char op;
        boolean esc;
        do {
            menu();
            op = in.next().charAt(0); in.nextLine();
            switch (op){
                case '1':
                    try {
                        System.out.print("Deseja criar um Padawan? true/false: ");
                        esc = in.nextBoolean();
                        in.nextLine();
                        if (esc == false){
                            pad.update(esc);
                        }
                        else if (esc == true){
                            int sorteio = sorteio();
                            if (sorteio <= 33){
                                jedi = new Guardiao();
                                criaPadawan("Pegasus",new Padawan(new Guardiao()));
                                jedi.poder();
                            }
                            else if (sorteio > 34 && sorteio <= 67){
                                jedi = new Consular();
                                criaPadawan("Iori", new Padawan(new Consular()));
                                jedi.poder();
                            }
                            else if (sorteio > 68 && sorteio <= 100){
                                jedi = new Sentinela();
                                criaPadawan("Karl", new Padawan(new Sentinela()));
                                jedi.poder();
                            }
                        }
                    }catch (InputMismatchException e){
                        System.err.println("Entrada inválida... true/false!!!" + e.getMessage());
                    }
                    break;
                case '2':
                    System.out.println("Comunicando aos superiores da escolha do Padawan!");
                    System.out.println("O Padawan foi selecionado com sucesso!");
                    cav.add(new Mestre());
                    cav.add(new GraoMestre());
                    cav.setStatus(true);
                    break;
                case '0':
                    System.out.println("Fim da aplicação! Obrigado... Volte sempre!!!");
                default:
                    break;
            }
        }while (op != '0');
    }
    public static int sorteio(){
        Random ale = new Random();
        int numero = Math.abs(ale.nextInt(100));
        return numero;
    }
    public static void menu(){
        System.out.println("=====================================================");
        System.out.println("| Bem-vindos a melhor aplicação inovadora do mundo  |");
        System.out.println("=====================================================");
        System.out.println("|       ---O MUNDO DOS JEDIS - STAR WARS---         |");
        System.out.println("=====================================================");
        System.out.println("| Embarque nessa nova aventura e desfrute ao máximo |");
        System.out.println("=====================================================");
        System.out.println(" ");
        System.out.println("Opções disponíveis:");
        System.out.println("1 - Opções de criação do Padawan.");
        System.out.println("2 - Padawan escolhido pelo cavaleiro e comunicação aos superiores.");
        System.out.println("0 - Sair da aplicação");
        System.out.print("Digite a opção desejada: ");
    }
}
