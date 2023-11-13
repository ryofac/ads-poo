package Revisao.atv_extra.questao01;

public class Horista extends Empregado {

    public Horista(Double salario) {
        super(salario);
    }

    @Override
    public Double calcularSalario() {
        return super.calcularSalario() / 24;
    }

}
