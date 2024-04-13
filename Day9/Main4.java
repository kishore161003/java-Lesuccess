import java.util.Scanner;

class Account {
    private int account_number;
    private int account_balance;

    public void setAccountNumber(int account_number) {
        this.account_number = account_number;
    }

    public void setAccountBalance(int account_balance) {
        this.account_balance = account_balance;
    }

    public int getAccountBalance() {
        return account_balance;
    }

    public int getAccountNumber() {
        return account_number;
    }
}

class User extends Account {
    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}

public class Main4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        User[] users = new User[n];

        for (int i = 0; i < n; i++) {
            int accountNumber = scanner.nextInt();
            int initialDeposit = scanner.nextInt();
            String username = scanner.next();

            User user = new User();
            user.setAccountNumber(accountNumber);
            user.setAccountBalance(initialDeposit);
            user.setUsername(username);

            users[i] = user;
        }

        int accountNumberToCheck = scanner.nextInt();
        boolean accountExists = false;

        for (User user : users) {
            if (user.getAccountNumber() == accountNumberToCheck) {
                System.out.println(user.getAccountBalance());
                accountExists = true;
                break;
            }
        }

        if (!accountExists) {
            System.out.println("Account Number Does Not Exist.");
        }

        scanner.close();
    }
}