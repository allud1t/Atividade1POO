package banco;

public abstract class Conta {   //classe abstrata, não pode ser instanciada
    //Atributos
    protected float saldo;
    private int numConta;
    private int agencia;
    private Cliente cliente;

    //Construtor
    public Conta(int numConta, int agencia, Cliente cliente) {
        if (numConta > 0) { //valida se número da conta é maior que 0
            this.setNumConta(numConta);
        } else {
            System.out.println("A numeração da conta deve ser maior que 0");
        }
        if (agencia > 0) {  //valida se número da agência é maior que 0
            this.setAgencia(agencia);
        } else {
            System.out.println("A numeração da agência deve ser maior que 0");
        }
        this.setCliente(cliente);
        this.saldo = 0; //saldo inicia com 0
    }

    //Métodos Personalizados
    public abstract void sacar(float valor);    //Método abstrato sacar, que deverá ser implementados nas classes que herdam

    public void depositar(float valor) {   //Método depositar que recebe um valor e adiciona ao saldo
        this.saldo = getSaldo() + valor;
    }

    public void exibir(String tipoConta) {
        System.out.println("\n---------------" + tipoConta + "---------------" + "\n" +
                "Nome: " + this.getCliente().getNome() + "\n" +
                "CPF: " + this.getCliente().getCpf() + "\n" +
                "Número da conta: " + this.getNumConta() + "\n" +
                "Número da agência: " + this.getAgencia() + "\n" +
                "Saldo: " + this.getSaldo() + "\n" +
                "--------------------------------------------\n");
    }

    //Métodos acessores e modificadores
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public float getSaldo() {
        return saldo;
    }
}
