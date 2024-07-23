import java.util.ArrayList;
import java.util.HashSet;

public class User implements UserInterface {
    String userName;
    HashSet<UserInterface> contacts;
    ArrayList<Message> messages;

    public User(String userName) {
        this.userName = userName;
        this.contacts = new HashSet<>();
        this.messages = new ArrayList<>();

    }

    @Override
    public void addContact(UserInterface contact) {
        contacts.add(contact);
    }

    @Override
    public String getUserName() {
        return userName;
    }

    @Override
    public HashSet<UserInterface> getContacts() {
        return contacts;
    }

    @Override
    public ArrayList<Message> getMessages() {
        return messages;
    }


    @Override
    public void sendMessage(UserInterface receiver, String textMessage) {
        Message message = new Message(this.userName, receiver.getUserName(), textMessage);
        this.messages.add(message);
        receiver.receiveMessage(message);
    }

    public void receiveMessage(Message message) {
        this.messages.add(message);
        message.setStatus(MessageStatus.RECEIVED);
    }

    public void readMessages(MessageStatus status) {
        //1.відобразити усі повідомлення зі статусом, який вказаний у параметрі при виклику (статус)

        //пройтися по колекції messages
        //для кожного мес, який має вказаний статус,надрукувати його в консоль
    }
}


