import java.util.Scanner;

public class MagicalApple {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть поточну годину (0-24): ");
        int hour = scanner.nextInt();

        if (hour >= 0 && hour <= 6) {
            System.out.println("Ви отримаєте 5 одиниць енергії");
        }if (hour > 6 && hour <= 12) {
            System.out.println("Ви отримаєте 10 одиниць енергії");
        }if (hour > 12 && hour <= 18) {
            System.out.println("Ви отримаєте 20 одиниць енергії");
        }
        if (hour > 18 && hour <= 24) {
            System.out.println("Ви отримаєте 30 одиниць енергії");

        }
    }
}
