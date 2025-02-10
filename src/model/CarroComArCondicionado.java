package model;

public class CarroComArCondicionado extends CarroBasico {
    public String descricao() {
        return super.descricao() + ", com ar condicionado";
    }

    public double custo() {
        return super.custo() + 2500.0;
    }
}
