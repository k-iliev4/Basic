import java.util.Scanner;

public class SummerBreakBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int pageCount = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int dayCount = Integer.parseInt(scanner.nextLine());

        int bookTime = pageCount / pagesPerHour;
        int requiredHoursPerDay = bookTime / dayCount;

        System.out.println(requiredHoursPerDay);
    }
}
