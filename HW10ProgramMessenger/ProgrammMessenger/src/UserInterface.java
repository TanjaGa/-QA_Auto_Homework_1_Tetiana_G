import java.util.ArrayList;
import java.util.HashSet;

public interface UserInterface {
    String getUserName();
    HashSet<UserInterface> getContacts();
    ArrayList<Message> getMessages();

    void addContact(UserInterface contact);
    void sendMessage(UserInterface receiver, String textMessage);
    void receiveMessage(Message message);


}