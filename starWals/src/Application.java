import model.*;
import decorator.*;
import subject.Knight;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Application {
    public static void createPadawan(String name, Jedi jedi){
        System.out.println("Criando o Padawan: " + name);
        jedi.make();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Knight kni = new Knight();
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
                            int numberDraw = selectNumber();
                            if (numberDraw <= 33){
                                jedi = new Guardian();
                                createPadawan("Pegasus",new Padawan(new Guardian()));
                                jedi.power();
                            }
                            else if (numberDraw > 34 && numberDraw <= 67){
                                jedi = new Consular();
                                createPadawan("Aurora", new Padawan(new Consular()));
                                jedi.power();
                            }
                            else if (numberDraw > 68 && numberDraw <= 100){
                                jedi = new Sentinel();
                                createPadawan("Tempestade", new Padawan(new Sentinel()));
                                jedi.power();
                            }
                        }
                    }catch (InputMismatchException e){
                        System.err.println("Entrada inválida... true/false!!!" + e.getMessage());
                    }
                    break;
                case '2':
                    System.out.println("Comunicando aos superiores da escolha do Padawan!");
                    System.out.println("O Padawan foi selecionado com sucesso!");
                    kni.add(new Master());
                    kni.add(new GreatMaster());
                    kni.setStatus(true);
                    break;
                case '3':
                    battle();
                    break;
                case '0':
                    System.out.println("Fim da aplicação! Obrigado... Volte sempre!!!");
                default:
                    break;
            }
        }while (op != '0');
    }
    public static int selectNumber(){
        Random ale = new Random();
        int number = Math.abs(ale.nextInt(100));
        return number;
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
        System.out.println("3 - Iniciar uma batalha.");
        System.out.println("0 - Sair da aplicação");
        System.out.print("Digite a opção desejada: ");
    }
    public static void battle(){
        Padawan padawan = new Padawan(22,5);
        DarthVader darth = new DarthVader(22,4);
        System.out.println("Que comece a batalha!!!");
        while(padawan.getHP() > 0 && darth.getHP() > 0){

            padawan.printAttPadawan();
            darth.printAttDarthVader();
            padawan.movement(darth,padawan);
            darth.movement(darth,padawan);
        }
        if (padawan.getHP() < 0){
            padawan.setHP(0);
        }
        else if (darth.getHP() < 0){
            darth.setHP(0);
        }
        System.out.println(" ");
        System.out.println("Valores dos Atribubos no final do jogo.");
        padawan.printAttPadawan();
        darth.printAttDarthVader();
        System.out.println(" ");
        System.out.println("Fim do Combate!!!");
    }
}
