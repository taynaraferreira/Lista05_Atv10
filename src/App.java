import java.util.Scanner;
import java.util.Random;

public class App {

    public static int jogodeCraps(int numero_do_dado) {
        Random sorteio = new Random();
        int primeirodado = 0;
        int segundodado = 0;
        primeirodado = sorteio.nextInt(6) + 1;
        segundodado = sorteio.nextInt(6) + 1;
        return primeirodado + segundodado;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_dados = 2;
        int num_digitado = 0;
        int ponto = 0;
        boolean teste = true;

        do {
            System.out.println("[9] para jogar os dados na mesa");
            System.out.println("[0] para sair da mesa de jogo");
            num_digitado = sc.nextInt();
            total_dados = jogodeCraps(num_digitado);

            if (num_digitado < 0 || num_digitado > 9) {
                System.out.println("Opção inválida!");
            } else if (num_digitado == 9) {
                System.out.println(" A soma dos números dos dados é: " + total_dados);
                if (total_dados == 7 || total_dados == 11) {
                    System.out.println(" Você ganhou");
                } else if (total_dados == 2 || total_dados == 3 || total_dados == 12) {
                    System.out.println(" Você perdeu:");
                } else if (total_dados == 4 || total_dados == 5 || total_dados == 6 || total_dados == 8
                        || total_dados == 9 || total_dados == 10) {
                    if (teste) {
                        teste = false;
                        ponto = total_dados;
                    } else if (ponto == total_dados) {
                        System.out.println(" Você ganhou !");
                    }
                }
            }
        } while (num_digitado != 0);
        System.out.println(" Final de jogo!");
        sc.close();

    }

}
