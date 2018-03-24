package Core;

public class Visitor{

    public Visitor(String firstName, String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    
    private String firstName;
    private String lastName;
    
    public void setFirstName(String firstName){
        this.firstName=firstName;
    }
    
    public String getFirstName(){
        return this.firstName;
    }
    
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    
    public String getLastName(){
        return this.lastName;
    }
    
    public String toString(){
        return this.firstName+" "+this.lastName;
    }
}