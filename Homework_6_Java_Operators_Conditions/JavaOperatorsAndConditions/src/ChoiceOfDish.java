import java.util.Scanner;

public class ChoiceOfDish {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть номер страви:");
        int numdish = scanner.nextInt();
        String dish;
        switch (numdish) {
            case 1:
                dish = "Брускетта з соусом песто";
                System.out.println(dish);
                break;
            case 2:
                dish = "Борщ з пампушками";
                System.out.println(dish);
                break;
            case 3:
                dish = "Шарлотка з яблуками";
                System.out.println(dish);
                break;
            case 4:
                dish = "Кава";
                System.out.println(dish);
                break;
            default:
                System.out.println("Введіть валідний номер страви");

        }
    }
}