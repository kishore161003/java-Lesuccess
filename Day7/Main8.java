package Day7;

import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int rollno;
    int mark1;
    int mark2;
    int mark3;

    public void setMark1(int mark1) {
        this.mark1 = mark1;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setMark2(int mark2) {
        this.mark2 = mark2;
    }

    public void setMark3(int mark3) {
        this.mark3 = mark3;
    }

    public int getMark1() {
        return mark1;
    }

    public int getMark2() {
        return mark2;
    }

    public int getMark3() {
        return mark3;
    }

    public int getRollno() {
        return rollno;
    }
}

class StudentResults {
    int n;
    Scanner sc = new Scanner(System.in);
    ArrayList<Student> al = new ArrayList<>();
    int maxMark1 = 0;
    int maxMark2 = 0;
    int maxMark3 = 0;
    int maxMark1Ind = -1;
    int maxMark2Ind = -1;
    int maxMark3Ind = -1;
    int maxTot = 0;
    int maxTotInd = -1;

    StudentResults() {
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            Student s1 = new Student();
            s1.setRollno(sc.nextInt());
            s1.setMark1(sc.nextInt());
            s1.setMark2(sc.nextInt());
            s1.setMark3(sc.nextInt());
            al.add(s1);
        }
    }

    void results() {
        for (int i = 0; i < n; i++) {
            int sum = al.get(i).getMark1() + al.get(i).getMark2() + al.get(i).getMark3();
            if (maxMark1 < al.get(i).getMark1()) {
                maxMark1 = al.get(i).getMark1();
                maxMark1Ind = al.get(i).getRollno();
            }
            if (maxMark2 < al.get(i).getMark2()) {
                maxMark2 = al.get(i).getMark2();
                maxMark2Ind = al.get(i).getRollno();
            }
            if (maxMark3 < al.get(i).getMark3()) {
                maxMark3 = al.get(i).getMark3();
                maxMark3Ind = al.get(i).getRollno();
            }
            if (maxTot < sum) {
                maxTot = sum;
                maxTotInd = al.get(i).getRollno();
            }
            System.out.println(sum);
        }
        System.out.println(maxMark1Ind + " " + maxMark1);
        System.out.println(maxMark2Ind + " " + maxMark2);
        System.out.println(maxMark3Ind + " " + maxMark3);
        System.out.println(maxTotInd + " " + maxTot);

    }
}

public class Main8 {
    public static void main(String[] args) {
        StudentResults st = new StudentResults();
        st.results();
    }

}
