package Ex06;
/*Crie uma classe Hora que tenha:
a. Três atributos privados e definidos no construtor chamados hora, minutos e
segundos;
b. Métodos públicos para ler hora, minuto e segundo de forma individual;
c. Um método público para retorne a hora no formato “hh:mm:ss”. */

import java.time.LocalTime;

public class Hora {
    private int hora;

    public Hora(int hora, int minutos, int segundo) {
        this.hora = hora;
        this.minutos = minutos;
        this.segundo = segundo;
    }

    private int minutos;
    private int segundo;

    public int getHora() {
        return this.hora;
    }

    public int getMinutos() {
        return this.minutos;
    }

    public int getSegundo() {
        return this.segundo;
    }

    public String verHorario() {
        return String.format("%02d:%02d:%02d ", hora, minutos, segundo);
    }
}

class Main {
    public static void main(String[] args) {
        LocalTime atual = LocalTime.now();
        Hora myTime = new Hora(atual.getHour(), atual.getMinute(), atual.getSecond());

        System.out.println(myTime.verHorario());

    }
}