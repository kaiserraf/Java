import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        // tipo nomeVariavel = valor;

        byte b = 100;
        short s = 10000;
        int i = 100000;
        long l = 100000L;
        float f = 10.5f;
        double d = 20.5;
        char c = 'A';
        String str = "Rafael";
        boolean bool = true;

        // condicionais

        if(b > 99){
            System.out.println("Menor");
        }else if(b == 100){
            System.out.println("Igual");
        }else{
            System.out.println("Maior");
        }

        // vetores ou arrays

        int[] vet = {1, 2, 3, 4, 5};
        int[] array = new int[5];

        System.out.println(vet[0]);

        // array list

        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Nome Removivel");
        nomes.add("Nome Removivel 2");
        nomes.add("Rafael");
        nomes.add("Maria Julia");
        nomes.add("Amigos");
        

        System.out.println(nomes.get(0));

        nomes.remove(0);
        nomes.remove("Nome Removivel 2");

        // loops

        for(int j = 0; j < nomes.size(); j++){
            System.out.println(nomes.get(j));

        }

        for(String nome : nomes){
            System.out.println(nome);
        }

        int contador = 0;
        while(contador < 10){
            System.out.println("Estou no WHILE");
            contador++;
        }

        // casting => conversão de um tipo para outro

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String minhaStringue = "10";
        int meuInt2 = Integer.parseInt(minhaStringue);

        String minhaStringue2 = String.valueOf(meuInt2);

        

    }
}


/*
Numeros Inteiros:
 - byte => 8 bits => -128 a 127
 - short => 16 bits => -32.768 a 32.767
 - int => 32 bits => -2.147.483.648 a 2.147.483.647
 - long => 64 bits => -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

Numeros Decimais:
 - float => 32 bits => precisão simples
 - double => 64 bits => precisão dupla

String => representa palavras e frases
char => representa um unico caractere => a, b, c, d

String meuNome = "Rafael";
char minhaLetra = 'a';

boolean => true ou false


MODIFICADORES DE ACESSO:
    Pacotes: usados para fazer um agrupamento lógico



*/