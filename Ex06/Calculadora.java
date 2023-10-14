package Ex06;

public class Calculadora {
    private int operando1;
    private int operando2;

    Calculadora(int operando1, int operando2) {
        this.operando1 = operando1;
        this.operando2 = operando2;
    }

    public int soma() {
        return operando1 + operando2;
    }

    public int subtrair() {
        return operando1 - operando2;
    }
}
