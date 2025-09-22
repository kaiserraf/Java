import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {

        float valor1;

        System.out.println("=======================");
        System.out.println("      CALCULADORA      ");
        System.out.println("=======================");

        Scanner entrada = new Scanner(System.in); 

        System.out.println("Digite um valor: ");
        valor1 = entrada.nextFloat(); // escaneia a entrada de valores


        // REALIZA OS CALCULOS

        float restDivisao = valor1 % 2;
        float aoCubo = (float) Math.pow(valor1, 3);
        float raizQuadrada = (float) Math.sqrt(valor1);
        float raizCubica = (float) Math.cbrt(valor1);
        float valorAbsoluto = (float) Math.abs(valor1);

        // MOSTRA NA TELA OS VALORES

        System.out.println("Resto da divisão por 2: " + restDivisao);
        System.out.printf("Elevado ao cubo: %.2f \n", aoCubo);
        System.out.printf("Raiz Quadrada: %.2f \n", raizQuadrada);
        System.out.printf("Raiz Cubica: %.2f \n", raizCubica);
        System.out.println("Valor Absoluto: " + valorAbsoluto);

        

    }
}


/*
 * resto da divisão por 2
 * elevado ao cubo
 * raiz quadrada
 * raiz cubica
 * valor absoluto
*/