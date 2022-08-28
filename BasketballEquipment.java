import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualTax = Integer.parseInt(scanner.nextLine());

        double shoesPrice = annualTax * 0.6;
        double clothesPrice = shoesPrice * 0.8;
        double ballPrice = clothesPrice * 0.25;
        double accessoriesPrice = ballPrice * 0.2;

        double total = annualTax + shoesPrice + clothesPrice + ballPrice + accessoriesPrice;

        System.out.println(total);
    }
}
