import java.util.Scanner;

public class CoffeShopVisit {

    public static void main(String[] args) {
        int espessoprice = 3;
        int latteprice = 4;
        int cappuccinoprice = 5;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть кількість еспресо:");
        int espresso = scanner.nextInt();
        System.out.println("Введіть кількість лате: ");
        int latte = scanner.nextInt();
        System.out.println("Введіть кількість капучіно: ");
        int cappuccino = scanner.nextInt();

        int Sum = espresso * espessoprice + latte * latteprice + cappuccino * cappuccinoprice;
        System.out.println("Сума замовлення дорівнює:" + Sum);
    }
}
