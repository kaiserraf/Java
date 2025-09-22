import java.util.Scanner; // importa entrada de dados

public class SegundaAula {
    public static void main(String[] args) {


        /*
         *  DECLARAÇÃO DE VARIÁVEIS PRIMITIVAS
        */
        // normal
        int idade = 18;
        float sal = 1825.54f;
        char letra = 'R';
        boolean casado = false;

        // typecasting
        int idade2 = (int) 18;
        float sal1 = (float) 1825.54;
        char letra2 = (char) 'R';
        boolean casado2 = (boolean) false;

        //WrapedClass (o uso de '= new [...]()' é desencorajado desde o java 9)
        Integer idade3 = new Integer(18);
        Float sal2 = new Float(1825.54);
        Character letra3 = new Character('R');
        Boolean casado3 = new Boolean(false);

        // saida de dados
        System.out.println("Idade: " + idade); // pula linha
        System.out.printf("Salário: %.2f \n",sal); // parecido com o printf do C
        System.out.print("Letra: " + letra); // não pula linha
        System.out.format("Casado: %b \n",casado); // outra forma de formatar

        // entrada de dados
        Scanner teclado = new Scanner(System.in);

        System.out.print("Digite seu nome: "); // para interatividade
        String nome = teclado.nextLine();
        
        System.out.print("Fale quantos carros você tem: ");
        float carros = teclado.nextFloat();

        System.out.println("Nome:" + nome);
        System.out.println("Quantidade de carros: " + carros);

        /*
         * DIFERENTES FORMAS DE LER VALORES
         * 
         *  int idade = teclado.nextInt();
         *  float salario = teclado.nextFloat();
         *  String nome = teclado.nextLine();
         * 
        */

        // CASTING => CONVERSÃO DE UM TIPO PARA OUTRO

        double resultado = 0.0;
        int resultadoInt = (int) resultado;

        int meuInt = 10;
        double meuDouble = meuInt;

        String minhaString = "10";
        int meuInt2 = Integer.parseInt(minhaString); // pode ser convertido para outros tipos, muda apenas a classe invólucro

        String minhaString2 = String.valueOf(meuInt2);

    }
}


/**
                    *TABELA DOS TIPO DE FAMÍLIA*

		
		família | tipo primitivo | classe invólucro |    tamnho    | exemplo
	     -------------------------------------------------------------------------
	        lógico |     boolean     |     Boolean      |     1 bit    |   true
	     -------------------------------------------------------------------------
	      literais |      char       |    Caracter      |     1 byte  |   'J'
		           |       -         |     String       | 1 byte/ cada | "JAVA"                                * todas as classes invólucros, começam com letra maiúscula *
	     -------------------------------------------------------------------------
	               |      byte       |      Byte        |    1 byte    | -128 a 127
	      inteiros |      shot       |      Shot        |    2 bytes   | -32.768 a 32.767
	               |      int        |     Integer      |    4 bytes   | -2.147.483.648 a 2.147.483.647
	               |      long       |      Long        |    8 bytes   | -2⁶³ a 2⁶³-1
	     -------------------------------------------------------------------------
	      reais    |     float       |     Float        |    4 bytes   |  3.4e+³⁸
                       |     double      |     Double       |    8 bytes   |  1.8e+³°⁸
	     -------------------------------------------------------------------------

         * relembrando: 1 byte = 8 bits

 */

 /**
  * @author Rafael Machado
  * @version 1.0
  */