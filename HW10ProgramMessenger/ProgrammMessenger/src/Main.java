
public class Main {
    public static void main(String[] args) {
User lisa=new User("Lisa");
User masha=new User("Masha");
User tania=new User("Tania");


lisa.addContact(masha);
        System.out.println("Contact added: " + masha.getUserName());
lisa.addContact(tania);
        System.out.println("Contact added: " + tania.getUserName());
masha.addContact(lisa);
        System.out.println("Contact added: " + lisa.getUserName());
masha.addContact(tania);
tania.addContact(masha);
tania.addContact(tania);

lisa.sendMessage(masha,"Hello Masha! How are you?");
lisa.sendMessage(tania,"Hello Tania! How are you?");

masha.sendMessage(lisa,"I'm fine! and you?");
tania.sendMessage(lisa, "Hi! I'm pretty good! How was your week?");


masha.readAllMessages();
tania.readAllMessages();
lisa.readAllMessages();

// Вивід повідомлень зі статусом READ
masha.showMessage(MessageStatus.READ);

// Вивід повідомлень зі статусом SENT
lisa.showMessage(MessageStatus.SENT);



    }
}