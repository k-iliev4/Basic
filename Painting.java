import java.util.Scanner;

public class Painting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nylonSqMt = Integer.parseInt(scanner.nextLine());
        int paintLitres = Integer.parseInt(scanner.nextLine());
        int thinner = Integer.parseInt(scanner.nextLine());
        int workHours = Integer.parseInt(scanner.nextLine());

        double nylonPrice = (nylonSqMt + 2) * 1.5;
        double paintPrice = (paintLitres+(paintLitres * 0.1)) * 14.5;
        double thinnerPrice = thinner * 5.0;
        double bagsPrice = 0.4;

        double sum = nylonPrice + paintPrice + thinnerPrice + bagsPrice;
        double workersPay = workHours * (sum * 0.3);
        double total = sum + workersPay;

        System.out.println(total);


    }
}
