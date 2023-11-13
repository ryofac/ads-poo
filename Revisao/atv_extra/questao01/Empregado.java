package Revisao.atv_extra.questao01;

public class Empregado {
    Double salario;

    public Empregado(Double salario) {
        this.salario = salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double calcularSalario() {
        return salario;
    }
}
