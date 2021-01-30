import java.util.ArrayList;
/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person{
    private String name;
    private int age;
    private String phone;
    private ContactsManager contactsManager;
    private MessagesManager messagesManager;
    public Person (String name, int age, String phone){
        this.name = name;
        this.age = age;
        this.phone = phone;
        contactsManager = new ContactsManager();
        messagesManager = new MessagesManager();
    }
    
    public String getPhone(){
        return phone;
    }
    
    public String getName(){
        return name;
    }
    
    public int getAge(){
        return age;
    }
    
    public void addPersonToContacts(Person person){
        contactsManager.add(person);
    }
    
    public Person findPersonByPhone(String phoneNumber){
        return contactsManager.findByPhone(phoneNumber);
    }
    
    public Person findPersonByName(String name){
        return contactsManager.findByName(name);
    }
    
    public void sortMyContactsAlphabetically(){
        contactsManager.sortAlphabetically();
    }
    
    public void sendMessageWithPhone(String phone,String message){
        Person sender = this;
        Person adressee = contactsManager.findByPhone(phone);
        if(adressee!=null){
            Message toSendMessage = new Message(adressee, sender, message);
            sender.messagesManager.sendMessage(toSendMessage);
            adressee.receiveMessage(toSendMessage);
        }
    }
    
    public void receiveMessage(Message message){
        messagesManager.receiveMessage(message);
    }
    
    public ArrayList <Message> getReceivedMessages(){
        return messagesManager.getReceivedMessages();
    }
    
    public ArrayList <Message> getReceivedMessagesFromFriend(String phone){
        Person adressee = contactsManager.findByPhone(phone);
        ArrayList <Message> messagesFromFriend = null;
        if(adressee!=null){
            messagesFromFriend=messagesManager.getReceivedMessagesFromFriend(adressee);
        }    
        return messagesFromFriend;
    }
    
    public ArrayList <Message> getSentMessages(){
        return messagesManager.getSentMessages();
    }
}
