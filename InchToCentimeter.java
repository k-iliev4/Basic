import java.util.Scanner;

public class InchToCentimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        double cm = num * 2.54;
        System.out.println(cm);
    }
}
