package model;

public class CarroComArERodas extends CarroComArCondicionado{
    @Override
    public String descricao() {
        return super.descricao() + ", com Rodas de Liga Leve";
    }

    @Override
    public double custo() {
        return super.custo() + 3000.0;
    }}
