import banco.Cliente;
import banco.ContaCorrente;
import banco.ContaPoupanca;

public class Principal {
    public static void main(String[] args) {

        Cliente cliente = new Cliente("André Casanova", "010.101.010-10");    //cria cliente

        ContaCorrente contaCorrente = new ContaCorrente(1111, 1, cliente);    //cria conta corrente
        contaCorrente.depositar(200); //saldo inicia com zero, logo, para adicionar saldo é necessário depositar
        contaCorrente.exibir();
        contaCorrente.sacar(200);  //testa o método sacar
        contaCorrente.exibir();
        contaCorrente.sacar(199); //este saque é possível
        contaCorrente.exibir();

        ContaPoupanca contaPoupanca = new ContaPoupanca(2222, 2, cliente);    //cria conta poupança
        contaPoupanca.depositar(50);
        contaPoupanca.exibir();
        contaPoupanca.sacar(60);    //testa o método sacar
        contaPoupanca.exibir();
        contaPoupanca.sacar(50);    //este é um saque possível
        contaPoupanca.exibir();
    }
}
