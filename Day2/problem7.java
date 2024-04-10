package Day2;
import java.util.*;
public class problem7 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the cost price: ");
    double costPrice = scanner.nextDouble();

    System.out.print("Enter the selling price: ");
    double sellingPrice = scanner.nextDouble();

    double profit = sellingPrice - costPrice;
    double loss = costPrice - sellingPrice;

    if (profit > 0) {
        System.out.println("Profit: $" + profit);
    } else if (loss > 0) {
        System.out.println("Loss: $" + loss);
    } else {
        System.out.println("No profit or loss");
    }
}
}
