package Ex07.Questao2e3;

public class Calculadora {
    Double operando1;
    Double operando2;

    public Calculadora(Double operando1, Double operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public Double soma() {
        return operando1 + operando2;
    }

}
