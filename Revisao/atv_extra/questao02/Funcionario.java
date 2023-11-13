
public class Funcionario extends Pessoa {
    private Double salario;
    private String matricula;

    public Funcionario(String nome, String sobrenome, Double salario, String matricula)
            throws SalarioMenorQueZeroException {
        super(nome, sobrenome);
        this.salario = salario;
        this.matricula = matricula;
        if (salario < 0) {
            throw new SalarioMenorQueZeroException();
        }

    }

    public Double calcularSalarioPrimeiraParcela() {
        return this.salario * 60 / 100;

    }

    public Double calcularSalarioSegundaParcela() {
        return this.salario * 40 / 100;

    }
}
