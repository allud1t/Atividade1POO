package banco;

public class ContaPoupanca extends Conta {

    //Construtor
    public ContaPoupanca(int numConta, int agencia, Cliente cliente) {
        super(numConta, agencia, cliente);  //invoca o construtor da classe mãe
    }

    @Override   //é necessário implementar e sobrescrever o método abstrato sacar()
    public void sacar(float valor) {
        if (getSaldo() >= valor) {   //verifica se o saldo disponível é maior que o valor do saque e da taxa de serviço
            System.out.println("Sacando " + valor + " reais da Conta Corrente...");
            this.saldo = getSaldo() - valor;
        } else {
            System.out.println("Tentando sacar " + valor + " reais..." + "\n" +
                    "Saque não foi efetuado: Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(float valor) {    //informa em qual tipo de conta o depósito foi efetuado
        System.out.println("Estou depositando " + valor + " reais na Conta Poupança...");
        super.depositar(valor);
    }

    public void exibir() {   //passando a string como parâmetro para o método mãe exibir()
        super.exibir("CONTA POUPANÇA");
    }
}
