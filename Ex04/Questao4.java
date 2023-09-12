// A classe apresenta um construtor declarado, que recebe um atributo do tipo inteiro ao ser iniciaizado, porém o código em questão não passa nenhum valor para o construtor da classe.
// Uma possível solução seria:
class Radio {
    private int volume;

    Radio(int volume) {
        this.volume = volume;
    }

    void aumentarVol(int quantidade) {
        volume += quantidade;
        if (volume > 100)
            volume = 100;
    }

    void diminuirVol(int quantidade) {
        volume -= quantidade;
        if (volume < 0)
            volume = 0;
    }
}

class Main {
    public static void main(String[] args) {
        Radio radio = new Radio(100);
    }
}
