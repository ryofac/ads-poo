class Questao2 {
    public static void main(String[] args) {
        int numero = 10;
        String resultado = eh_primo(numero) ? "É primo" : "Não é primo";

        System.out.println(resultado);

    }

    static boolean eh_primo(int number) {
        // Fail Fast para pares
        if (number % 2 == 0)
            return false;
        for (int i = number - 1; i > 1; i--) {
            System.out.println(i);
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

}