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
        message.setStatus(MessageStatus.SENT);
        this.messages.add(message);
        receiver.receiveMessage(message);
        System.out.println("Message sent from " + userName + " to " + message.getReceiverName() + ": " + message.getTextMessage());
        System.out.println();
    }


    public void receiveMessage(Message message) {
        this.messages.add(message);
        message.setStatus(MessageStatus.RECEIVED);
        System.out.println(userName + " received a new unread message from " + message.getSenderName());
        System.out.println();
    }

    public void readMessage(Message message) {
        message.setStatus(MessageStatus.READ);
    }
    public void readAllMessages() {
        for (Message message : messages) {
            if (message.getStatus() == MessageStatus.RECEIVED) {
                readMessage(message);
            }
        }
    }
    public void showMessage (MessageStatus status){
        //1.відобразити усі повідомлення зі статусом, який вказаний у параметрі при виклику (статус)
        //пройтися по колекції messages
        //для кожного мес, який має вказаний статус,надрукувати його в консоль
            System.out.println("---" + this.userName + "'s messages with status ---" + status);
              for (Message message : messages) {
                if (message.getStatus() == status) {
                    System.out.println("From: " + message.getSenderName() + "\nText: " + message.getTextMessage() + "\n(Status: " + message.getStatus()+")");
                }
            }
        }
    }




