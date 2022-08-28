import java.util.Scanner;

public class ZooStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dogFoodPacks = Integer.parseInt(scanner.nextLine());
        int catFoodPacks = Integer.parseInt(scanner.nextLine());

        double dogFoodPrice = dogFoodPacks * 2.5;
        double catFoodPrice = catFoodPacks * 4;

        double total = dogFoodPrice * catFoodPrice;

        System.out.println(total + "lv.");
    }
}
