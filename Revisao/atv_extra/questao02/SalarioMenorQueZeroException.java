public class SalarioMenorQueZeroException extends Exception {
    @Override
    public String getMessage() {
        return "ERRO: Salario menor que zero!";
    }

}
