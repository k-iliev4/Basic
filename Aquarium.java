import java.util.Scanner;

public class Aquarium {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = Integer.parseInt(scanner.nextLine());
        int width = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        double percentTaken = Double.parseDouble(scanner.nextLine());

        int volume = length * width * height;
        double volumeInLitres = volume / 1000.0;
        double neededLitres = volumeInLitres - (volumeInLitres * percentTaken/100);
        System.out.println(neededLitres);
    }
}
