import br.com.mariojp.solid.lspaccounts.BankService;
import br.com.mariojp.solid.lspaccounts.CheckingAccount;
import br.com.mariojp.solid.lspaccounts.SavingsAccount;

public class Main {
    public static void main(String[] args) {
        System.out.println("-----Testando CheckingAccount-----");
        CheckingAccount checking = new CheckingAccount(0);
        checking.deposit(100);
        System.out.println("Saldo inicial CheckingAccount: " +checking.getBalance());
        new BankService().processWithdrawal(checking,30 );
        System.out.println("Saldo após saque de 30: " + checking.getBalance()); // 70.0

        System.out.println("\n ----- Testando SavingAccount----");
        SavingsAccount savings = new SavingsAccount(0);
        savings.deposit(100);
        System.out.println("Saldo inicial da SavinggsAccount :" +savings.getBalance());

        System.out.println("Saldo final da SavingAccount:" +savings.getBalance());
    }
}