package Day7;

import java.util.Scanner;

class Player {
    String name;
    String country;
    String skill;

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public String getSkill() {
        return skill;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "Player Details\nPlayer Name : " + this.name + "\nCountry Name : " + this.country + "\nSkill : "
                + this.skill;
    }
}

public class Main2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        String country = sc.next();
        String skill = sc.next();
        Player p1 = new Player();
        p1.setName(name);
        p1.setCountry(country);
        p1.setSkill(skill);
        System.out.println(p1);
    }

}
