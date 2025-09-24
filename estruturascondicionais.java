import java.util.Scanner;

public class estruturascondicionais {
    public static void main(String[] args) {

        // passou ou não na média

        Scanner entrada = new Scanner(System.in);

        System.out.print("Primeira nota: ");
        float nota1 = entrada.nextFloat();

        System.out.print("Segunda nota: ");
        float nota2 = entrada.nextFloat();

        float media = (nota1 + nota2)/2;

        System.out.println(media);

        if(media > 9){
            System.out.println("voce tem uma rola de 30cm");
        }else if(media < 9){
            System.out.println("Voce é um merda");
        }

        System.out.println("====================================");

        // maior ou menor de idade

        System.out.println("Digite a sua idade:");
        int idade = entrada.nextInt();

        if(idade >= 18){
            System.out.println("Maior de idade");
        }else if(idade < 18 && idade > 0){
            System.out.println("Menor de idade");
        }else{
            System.out.println("Digite um valor valido");
        }

        // confirma se precisa votar ou não

        if(idade <16){
            System.out.println("Você não pode votar");
        }else if(idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Voto opcional");
        }else if(idade >= 18 && idade <= 70){
            System.out.println("Voto obrigatório");
        }

        // quantidade de pernas
        System.out.println("Quantas pernas o animal possui?");
        int pernas = entrada.nextInt();

        switch(pernas){
            case 0:
                System.out.println("cobra nessa porra");
                break;
            case 1:
                System.out.println("Saci");
                break;
            case 2:
                System.out.println("bipede");
                break;
            case 4:
                System.out.println("quadrupede");
                break;
            case 6, 8:
                System.out.println("aranha");
                break;
            default:
                System.out.println("Número de pernas inválido!");
        }
    }
}
