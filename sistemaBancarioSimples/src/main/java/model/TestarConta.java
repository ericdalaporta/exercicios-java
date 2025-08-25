package model;

public class TestarConta {

    public static void main(String[] args) {

        System.out.println("--- Teste de Operações da Conta 1 ---");
        // Cria uma conta com saldo inicial de 100
        Conta conta1 = new Conta(100);
        System.out.println("Saldo inicial da conta 1: " + conta1.getSaldo());

        conta1.sacar(60); // Saque de 60
        conta1.depositar(20); // Depósito de 20
        System.out.println("Saldo após operações: " + conta1.getSaldo());

        conta1.sacar(30); // Saque de 30
        System.out.println("Saldo após saque: " + conta1.getSaldo());

        conta1.sacar(80); // Saque de 80 (insuficiente)
        System.out.println("Saldo após tentativa de saque de 80: " + conta1.getSaldo());

        conta1.depositar(30); // Depósito de 30
        conta1.sacar(70); // Saque de 70 (insuficiente)

        System.out.println("\n--- Teste de Transferência entre Contas ---");
        // Cria uma segunda conta com saldo inicial de 200
        Conta conta2 = new Conta(200);
        System.out.println("Saldo da conta 1 antes da transferência: " + conta1.getSaldo());
        System.out.println("Saldo da conta 2 antes da transferência: " + conta2.getSaldo());

        // Tenta transferir 100 da conta2 para a conta1
        conta2.transferir(conta1, 100);

        System.out.println("\n--- Saldo Final ---");
        System.out.println("Saldo atual da conta 1: " + conta1.getSaldo());
        System.out.println("Saldo atual da conta 2: " + conta2.getSaldo());

    }

}