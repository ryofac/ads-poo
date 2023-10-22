package Ex07.Questao1;

public class CarroEletrico extends Carro {
    String autonomiaBateria;

    public CarroEletrico(String modelo, String autonomiaBateria) {
        super(modelo);
        this.autonomiaBateria = autonomiaBateria;
    }
}
