import java.util.Scanner;

/**
 * @author Rafael Machado
 * @version 1.0-beta
*/

public class calculogord {

    // calculo taxa metabolica basal

    public static void tmbHomem(float peso, float altura, int idade, Scanner entValores, int i){
        // Taxa Metabolica Basal HOMENS

        // deixa bonitinho

        System.out.println("=============================");
        System.out.println("      CALCULADORA DE TMB     ");
        System.out.println("=============================");

        // solicitação de valores

        System.out.println("Digite seu peso (Kg): ");
        peso = entValores.nextFloat();


        System.out.println("Digite sua altura (Cm): ");
        altura = entValores.nextFloat();

        System.out.println("Digite sua idade (Anos): ");
        idade = entValores.nextInt();

        System.out.println("Digite o FAF do paciente: ");
        float faf = entValores.nextFloat();

        // calculos

        float tmbHomens = (float)(88.36 + 13.4 * peso + 4.8 * altura - 5.7 * idade);
        float getH = (float) (tmbHomens * faf);

        // mostra resultados

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("TMB = " + tmbHomens);
        System.out.printf("GET = %.2f Kcal \n", getH); // formatado para 2 numeros após o ponto
        System.out.printf("FAF = %.2f \n", faf); // formatado para 2 numeros após o ponto
    }

    public static void tmbMulher(float peso, float altura, int idade, Scanner entValores, int i){
       // Taxa Metabolica Basal HOMENS

        // deixa bonitinho

        System.out.println("=============================");
        System.out.println("      CALCULADORA DE TMB     ");
        System.out.println("=============================");

        // solicitação de valores

        System.out.println("Digite seu peso (Kg): ");
        peso = entValores.nextFloat();


        System.out.println("Digite sua altura (Cm): ");
        altura = entValores.nextFloat();

        System.out.println("Digite sua idade (Anos): ");
        idade = entValores.nextInt();

        System.out.println("Digite o FAF do paciente: ");
        float faf = entValores.nextFloat();

        // calculos

        float tmbMulheres = (float)(447.6 + 9.2 * peso + 3.1 * altura - 4.3 * idade);
        float getM = (float) (tmbMulheres * faf);

        // mostra resultados

        System.out.println("Idade: " + idade);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("TMB = " + tmbMulheres);
        System.out.printf("GET = %.2f Kcal \n", getM); // formatado para 2 numeros após o ponto
        System.out.printf("FAF = %.2f \n", faf); // formatado para 2 numeros após o ponto
    }

    // porcentagem de gordura 

    public static void porcentGordHomem(float peso, float altura, int idade, Scanner entValores, int i){
        
        for (i = 0; i < 2; i++){
            if (i == 0){
                System.out.println("");
            }
            if (i == 1){

            }
        }
    }

    public static void porcentGordMulher(float peso, float altura, int idade, Scanner entValores, int i){
        // %BF MULHERES
    }

    // distrubuição de macro-nutrientes

    public static void DistHipertrofia(float peso, Scanner entValores, float PTN, float CHO, float LIP, int i, float KCAL){
        /*
         PTN = 2.0g/kg              | 4 kcal/g
         LIP = 1.0/kg               | 9 kcal/g
         CHO = calorias restantes   | 4 kcal/g
        */

        System.out.println("Digite o peso do paciente:");
        peso = entValores.nextFloat();

        PTN = (float) (peso * 2.0);
        LIP = (float) (peso * 1.0);


    }

    public static void distObeso(float peso, Scanner entValores, float PTN, float CHO, float LIP, int i, float KCAL){
        /*
         PTN = 2.0g/kg              | 4 kcal/g
         LIP = 0.8/kg               | 9 kcal/g
         CHO = calorias restantes   | 4 kcal/g
        */
    }

    public static void distFalsoMagro(float peso, Scanner entValores, float PTN, float CHO, float LIP, int i, float KCAL){
        /*
         PTN = 2.2g/kg              | 4 kcal/g
         LIP = 1.0/kg               | 9 kcal/g
         CHO = calorias restantes   | 4 kcal/g
        */
    }

    public static void distManutencao(float peso, Scanner entValores, float PTN, float CHO, float LIP, int i, float KCAL){
        /*
         PTN = 1.8g/kg              | 4 kcal/g
         LIP = 1.0/kg               | 9 kcal/g
         CHO = calorias restantes   | 4 kcal/g
        */
    }

    public static void distMacroHomem(float peso, float altura, int idade, Scanner entValores, int i){
        // Distribuição de Macronutrientes HOMENS
    }

    public static void distMacroMulher(float peso, float altura, int idade, Scanner entValores, int i){
        // Distribuição de Macronutrientes MULHERES
    }

    // chamadas de calculos

    public static void tmbChamada(char gen, float peso, float altura, int idade, Scanner entValores, int i){
        switch (gen) {
            case 'H' -> tmbHomem(peso, altura, idade, entValores, i);
            case 'M' -> tmbMulher(peso, altura, idade, entValores, i);
            default -> System.out.println("Digite um valor valido!");
        }
    }

    public static void porcentGordChamada(char gen, float peso, float altura, int idade,  Scanner entValores, int i){
        switch (gen) {
            case 'H' -> porcentGordHomem(peso, altura, idade, entValores, i);
            case 'M' -> porcentGordMulher(peso, altura, idade, entValores, i);
            default -> System.out.println("Digite um valor valido!");
        }
    }

    public static void distMacroChamada(char gen, float peso, float altura, int idade,  Scanner entValores, int i){
        switch (gen) {
            case 'H' -> distMacroHomem(peso, altura, idade, entValores, i);
            case 'M' -> distMacroMulher(peso, altura, idade, entValores, i);
            default -> System.out.println("Digite um valor valido!");
        }
    }

    public static void main(String[] args) {

        Scanner entValores = new Scanner(System.in);

        int escolhaMenu;
        char gen;
        float peso = 0;
        int idade = 0;
        float altura= 0;
        int i = 0;
        float PTN = 0;
        float LIP = 0;
        float CHO = 0;
        float KCAL = 0;

        System.out.println("1 - TMB || 2 - Dist Macro || 3 - %BF");

        System.out.print("Digite uma opção: ");
        escolhaMenu = entValores.nextInt();

        System.out.println(escolhaMenu);

        System.out.print("Digite o gênero do paciente (H/M): ");
        gen = entValores.next().toUpperCase().charAt(0); // .charAt(0) -> pega apenas o primeiro caractere

        switch (escolhaMenu) {
            case 1 -> tmbChamada(gen, peso, altura, idade, entValores, i);
            case 2 -> distMacroChamada(gen, peso, altura, idade, entValores, i);
            case 3 -> porcentGordChamada(gen, peso, altura, idade, entValores, i);
            default -> throw new AssertionError();
        }

    }

}
