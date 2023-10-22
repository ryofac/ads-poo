package Ex08.questao06;

import Ex08.questao03.Funcionario;
import Ex08.questao04.Professor;
import Ex08.questao05.FolhaDePagamento;

public class Main {
    public static void main(String[] args) {
        FolhaDePagamento folhaOutubro = new FolhaDePagamento();

        folhaOutubro.adcionarFuncionario(new Professor("Roberto", "Agnaldo", "123321", 15000.0, "Mestre"));
        folhaOutubro.adcionarFuncionario(new Funcionario("Robervaldo", "Pereira", "23402", 5000.0));

        System.out.println("O valor total dos salários desse mês é: R$" + folhaOutubro.obterValorTotalSalarios());
    }

}
