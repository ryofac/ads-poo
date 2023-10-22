package Ex08.questao04;

import Ex08.questao03.Funcionario;

public class Professor extends Funcionario {
    private String titulacao;

    public Professor(String nome, String sobrenome, String matricula, Double salario, String titulacao) {
        super(nome, sobrenome, matricula, salario);
        this.titulacao = titulacao;
    }

    public String getTitulacao() {
        return titulacao;
    }

    @Override
    public Double calcularSalarioPrimeiraParcela() {
        return this.getSalario();
    }

    @Override
    public Double calcularSalarioSegundaParcela() {
        return 0.0;
    }

}
