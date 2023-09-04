
public class Questao4 {

    public static void main(String[] args) {
        String[] separados = { "Olá", "Bom dia!" };
        System.out.println(coisificador(separados));
    }

    static String coisificador(String[] coisas) {
        String out = "";
        // for each String coisa in Array coisas
        for (String coisa : coisas) {
            out += coisa + "-";
        }

        return out;

    }

}