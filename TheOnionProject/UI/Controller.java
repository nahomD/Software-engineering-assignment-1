package UI;

import Infrastructure.VistorRepository;
import Core.*;
import java.util.Scanner;

public class Controller{
    private VistorRepository repo;
    private Scanner reader;
    public Controller(){
        this.repo=new VistorRepository();
        this.reader=new Scanner(System.in);
    }
    
    public void display(){
        System.out.println("Welcome to my applica-sean!!");
        System.out.println("1.get visitor list");
        System.out.println("2.Add visitor");
        while(true){
            int n = this.reader.nextInt();
            commander(n);
            System.out.println("1.get visitor list");
            System.out.println("2.Add visitor");
        }
    }
    
    public void commander(int command){
        switch(command){
            case 1:
                Visitor[] visitors=this.repo.getVisitors();
                
                for(int i=0;i<visitors.length;i++){
                    System.out.println(visitors[i]);
                }
                break;
            case 2:
                /*String firstName=this.reader.nextInt("First name: ");
                String lastName=this.reader.nextInt("Last name: ");*/
                Visitor visitor=new Visitor("firstName","lastName");
                this.repo.addVisitor(visitor);
                VisitorProccessor.save(this.repo);
                break;
            default:
                break;
        }
    }
}