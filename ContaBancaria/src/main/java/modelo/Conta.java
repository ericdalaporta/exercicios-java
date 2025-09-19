package modelo;

public class Conta {

    private double saldo;

    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double valor){
        this.saldo = valor;
    }

    public void sacar (double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
        }
        else {
            System.out.println("Saldo insuficiente para esse saque");
        }
    }

    public void depositar(double valor) {
        if (valor >= 0){
            this.saldo += valor;
        }
        else {
            System.out.println("Coloque um valor positivo");
        }

    }

}
