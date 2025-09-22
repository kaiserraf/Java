import java.util.Date; // informações sobre data e hora
import java.util.Locale.LanguageRange;
import java.awt.Dimension; // pega o tamanho da tela como um objeto Dimension (Largura e Altura)
import java.awt.Toolkit; // da informações sobre a tela

public class Main{

    public static void main(String[] args) {

        System.out.println("Hello World!"); // escreve e pula para linha de baixo
        System.out.print("Hello World!"); // escreve e não pula para linha de baixo

        // classe data
        Date data = new Date();
        System.out.println("Hora atual: ");
        System.out.println(data);

        // classe idioma do sistema

        LanguageRange linguaPais = new LanguageRange("pt-BR");
        System.out.println("Idioma do sistema: ");
        System.out.println(linguaPais);

        // classe resolução da tela

        Toolkit infoTela = Toolkit.getDefaultToolkit();
        Dimension tamanhoTela = infoTela.getScreenSize();
        System.out.println("Tamanho da tela (px): ");
        System.out.println(tamanhoTela.width + "X" + tamanhoTela.height);


    }
}

/*

    java.util = pacote (biblioteca) de utilidades
    java.awt = pacote (biblioteca) de interface gráfica
    java.math = pacote (biblioteca) de matemática
    java.net = pacote (biblioteca) de rede
    javax.sound = pacote (biblioteca) de som
    javax.swing = pacote (biblioteca) de componentes gráficos
        cria interfaces gráficas de janelas

    java.sql = pacote (biblioteca) de banco de dados

    ====================================================
    encapsulamento -> private

*/
