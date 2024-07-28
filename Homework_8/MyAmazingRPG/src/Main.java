//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Character Hero = new Character("Superman", 150, 30, 5);
        Character Monster = new Character("Chupakabra", 125, 20, 5);

        System.out.println("В лісі оселилася " + Monster.name);
        System.out.println(Hero.name + " йде визволяти жителів лісу");
        System.out.println(Hero.name + " йде у логово " + Monster.name);
        System.out.println(Hero.name + " знаходить логово " + Monster.name);
        System.out.println("Починається битва між " + Hero.name + " та " + Monster.name);

        Hero.energyPill();
        Monster.takeHammer();

        while (Hero.isAlive() && Monster.isAlive()) {
            Hero.attack(Monster);
            System.out.println("\nСтан після атаки героя: ");
            Hero.displayStatus();
            Monster.displayStatus();

            if (Monster.isAlive()) {
                Monster.attack(Hero);
                System.out.println("\nСтан після атаки монстра: ");
                Hero.displayStatus();
                Monster.displayStatus();
            }
            if (Hero.isAlive) {
                System.out.println("\n" + Hero.name + " Виграв!");;
            } else {
                System.out.println("\n" + Monster.name + " Виграв!");
            }
        } System.out.println("\nЗагальна кількість створених персонажів: " + Character.checkCharacterCount());
    }
}

