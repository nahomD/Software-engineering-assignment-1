package Core;

public class VisitorProccessor{

    public VisitorProccessor(){
    
    }
    
    public static void save(I_VistorRepository repository){
        repository.save();
    }
}