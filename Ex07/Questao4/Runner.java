package Ex07.Questao4;

public class Runner {
    public static void main(String[] args) {

        Double savingsAccountTax = 10.0 / 100;
        Double taxAccountTax = 20.0 / 100;

        Bank banco = new Bank(savingsAccountTax, taxAccountTax);

        String accountsDataPath = "/home/ryan-dev/Works/Faculdade/Second Period/ads-poo/Ex07/Questao4/data/Accounts.txt";
        String clientsDataPath = "/home/ryan-dev/Works/Faculdade/Second Period/ads-poo/Ex07/Questao4/data/Clients.txt";

        App app = new App(banco, accountsDataPath, clientsDataPath);
        app.run();

    }

}
