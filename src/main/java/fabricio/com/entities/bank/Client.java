package fabricio.com.entities.bank;

import java.util.Random;

public class Client {
    private String holder;
    private float balance;
    private int accNumber;

    public Client(String holder, float balance) {
        this.holder = holder;
        this.balance = balance;
        this.accNumber = Integer.parseInt(generateAccNumber());
    }

    public String getHolder() {
        return holder;
    }

    public float getBalance() {
        return balance;
    }

    public int getAccNumber() {
        return accNumber;
    }

    public void Withdraw(float amount) {
        this.balance -= amount;
    }
    public void Deposit(float amount) {
        this.balance -= amount;
    }
    public void Transfer(Client account, float amount) {
        if (account == null) {
            System.out.println("This account isn't exists ");
        }

        assert account != null;
        account.balance += amount;
        this.balance -= amount;
    }

    public static String generateAccNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();

        accountNumber.append(random.nextInt(9) + 1);

        for (int i = 1; i < 5; i++) {
            accountNumber.append(random.nextInt(10));
        }

        return accountNumber.toString();
    }
}
