import java.time.LocalDateTime;
/**
 * Write a description of class Message here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Message
{
    private Person addressee;
    private Person sender;
    private String message;
    private LocalDateTime dateTime; 
    public Message(Person addressee, Person sender,String message){
        this.addressee = addressee;
        this.sender = sender;
        this.message = message;
        dateTime = LocalDateTime.now();
    }
    
    public Person getAddressee(){
        return addressee;
    }
    
    public Person getSender(){
        return sender;
    }
}
