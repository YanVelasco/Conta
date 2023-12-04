package entities;


public abstract class Account {
    private Integer number;
    private String cpf;
    private Double balance;

    public Account(Integer number, String cpf, Double balance) {
        this.number = number;
        this.cpf = cpf;
        this.balance = balance;
    }

    public Integer getNumber() {
        return this.number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public abstract void deposit(Double value);

    public abstract void withdraw(Double value);

    public abstract void transfer(Double value, Integer destinationAccountNumber);
}
