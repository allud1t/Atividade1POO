package banco;

/* Classe e atributos como "final", a classe não é herdada ou sobrescrita por ninguém.
Não há operações com seus atributos, apenas são passados por parâmetro na instanciação*/

public final class Cliente {
    private final String nome;
    private final String cpf;

    //Construtor
    public Cliente(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    //Métodos acessores
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }
}
