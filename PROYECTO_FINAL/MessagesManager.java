import java.util.ArrayList;

public class MessagesManager{
    private ArrayList <Message> receivedMessages;
    private ArrayList <Message> sentMessages;
    
    public MessagesManager (){
        receivedMessages = new ArrayList<Message>();
        sentMessages = new ArrayList<Message>();
    }
    
    public void sendMessage(Message message){
        this.sentMessages.add(message);
    }
    
    public void receiveMessage(Message message){
        this.receivedMessages.add(message);
    }
    
    public ArrayList <Message> getReceivedMessages(){
        return receivedMessages;
    }
    
    public ArrayList <Message> getReceivedMessagesFromFriend(Person person){
        ArrayList<Message> messagesFromFriend = new ArrayList<Message> ();
        for(int i = 0; i<receivedMessages.size(); i++){
            Message currentMessage=receivedMessages.get(i);
            if(currentMessage.getSender() == person){
                 messagesFromFriend.add(currentMessage);
            }
        }
        return messagesFromFriend;
    }
    
    public ArrayList <Message> getSentMessages(){
        return sentMessages;
    }
    
    public ArrayList <Message> getSentMessagesFromFriend(String phone){
        ArrayList<Message> messagesFromFriend = new ArrayList<Message>();
        for(int i = 0; i< sentMessages.size(); i++){
            Message currentMessage = sentMessages.get(i);
            if(currentMessage.getAddressee().getPhone() == phone){
                messagesFromFriend.add(currentMessage);
            }
        }
        return messagesFromFriend;
    }
}
