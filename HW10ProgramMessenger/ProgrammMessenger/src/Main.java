
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

lisa.sendMessage(masha,"Hello Masha! How are you");
        System.out.println(lisa.getUserName() +" sent message to "+masha.getUserName());
lisa.sendMessage(tania,"Hello Tania! How are you");
        System.out.println(lisa.getUserName() +" sent message to "+tania.getUserName());


Message receiveMessage = masha.getMessages().get(0);
System.out.println(receiveMessage.getStatus());


    }
}