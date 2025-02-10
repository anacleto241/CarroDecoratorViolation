package model;

public class CarroComRodasLigaLeve extends CarroBasico {
    public String descricao() {
        return super.descricao() + ", com rodas de liga leve";
    }

    public double custo() {
        return super.custo() + 2000.0;
    }
}
