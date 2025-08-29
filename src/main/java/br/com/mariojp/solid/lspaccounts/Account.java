package br.com.mariojp.solid.lspaccounts;

public abstract class Account {
    protected double balance;

    public Account(double  balance) {
        this.balance = balance;
    }

    public void deposit(double amount){
        if (amount <=0){
            throw new IllegalArgumentException("Deposito deve ser positivo");
        }

          this.balance+=amount;
    }

    public double getBalance(){
        return balance;
    }
}
