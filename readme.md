# Atividade 1

### Nome: André Luís Fray Casanova

### RA: 20085878-5

---

Atividade 1 de Programação I da Unicesumar. A aplicação é um sistema de controle bancário.

## Resumo das classes

---

- **Principal**
    - main
- **Conta**

```java
protected float saldo;
private int numConta;
private int agencia;
private Cliente cliente;
sacar();
depositar();
```

- **Cliente**

```java
private String nome;
private String cpf;
```

- **ContaCorrente**;

```java
extends Conta

@Override
sacar();
```

- **ContaPoupanca**;

```java
extends Conta

@Override
sacar();
```

:bulb: Classe **Conta** é abstrata. (Não pode ser instanciada)

:pushpin: Classes ContaCorrente e ContaPoupanca **herdam** de classe Conta.

## Requisitos:

---

:white_check_mark: número da conta e agência não podem ser 0

:white_check_mark: atributo saldo tem apenas o método getSaldo()

:white_check_mark: os atributos de Cliente tem apenas o método get

:white_check_mark: todo saque da conta corrente tem uma taxa de 0,10

:white_check_mark: só é possível realizar saques com saldo maior ou igual ao valor

:white_check_mark: No main serão instanciados um objeto Cliente, ContaCorrente e ContaPoupanca. O programa deve exibir todas as informações e atributos das contas.

---

**Conceitos utilizados:**

- abstração
- herança
- polimorfismo
- encapsulamento