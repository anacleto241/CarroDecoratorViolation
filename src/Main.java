import model.*;

public class Main {
    public static void main(String[] args) {
        CarroBasico carro = new CarroCompleto();
        System.out.println(carro.descricao() + " - R$" + carro.custo());
    }
}