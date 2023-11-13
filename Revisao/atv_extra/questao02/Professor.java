public class Professor extends Funcionario {
    private String titulacao;

    public Professor(String nome, String sobrenome, Double salario, String matricula, String titulacao)
            throws SalarioMenorQueZeroException {
        super(nome, sobrenome, salario, matricula);
        this.titulacao = titulacao;

    }

    public String getTitulacao() {
        return this.titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    @Override
    public Double calcularSalarioPrimeiraParcela() {
        return super.calcularSalarioPrimeiraParcela() + super.calcularSalarioSegundaParcela();
    }

    @Override
    public Double calcularSalarioSegundaParcela() {
        return 0.0;
    }
}
