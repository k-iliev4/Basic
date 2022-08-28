import java.util.Scanner;

public class CombineStringsAndIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.nextLine();
        String lastName = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        System.out.printf("You are %s %s, a %d -age years old!",firstName, lastName, age);
    }
}
