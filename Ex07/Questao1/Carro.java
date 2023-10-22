package Ex07.Questao1;

public class Carro extends Veiculo {
    String modelo;

    public Carro(String placa, Integer ano, String modelo) {
        super(placa, ano);
        this.modelo = modelo;
    }

}
