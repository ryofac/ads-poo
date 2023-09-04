class Equipamento {
    private boolean ligado = true;

    Equipamento(boolean estado) {
        this.ligado = estado;
    }

    boolean estaLigado() {
        return ligado;
    }

    void dizerEstado() {
        String atual_estado = ligado ? "ligado" : "desligado";
        System.out.println("Agora está" + atual_estado);
    }

    void ligar() {
        if (!ligado) {
            ligado = true;
            dizerEstado();
        } else
            System.out.println("Já está ligado");
    }

    void desligar() {
        if (ligado) {
            ligado = false;
            dizerEstado();
        } else
            System.out.println("Já está desligado");

    }

    void inverter() {
        ligado = !ligado;
        dizerEstado();
    }
}

public class Questao7 {
    static void main(String[] args) {
        Equipamento lampada = new Equipamento(false);
        lampada.ligar();
        lampada.ligar();
        lampada.desligar();
        lampada.inverter();
        lampada.dizerEstado();
        lampada.ligar();
        System.out.println(lampada.estaLigado());

    }
}
