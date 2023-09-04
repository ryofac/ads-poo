public class Questao10 {
    public static void main(String[] args) {
        double totalTempValues = 0;
        double totalsoundValues = 0;
        int countTemp = 0;
        int countSound = 0;

        Sensor s1 = new Sensor("temp", 100, new Date(10, 11, 2022));
        Sensor s2 = new Sensor("sound", 300, new Date(11, 11, 2022));
        Sensor s3 = new Sensor("sound", 150, new Date(12, 11, 2022));
        Sensor s4 = new Sensor("temp", 400, new Date(13, 11, 2022));

        Sensor[] sensores = { s1, s2, s3, s4 };

        // Doing the separation of the data in only one for each
        for (Sensor sensor : sensores) {
            if (sensor.tipo == "temp") {
                countTemp += 1;
                totalTempValues += sensor.valor;
            } else if (sensor.tipo == "sound") {
                countSound += 1;
                totalsoundValues += sensor.valor;
            }

        }
        double mediaTemp = media(countTemp, totalTempValues);
        double mediaSound = media(countSound, totalsoundValues);

        System.out.print("A média dos valores de temperatura é ");
        System.out.println(mediaTemp);
        System.out.print("A média dos valores de som é ");
        System.out.println(mediaSound);

    }

    static double media(int count, double total) {
        return total / count;
    }

}

class Date {
    public int day;
    public int month;
    public int year;

    Date(int day, int month, int year) {
        this.day = day;
        this.year = year;
        this.month = month;

    }
}

class Sensor {
    String tipo;
    int valor;
    Date dataLeitura;

    Sensor(String tipo, int valor, Date dataLeitura) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataLeitura = dataLeitura;
    }

}