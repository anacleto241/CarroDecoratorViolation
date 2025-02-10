package model;

public class CarroComDirecaoHidraulica extends CarroBasico {
    public String descricao() {
        return super.descricao() + ", com direção hidráulica";
    }

    public double custo() {
        return super.custo() + 2000.0;
    }
}
