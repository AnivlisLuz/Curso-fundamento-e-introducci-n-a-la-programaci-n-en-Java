import java.util.ArrayList;

public class ContactsManager{
    private ArrayList<Person> people;
    
    public ContactsManager (){
        people = new ArrayList<Person>();
    }
    
    public void add(Person person){
        people.add(person);
    }
    
    public Person findByPhone(String phone){
        Person response=null;
        for(int i = 0;i<people.size();i++){
            Person current = people.get(i);
            if(current.getPhone() == phone){
                response = current;
                break;
            }
        }
        return response;
    }
    
    public Person findByName(String name){
        Person response=null;
        for(int i = 0;i<people.size();i++){
            Person current = people.get(i);
            if(current.getPhone() == name){
                response = current;
                break;
            }
        }
        return response;
    } 
    
    public void sortAlphabetically(){
        for(int i = 0; i < people.size() - 1; i++){
            for(int j = 0; j < people.size() - 1 - i; j++){
                Person current = people.get(j);
                Person next = people.get(j+1);
                String nameCurrent = current.getName();
                String nameNext = next.getName();
                if(nameCurrent.compareTo(nameNext)>0){
                    Person aux = people.remove(j);
                    people.add(j+1, aux);
                }
            }
        }
    }
}