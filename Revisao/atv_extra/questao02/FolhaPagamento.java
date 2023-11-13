import java.util.ArrayList;
import java.util.List;

public class FolhaPagamento {
    List<Pessoa> pessoas = new ArrayList<Pessoa>();

    public void calcularSalarios() {
        Double soma_atual = 0.0;
        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Funcionario) {
                Funcionario funcionario = (Funcionario) pessoa;
                soma_atual += funcionario.calcularSalarioPrimeiraParcela()
                        + funcionario.calcularSalarioSegundaParcela();
            }

        }
        System.out.println("O salário total dos funcionários é R$" + soma_atual);

    }

}