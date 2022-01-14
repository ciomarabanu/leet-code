public class SimpleBankSystem {

}

class Bank {
    long[] balance;
    public Bank(long[] balance) {
        this.balance = balance;
    }

    public boolean transfer(int account1, int account2, long money) {
       if (!withdraw(account1, money))
           return false;
       if (!deposit(account2, money)){
           deposit(account1, money);
           return false;
       }
       return true;
    }

    public boolean deposit(int account, long money) {
        if (account - 1 >= balance.length)
            return false;

        balance[account - 1] += money;
        return true;
    }

    public boolean withdraw(int account, long money) {
        if (account - 1 >= balance.length)
            return false;
        if (balance[account - 1] - money < 0)
            return false;
        balance[account - 1] -= money;
        return true;
    }
}