package Ex07.Questao2e3;

public class CalculadoraCientifica extends Calculadora {

    public CalculadoraCientifica(Double operando1, Double operando2) {
        super(operando1, operando2);
    }

    public Double exponenciar() {
        return Math.pow(operando1, operando2);

    }

    // c) Não pois os atributos já existiam na sua classe pai, a Calculadora; A
    // única modificação foi a chamada do construtor de Calculadora no construtor de
    // Calculadora Científica;

}
