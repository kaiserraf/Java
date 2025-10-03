import java.util.Arrays;

public class vetores {
    public static void main(String[] args) {

        int i;

        // declarando vetores em java

        int vet1[] = new int[4]; // vetor com 4 posições

        // declaração de vetor já com valores

        int vet2[] = {3, 5, 8, 2};

        for(i = 0; i <= 3; i++){
            System.out.println(vet2[i]);
        }

        // for it - para cada

        Arrays.sort(vet2); // coloca o vetor em ordem

        for(int valor1: vet2){
            System.out.println(valor1);
        }

        // fazer uma busca no vetor

        int pos = Arrays.binarySearch(vet2, 1); // (vetor, valor)

        System.out.println(pos); // mostra em qual posição esta o valor solicitado

        // preenchendo o vetor com apenas um número

        Arrays.fill(vet1, 8);
        for(int valor2: vet1){
            System.out.println(valor2);
        }
    }
}
