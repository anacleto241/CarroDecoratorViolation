package model;

public class CarroComRodasEDirecao extends CarroComDirecaoHidraulica {
    @Override
    public String descricao() {
        return super.descricao() + ", com Direção Hidráulica";
    }

    @Override
    public double custo() {
        return super.custo() + 2000.0;
    }
}
