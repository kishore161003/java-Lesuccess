package Day7;

import java.util.Scanner;

class User {
    String name;
    String mobileNumber;
    String userName;
    String password;

    User() {
        this.name = "";
        this.mobileNumber = "";
        this.userName = "";
        this.password = "";

    }

    User(String name, String mobileNumber, String username, String password) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.userName = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return this.name + " " + this.mobileNumber + " " + this.userName + " " + this.password;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}

public class Main11 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        User user1 = new User();
        User user2 = new User();

        user1.setName(sc.next());
        user1.setUserName(sc.next());
        user1.setPassword(sc.next());
        user1.setMobileNumber(sc.next());

        user2.setName(sc.next());
        user2.setUserName(sc.next());
        user2.setPassword(sc.next());
        user2.setMobileNumber(sc.next());

        if (user1.getMobileNumber().equals(user2.getMobileNumber())) {
            System.out.println("User 1 and User 2 are equal");
        } else {
            System.out.println("User 1 and User 2 are not equal");
        }
    }
}
