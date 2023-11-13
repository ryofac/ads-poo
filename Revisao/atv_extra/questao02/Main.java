public class Main {
    public static void main(String[] args) {
        try {
            FolhaPagamento outubro = new FolhaPagamento();
            outubro.pessoas.add(new Pessoa("Robervaldo", "Soares"));
            outubro.pessoas.add(new Funcionario("Otilio", "Popo", 15000.0, "123321"));
            outubro.pessoas.add(new Professor("Ely", "Miranda", 18000.0, "40028922", "Hobbit"));

            outubro.calcularSalarios();

        } catch (SalarioMenorQueZeroException e) {
            e.printStackTrace();
        }
    }

}
