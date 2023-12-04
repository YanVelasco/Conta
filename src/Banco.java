import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.Corrente;
import entities.Poupanca;

public class Banco {
    private List<Account> contas = new ArrayList<>();

    public void adicionarConta(Account conta) {
        contas.add(conta);
    }

    public List<Account> getContas() {
        return contas;
    }

    public static void main(String[] args) {
        Banco banco = new Banco();

        Poupanca poupanca1 = new Poupanca(1, "123456789", 1000.0);
        Corrente corrente1 = new Corrente(2, "987654321", 2000.0, 1001);

        banco.adicionarConta(poupanca1);
        banco.adicionarConta(corrente1);

        // Exemplo de depósito
        poupanca1.deposit(500.0);

        // Exemplo de saque
        corrente1.withdraw(300.0);

        // Exemplo de transferência
        poupanca1.transfer(200.0, corrente1.getNumber());

        // Exibindo informações das contas
        List<Account> contas = banco.getContas();
        for (Account conta : contas) {
            System.out.println("Número da Conta: " + conta.getNumber());
            System.out.println("CPF: " + conta.getCpf());
            System.out.println("Saldo: " + conta.getBalance());
            System.out.println("------------------------");
        }
    }
}
