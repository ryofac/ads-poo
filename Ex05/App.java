package Ex05;

import java.util.Scanner;

public class App {
    static Bank BANK = new Bank();
    static int SAIR = 0;
    static Scanner in = new Scanner(System.in, "UTF-8").useDelimiter("\n");

    static void show(String text) {
        System.out.println(text);
    }

    static void clearScreen() {
        System.out.print("\033\143");
        System.out.flush();
    }

    static void searchAccount() {
        String accountId = getText("Digite o número da conta: ");
        Account finded = BANK.findAccount(accountId);

        if (finded == null) {
            show("Nenhuma conta foi encontrada! ");
            return;
        }
        show("NOME DA CONTA: " + finded.client.name);
        show("CPF DO TITTULAR: " + finded.client.cpf);
        show("VALOR TOTAL: R$" + finded.total);

    }
     static void deleteAccount() {
        String accountId = getText("Digite o número da conta: ");
        Account finded = BANK.findAccount(accountId);

        if (finded == null) {
            show("Nenhuma conta foi encontrada! ");
            return;
        }
        BANK.remove(accountId);
        show("Conta removida com sucesso!");
    }


    static String menu() {
        return ( "Selecione uma opção:" +
        "\n========================================\n" +
        "1 - Cadastrar\t 2 - Consultar\t 3 - Sacar" +
        "\n4 - Depositar\t 5 - Excluir\t 6 - Transferir" +
        "\n7 - Totalizações" +
        "\n0 - Sair" +
        "\n======================================\n");

    }

    static int getInt(String inputText) {
        System.out.println(inputText);
        int opcao = in.nextInt();
        return opcao;

    }

    static double getDouble(String inputText){
        System.out.println(inputText);
        double opcao = in.nextDouble();
        return opcao;

    }

    static String getText(String inputString) {
        show(inputString);
        String text = in.next();
        return text;
    }


    static void insertAccount() {
        show("Digite os dados da criação de conta: ");
        String nome = getText("Nome do titular: ");
        String cpf = getText("Cpf do Titular: ");
      
        String numeroConta = generateAccountNum();
        Client newClient = new Client(nome, cpf);
        Account newAccount = new Account(numeroConta, newClient, 0);
        if (BANK.insert(newAccount)) {
            show("");
            show("Conta de número [ " + newAccount.accountNumber + " ] Criada com Sucesso!");
            show("Cliente " + newAccount.client.name + " seja bem vindo!");
        } else {
            show("[ERRO] Conta não criada!!");
        }

    }
    static void withdrawAccount(){
        show("==== SAQUE ==== \n");
        String accountNum = getText("Digite o número da conta que quer sacar: ");
        Account finded = BANK.findAccount(accountNum);
        if(BANK.findAccount(accountNum) == null){
            show("Conta não encontrada! ");
            return;
        }
        String cpf = getText("Digite o cpf correspondente a conta de " + finded.client.name);
        if(finded.client.cpf.compareTo(cpf) != 0){
            show("Autenticação não funcionou com sucesso...");
            return;
        }
        double amount = getInt("Digite a quantidade que você quer sacar: ");
        if(!BANK.withdraw(accountNum, amount)){
            show("Saque negado!");
            return;
        }
        show("Saque efetuado com sucesso!");
    }

    static void transferAccount(){
        show("==== TRASFERÊNCIA ==== \n");
        String accountNum = getText("Digite o número da conta: ");
        Account finded = BANK.findAccount(accountNum);
        if(BANK.findAccount(accountNum) == null){
            show("Conta não encontrada! ");
            return;
        }
        String cpf = getText("Digite o cpf correspondente a conta de " + finded.client.name);
        if(finded.client.cpf.compareTo(cpf) != 0){
            show("Autenticação não funcionou com sucesso...");
            return;
        }
        String recieveAccountNum = getText("Digite o número da conta que você quer transferir: ");
        Account recieveAccount = BANK.findAccount(recieveAccountNum);
         if(recieveAccount == null){
            show("Conta não encontrada! ");
            return;
        }
        double amount = getInt("Digite a quantidade que você quer transferir: ");
        if(!BANK.transfer(accountNum, recieveAccountNum, amount)){
            show("Transferência não realizada!");
            return;
        }
        show("Transferência realizada com sucesso!");
        show(finded.client.name + ">>>"  + recieveAccount.client.name);
        show("VALOR: " + amount);

    }
    static void depositAccount(){
        show("==== DEPÓSITO ==== \n");
        String accountNum = getText("Digite o número da conta que quer depositar: ");
        Account finded = BANK.findAccount(accountNum);
        if(finded == null){
            show("Conta não encontrada! ");
            return;
        }
        String cpf = getText("Digite o cpf correspondente a conta de " + finded.client.name);
        if(finded.client.cpf.compareTo(cpf) != 0){
            show("Autenticação não funcionou com sucesso...");
            return;
        }
        double amount = getInt("Digite a quantidade que você quer depositar: ");
        if(!BANK.deposit(accountNum, amount)){
            show("Saque negado!");
            return;
        }
        show("Depósito efetuado com sucesso!");


    }

    static void getData(){
        show("\n=================== STATUS BANCO =====================");
        show("TOTAL de contas ativas:\t\t" + BANK.accounts.size());
        show("MÉDIA dos valores: \t\t" + "R$"+ BANK.getValueAvr());
        show("TOTAL de dinheiro guardado:\t" + "R$" +BANK.getTotalMoney());
        show("======================================================\n");
    }

    static String generateAccountNum() {
        int numAccount = (BANK.accounts.size() % 9) + 1;
        int charCode = 65 + BANK.accounts.size() / 10;
        char charAccount = (char) charCode;

        String out = String.format("%c-%d", charAccount, numAccount);
        return out;

    }

    public static void main(String[] args) {
        int opcao = -1;
        clearScreen();
        do {
          opcao = getInt(menu());
            switch (opcao) {
                case 1:
                    insertAccount();
                    break;
                case 2:
                    searchAccount();
                    break;
                case 3:
                    withdrawAccount();
                    break;
                case 4:
                    depositAccount();
                    break;
                case 5:
                    deleteAccount();
                    break;
                case 6:
                    transferAccount();
                    break;
                case 7:
                    getData();
                default:
                    continue;

            }
        } while (opcao != SAIR);
        show("Volte Sempre!");
        in.close();

    }

    

}