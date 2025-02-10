package model;

public class CarroCompleto extends CarroComArERodas {
    @Override
    public String descricao() {
        return super.descricao() + ", com vidros elétricos";
    }

    @Override
    public double custo() {
        return super.custo() + 1500.0;
    }
}
