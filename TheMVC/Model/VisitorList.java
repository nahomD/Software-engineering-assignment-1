package Model;

public class VisitorList{
    private static Visitor[] list={new Visitor("Nahom","Derese"),new Visitor("Lidya","Derese")};
    public VisitorList(){
    
    }
    
    public static Visitor[] getVisitorList(){
        return list;
    }

}