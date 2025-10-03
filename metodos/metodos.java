public class metodos {

    static void soma1(int a1, int b1){
        int s1 = a1 + b1;
        System.out.println(s1);
    }

    static int soma2(int a2, int b2){
        int s2 = a2 + b2;
        return s2;
    }

    public static void main(String[] args) {
        // metodo void
        soma1(5, 2);

        // metodo int
        soma2(5, 2);

        // metodo em outro arquivo
        System.out.println("Vai começar a contagem");
        System.out.println(operacoes.contador(1, 5));
    }
}
