package Ex07.Questao4;

public class Client {
    private String cpf;
    private String name;

    Client(String name, String cpf) {
        this.name = name;
        this.cpf = cpf;
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    @Override
    public String toString() {
        return this.cpf + ";" + this.name;
    }

}
