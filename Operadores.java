public class Operadores {
    public static void main(String[] args) {

/*
    OPERADORES
    + : Soma ou concatenação    %  : Resto da divisão                ordem de precedência: 1° ()
    - : Subtração                                                                          2° **
    * : Multiplicação                                                                      3° *, /, // e %
    / : Divisão                                                                            4° + e - 
*/        
        int n1 = 3;
        int n2 = 5;

        float m = (n1 + n2)/2; // aplicação da ordem de procedência

        System.out.println("média: " + m);

        //OPERADORES UNITARIOS:

        int y = 5;
        y--; // y = y - 1
        y++; // y = y + 1

        // importancia da ordem do ++:

        int numero = 5;
        int valor = 5 + numero++; // irá mostrar valor == 10; -> faz todas as operações e soma mais um numero ao final - pós-incremento
        int valor1 = 5 + ++numero; // irá mostrar valor == 11; -> soma mais um numero ai faz todas as operações - pré-incremento

        //OPERADORES DE ATRIBUIÇÃO:

        int x = 4;
        x += 2; // x = x + 2
        x -= 2; // x = x - 2
        x *= 2; // x = x * 2
        x /= 2; // x = x / 2
        x %= 2; // x = x % 2

        // .Math

        double sqrt = Math.sqrt(25); // retorna a raiz quadrada de 25 (= 5)
        double PI = Math.PI; // retorna o valor de PI = 3.1415...
        double pow = Math.pow(5,2); // retorna a exponenciação de 5^2
        double cbrt = Math.cbrt(27); // retorna a raiz cúbica de 27 (= 3)

        double abs = Math.abs(-10); // retorna o valor absoluto (= 10) -> elimina o valor negativo
        double floor = Math.floor(3.9); // retorna o arredondamento para baixo (= 3) -> truncagem
        double ceil = Math.ceil(4.2); // retorna o arredondamento para cima (= 5)
        double round = Math.round(5.6); // retorna o valor arredondado aritmeticamente (= 6)

        // GERADORES DE NUMERO com .Math

        double ale = Math.random(); // gera um numero aleatório entre 0 e 1.0 como double
        double ale2 = 5 + Math.random() * (10 - 5); // gera um numero aleatório entre 5 e 10 como double

        System.out.println(ale2);
        System.out.println(ale);

        // OPERADOR TERNARIO

        int maior = n1 > n2 ? x : y; // se n1 for maior que n2 ele mostra X, se não mostra Y (pode haver qualquer coisa no lugar de X e Y)
        // TAMBEM SÃO ACEITOS FORMULAS NO LUGAR DO Y OU X // sempre tem que atribuir o valor a uma variavel

        System.out.println("Operador ternario " + maior);

        // COMPARAÇÃO STRING

        String nome1 = "Rafael";
        String nome2 = "Rafael";
        String nome3 = new String("Rafael");
        String res1 = (nome1 == nome2) ? "Igual":"Diferente";
        String res2 = (nome1.equals(nome3)) ? "Igual" : "Diferente"; // .equals() -> verifica se o conteúdo do objeto é igual o conteúdo de outro objeto

         // Tecnicamente nome1/2 e nome3 não tem a mesma estrutura

        // OPERADORES LÓGICOS

        /*

  && -> E
  || -> OU
  ^ -> XOU
  ! -> NÃO
 
            PARA ENTENDER MELHOR:

         - Operador && : Queremos que Paula e(&&) Quim estejam felizes, então:

				p | q | p && q |
			      ------------------
				V | V |   V    |
	 		      ------------------
				V | F |   F    |
	 		      ------------------
				F | V |   F    |
			      ------------------
				F | F |   F    |
			      ------------------ 

	- Operador || : Queremos que Paula ou (||) Quim estejam felizes, então:

				p | q | p || q |
			      ------------------
				V | V |   V    |
	 		      ------------------
				V | F |   V    |
	 		      ------------------
				F | V |   V    |
			      ------------------
				F | F |   F    |
			      ------------------

	- Operador ^ : Queremos que Paula ou (^) exclusivamente Quim estejam felizes, então:

				p | q | p ^ q |
			      -----------------
				V | V |   F   |
	 		      -----------------
				V | F |   V   |
	 		      -----------------
				F | V |   V   |
			      -----------------
				F | F |   F   |
			      -----------------

	- Operador ! : Contem só uma premissa, "p", então se Paula não (!) esta felizes, então:

				p | !p  |
			      -----------
				V |  F  |
	 		      -----------
				F |  V  |
        */

        int a = 4;
        int b = 7;
        int c = 12;
        boolean r;

        r = (a < b || b == c) ? true : false;
        System.out.println(r);

        // EXPRESSOES LOGICAS COMPOSTAS

      int anoNasc = 2007;
      int anoAtual = 2025;
      int idade = anoAtual - anoNasc;

      String sit = ((idade >= 16 && idade < 18) || (idade > 70)) ? "Obrigatório" : "Opcional";
      System.out.println(sit);

        
    }
}

/*
  >  | Maior que 
  <  | Menor que
  >= | Maior ou igual
  <= | Menor ou igual
  == | Igual a
  != | Diferente de
*/