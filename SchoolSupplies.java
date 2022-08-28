import java.util.Scanner;

public class SchoolSupplies {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int penPacks = Integer.parseInt(scanner.nextLine());
        int sharpiePacks = Integer.parseInt(scanner.nextLine());
        int litresDetergent = Integer.parseInt(scanner.nextLine());
        int discountPercentage = Integer.parseInt(scanner.nextLine());

        double penPackPrice = 5.8;
        double sharpiePackPrice = 7.2;
        double detergentPricePerLitre = 1.2;

        double price = penPacks * penPackPrice + sharpiePacks * sharpiePackPrice + litresDetergent * detergentPricePerLitre;
        double total = price - (price * discountPercentage/100);

        System.out.println(total);
    }
}
