package entities;

public class Poupanca extends Account {

    public Poupanca(Integer number, String cpf, Double balance) {
        super(number, cpf, balance);
    }

    @Override
    public void deposit(Double value) {
        setBalance(getBalance() + value);
    }

    @Override
    public void withdraw(Double value) {
        if (getBalance() - value >= 0) {
            setBalance(getBalance() - value);
        } else {
            System.out.println("Saldo insuficiente para realizar o saque na conta poupança.");
        }
    }

    @Override
    public void transfer(Double value, Integer destinationAccountNumber) {
        if (getBalance() - value >= 0) {
            setBalance(getBalance() - value);
            System.out.println("Transferência realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar a transferência na conta poupança.");
        }
    }
}
