package Ex08.questao01;

public class Horista extends Empregado {

    public Horista(Double salario) {
        super(salario);
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() / 24;
    }

}
