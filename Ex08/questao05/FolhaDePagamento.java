package Ex08.questao05;

import java.util.ArrayList;

import Ex08.questao03.Funcionario;

public class FolhaDePagamento {

    ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Double obterValorTotalSalarios() {
        Double somaSalarios = 0.0;
        for (Funcionario funcionario : funcionarios) {
            somaSalarios += funcionario.getSalario();
        }
        return somaSalarios;
    }

    public void adcionarFuncionario(Funcionario novoFuncionario) {
        funcionarios.add(novoFuncionario);
    }

}
