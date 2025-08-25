package model;

public class Conta {

    private double saldo;

    // Construtor para inicializar o saldo
    public Conta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public boolean sacar(double valor) {
        if (valor > 0 && this.saldo >= valor) {
            this.saldo -= valor;
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
            return true; // Indica que o saque foi bem-sucedido
        } else {
            System.out.println("Saque de R$" + String.format("%.2f", valor) + " não foi possível. Saldo insuficiente ou valor inválido.");
            return false; // Indica que o saque falhou
        }
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
            System.out.println("Depósito de R$" + String.format("%.2f", valor) + " realizado com sucesso.");
        } else {
            System.out.println("Depósito não foi possível. Valor inválido.");
        }
    }

    public void transferir(Conta c, double valor) {
        if (this.sacar(valor)) { // Tenta sacar da conta de origem
            c.depositar(valor);  // Se o saque for bem-sucedido, deposita na conta de destino
            System.out.println("Transferência de R$" + String.format("%.2f", valor) + " realizada com sucesso.");
        } else {
            System.out.println("Transferência não foi possível. Saldo insuficiente na conta de origem.");
        }
    }
}