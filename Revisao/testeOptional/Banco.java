import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Banco {
    List<Conta> contas = new ArrayList<Conta>();

    Optional<Conta> buscarContaNumero(String numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta().equals(numeroConta)) {
                return Optional.of(conta);
            }
        }
        return Optional.empty();

    }

    Boolean inserirConta(Conta conta) {
        Optional<Conta> equalAccount = buscarContaNumero(conta.getNumeroConta());
        if (equalAccount.isPresent()) {
            return false;
        }
        contas.add(conta);
        return true;

    }

}