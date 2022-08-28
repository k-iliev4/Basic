import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double sumDeposited = Double.parseDouble(scanner.nextLine());
        int depositTerm = Integer.parseInt(scanner.nextLine());
        double annualInterestRate = Double.parseDouble(scanner.nextLine());
        double interest = sumDeposited * (annualInterestRate/100);
        double monthlyInterest = interest /12;
        double total = sumDeposited + (depositTerm * monthlyInterest);
        System.out.println(total);
    }
}
