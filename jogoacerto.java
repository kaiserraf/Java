import java.util.Scanner;
import java.nio.channels.Pipe.SourceChannel;

public class jogoacerto {
    public static void main(String[] args) {
        // OBJETIVO: criar um jogo que tem um número aleatorio e o usuario deve descobrir

        int num;
        int tentativa;

        System.out.println("====================");
        System.out.println("  ADVINHE O NÚMERO  ");
        System.out.println("====================");

        // gerando número aleatório
        num = (int) (1 + Math.random() * (100 - 1));

        while(true){


            System.out.println(num);

            // solicitando número para o usuario
            Scanner entrada = new Scanner(System.in);
            System.out.println("Tente descobrir o número (1 - 100): ");
            tentativa = entrada.nextInt();

            if(tentativa != num && tentativa > num){
                System.out.println("Errado! o número é menor...");
                continue;
            }else if(tentativa != num && tentativa < num){
                System.out.println("Errado! o número é maior...");
                continue;
            }else if(num == tentativa){
                System.out.println("Parabéns, você acertou!");
                break;
            }else{
                System.out.println("Digite um valor valido!");
                continue;
            }

        }
    }
}
