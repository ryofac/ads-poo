public class Conta {
    private String numeroConta;
    private String cpfCliente;
    private Double valorTotal;

    public Conta(String numero, String cpfCliente, Double valorTotal) {
        this.numeroConta = numero;
        this.cpfCliente = cpfCliente;
        this.valorTotal = valorTotal;
    }

    public String getNumeroConta() {
        return this.numeroConta;
    }

    public void setNumeroConta(String numero) {
        this.numeroConta = numero;
    }

    public String getCpfCliente() {
        return this.cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public Double getValorTotal() {
        return this.valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

}
