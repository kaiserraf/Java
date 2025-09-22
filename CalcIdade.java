import java.util.Scanner;

public class CalcIdade {
    public static void main(String[] args) {

        System.out.println("--Calcular sua Idade--");

        int anoNasc, anoAtual, resultado;

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o ano de nascimento: ");
        anoNasc = entrada.nextInt();

        System.out.print("Digite o ano atual: ");
        anoAtual = entrada.nextInt();

        resultado = anoAtual - anoNasc;
        System.out.println(resultado);
    }
}