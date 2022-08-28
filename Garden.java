import java.util.Scanner;

public class Garden {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double squareMeters = Double.parseDouble(scanner.nextLine());
        double pricePerSqMt = squareMeters * 7.61;
        double discount = pricePerSqMt * 0.18;

        System.out.println("The final price is: "+(pricePerSqMt - discount) + " lv.");
    }
}
