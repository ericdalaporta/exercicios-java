package view;
import modelo.Conta;

public class TestaConta {
    public static void main(String[] args) {

        Conta c = new Conta();

        c.setSaldo(100);
        c.sacar(60);
        c.depositar(20);
        c.sacar(80);
        c.sacar(30);
        c.depositar(30);
        c.sacar(70);

        System.out.println("saldo: "+ c.getSaldo());

    }
}
