import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chickenMenuCount = Integer.parseInt(scanner.nextLine());
        int fishMenuCount = Integer.parseInt(scanner.nextLine());
        int veggieMenuCount = Integer.parseInt(scanner.nextLine());

        double chickenPrice = chickenMenuCount * 10.35;
        double fishPrice = fishMenuCount * 12.4;
        double veggiePrice = veggieMenuCount * 8.15;
        double sum = chickenPrice + fishPrice + veggiePrice;
        double dessertPrice = sum * 0.2;
        double deliveryFee = 2.5;

        System.out.println(sum + deliveryFee + dessertPrice);
    }
}
