package Controller;
import View.*;
import java.util.Scanner;
import Model.*;
public class ServiceController{
    
    private static Scanner reader=new Scanner(System.in);
    public ServiceController(){
    }
    
    public static void display(){
        View.getServices();
        while(true){
            int command=reader.nextInt();
            commander(command);
            View.getServices();
        }
    }
    
    public static void commander(int command){
        switch(command){
            case 1:
                Visitor[] list=VisitorList.getVisitorList();
                for(int i=0;i<list.length;i++){
                    System.out.println(list[i]);
                }
                break;
            default:
                break;
        }
    }
}