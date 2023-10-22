package Ex08.questao03;

import Ex08.questao02.Pessoa;

public class Funcionario extends Pessoa {
    private String matricula;
    private Double salario;

    public Funcionario(String nome, String sobrenome, String matricula, Double salario) {
        super(nome, sobrenome);
        this.matricula = matricula;
        this.salario = salario;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public Double getSalario() {
        return this.salario;
    }

    public Double calcularSalarioPrimeiraParcela() {
        return salario * 60 / 100;

    }

    public Double calcularSalarioSegundaParcela() {
        return salario * 40 / 100;

    }
}
