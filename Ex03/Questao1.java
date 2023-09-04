class Questao1 {
    public static void main(String[] args) {
        System.out.println(eh_par(2));
        System.out.println(eh_par(3));

    }

    static boolean eh_par(int numero) {
        return numero % 2 == 0;
    }
}