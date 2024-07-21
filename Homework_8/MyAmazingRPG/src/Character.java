public class Character {
    String name; //Ім'я персонажа.
    int health; //Кількість очок здоров'я персонажа.
    int strength; //Атрибут сили, який впливає на силу атаки.
    int defense; //Атрибут захисту, який впливає на зменшення шкоди, коли об'єкт захищається.
    boolean isAlive =true;
    static int characterCount;// Статичне поле для відстеження кількості створених персонажів.


    public Character(String name, int health, int strength, int defense) {
        this.name = name;
        this.health = health;
        this.strength = strength;
        this.defense = defense;
        characterCount++;

    }

    public void attack(Character other) {
        int damage = this.strength - other.defense;
        if (damage < 0) {
            damage = 0;
        }
        System.out.println("\n" + this.name + " атакує " + other.name + " на  " + damage + " одиниць шкоди.");
        other.takeDamage(damage);
    }

   public void takeDamage(int damage) {
        this.health = this.health - damage;
        if (this.health <= 0) {
            this.isAlive = false;
        }
        System.out.println(this.name + " отримує " + damage + " шкоди. Здоров'я зараз " + this.health);
    }

    public boolean isAlive() {
        return this.health > 0;
    }
    public boolean checkLifeStatus() {
        return this.health > 0;
    }

    public void displayStatus() {
        System.out.println(this.name + " - Здоров'я: " + this.health + ", Сила: " + this.strength + ", Захист: " + this.defense);
    }

    public static int checkCharacterCount() {
        return characterCount;
    }
}


