package br.com.mariojp.solid.lspaccounts;

public class CheckingAccount extends Account implements Withdrawable {

    public CheckingAccount(double balance) {
        super(balance);
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Valor do saque deve ser positivo");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        balance -= amount;
    }
}
