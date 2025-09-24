import java.util.Scanner;

public class EqSegundoGrau {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Δ = B² - 4 . A . C");
        
        System.out.print("Digite o valor de A: ");
        float valorA = entrada.nextFloat();

        System.out.print("Digite o valor de B: ");
        float valorB = entrada.nextFloat();

        System.out.print("Digite o valor de C: ");
        float valorC = entrada.nextFloat();

        float pow = (float)Math.pow(valorB, 2);

        float eqSeGra = pow - (4 * (valorA * valorC));

        System.out.println("O valor de Δ é igual á: " + eqSeGra);

        entrada.close(); // encerra o Scanner -> boa prática


    }
}
