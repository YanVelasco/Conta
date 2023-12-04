package entities;

import java.util.ArrayList;
import java.util.List;

public class Corrente extends Account {
    private List<Account> accounts = new ArrayList<>();

    public Corrente(Integer number, String cpf, Double balance, int i) {
        super(number, cpf, balance);
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    @Override
    public void deposit(Double value) {
        setBalance(getBalance() + value);
    }

    @Override
    public void withdraw(Double value) {
        setBalance(getBalance() - value);
    }

    @Override
    public void transfer(Double value, Integer destinationAccountNumber) {
        Account destinationAccount = findAccount(destinationAccountNumber);

        if (destinationAccount != null) {
            if (getBalance() >= value) {
                setBalance(getBalance() - value);
                destinationAccount.deposit(value);
                System.out.println("Transferência realizada com sucesso!");
            } else {
                System.out.println("Saldo insuficiente para realizar a transferência.");
            }
        } else {
            System.out.println("Conta de destino não encontrada.");
        }
    }

    private Account findAccount(Integer accountNumber) {
        for (Account account : accounts) {
            if (account.getNumber().equals(accountNumber)) {
                return account;
            }
        }
        return null;
    }
}
