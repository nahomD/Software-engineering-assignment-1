package Infrastructure;
import Core.I_VistorRepository;
import Core.Visitor;

public class VistorRepository implements I_VistorRepository{
    
    private Visitor[] visitors={
        new Visitor("Nahom","Der"),
        new Visitor("Nathnael","Dej")
    };
    
    private Visitor visitor;
    public boolean save(){
        this.visitors[1]=this.visitor;
        return true;
    }
    
    public Visitor[] getVisitors(){
        return this.visitors;
    }
    
    public void addVisitor(Visitor visitor){
        this.visitor=visitor;
    }
    
}