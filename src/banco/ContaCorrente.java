package banco;

public class ContaCorrente extends Conta {

    //Cria a constante Taxa para conta corrente, que será 0,10 a cada saque
    private final static float TAXA = 0.10f;

    //Construtor
    public ContaCorrente(int numConta, int agencia, Cliente cliente) {
        super(numConta, agencia, cliente);  //invoca o construtor da classe mãe
    }

    @Override   //é necessário implementar e sobrescrever o método abstrato sacar()
    public void sacar(float valor) {
        if (getSaldo() >= valor + TAXA) {    //verifica se o saldo disponível é maior que o valor do saque e da taxa de serviço
            System.out.println("Sacando " + (valor + TAXA) + " reais da Conta Corrente...");
            this.saldo = getSaldo() - (valor + TAXA);
        } else {
            System.out.println("Tentando sacar " + (valor + TAXA) + " reais..." + "\n" +
                    "Saque não foi efetuado: Saldo insuficiente!");
        }
    }

    @Override
    public void depositar(float valor) {    //informa em qual tipo de conta o depósito foi efetuado
        System.out.println("Estou depositando " + valor + " reais na Conta Corrente...");
        super.depositar(valor);
    }

    public void exibir() {   //este método não sobrescreve o método mãe, mas passa um parâmetro diferente
        super.exibir("CONTA CORRENTE");
    }
}
