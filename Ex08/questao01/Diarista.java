package Ex08.questao01;

public class Diarista extends Empregado {

    public Diarista(Double salario) {
        super(salario);
    }

    @Override
    double calcularSalario() {
        return super.calcularSalario() / 30;
    }

}
