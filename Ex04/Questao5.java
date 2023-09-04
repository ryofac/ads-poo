public class Questao5 {
    public static void main(String[] args) {
        saudacao("Ely", 'M');
        saudacao("Angelica", 'F');
        saudacao("Roberto", 'N');

    }

    static void saudacao(String nome, char genero) {
        switch (genero) {
            case 'M':
                System.out.println("Olá Sr " + nome + "!\n");
                break;

            case 'F':
                System.out.println("Olá Sra. " + nome + "!\n");
                break;

            default:
                System.out.println("Olá " + nome + "!\n");
                break;
        }

    }
}
