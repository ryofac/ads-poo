public class Ex09 {
    public static void main(String[] args){
        SituacaoFinanceira sitfin = new SituacaoFinanceira();
        sitfin.valorCreditos = 10;
        sitfin.valorDebitos = 20;
        sitfin.mostrarSaldo();

    }
    
}
class SituacaoFinanceira{
    double valorCreditos = 0;
    double valorDebitos = 0;

    void mostrarSaldo(){
        double saldoTotal = this.valorCreditos - this.valorDebitos;
        if(saldoTotal < 0){
            System.out.println("Saldo NEGATIVO de: R$" + saldoTotal);
        }else if(saldoTotal == 0){
            System.out.println("Saldo nulo, você não tem nada ainda!");
        }
        else{
            System.out.print("Saldo POSITIVO de: R$" + saldoTotal);
        }
    }

}