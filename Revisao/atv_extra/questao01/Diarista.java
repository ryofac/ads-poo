package Revisao.atv_extra.questao01;

public class Diarista extends Empregado {
    public Diarista(Double salario) {
        super(salario);
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() / 30;
    }
}
