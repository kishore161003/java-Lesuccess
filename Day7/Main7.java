package Day7;

import java.util.ArrayList;
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

class UserBo {
    Scanner sc = new Scanner(System.in);
    ArrayList<User> userArray;
    String tar;

    UserBo() {
        int n = sc.nextInt();
        userArray = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            User user = new User();
            user.setName(sc.next());
            user.setMobileNumber(sc.next());
            user.setUserName(sc.next());
            user.setPassword(sc.next());
            userArray.add(user);
        }

    }

    void search() {
        tar = sc.next();
        for (User user : userArray) {
            System.out.println(user);
        }
        for (int i = 0; i < userArray.size(); i++)
            if (userArray.get(i).name.equals(tar)) {
                userArray.remove(i);
                System.out.println("User deleted successfully");
                return;
            }
        System.out.println("No user found with the given name");
    }

}

public class Main7 {
    public static void main(String[] args) {
        UserBo us = new UserBo();
        us.search();
    }

}
