public class POO {

    public static void main(String[] args){
        Carro meuCarro = new Carro("Parati");

        meuCarro.acelerar();
    }
}

class Carro{

    String modelo;

    public Carro(String modelo){
        this.modelo = modelo;
    }

    public void acelerar(){
        System.out.println("Acelerando o carro" + this.modelo);
    }
}
/*
 
CLASSE => seres humanos

OBJETOS => Marcos, Eliza, Tobias [...]

ATRIBUTOS => nome, idade, cpf [...]

METODOS => tocar violão, cozinhar [...]

*/