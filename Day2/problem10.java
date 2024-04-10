package Day2;
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of units: ");
        int units = scanner.nextInt();
        scanner.close();

        double totalElectricityBill = calculateElectricityBill(units);
        System.out.println("Total electricity bill for " + units + " units: Rs. " + totalElectricityBill);
    }

    public static double calculateElectricityBill(int units) {
        double bill = 0.0;
        if (units <= 50) {
            bill = units * 0.50;
        } else if (units <= 150) {
            bill = 50 * 0.50 + (units - 50) * 0.75;
        } else if (units <= 250) {
            bill = 50 * 0.50 + 100 * 0.75 + (units - 150) * 1.20;
        } else {
            bill = 50 * 0.50 + 100 * 0.75 + 100 * 1.20 + (units - 250) * 1.50;
        }
        bill += bill * 0.20;
        return bill;
    }
}