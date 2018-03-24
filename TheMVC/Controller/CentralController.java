package Controller;
import Model.Visitor;
import View.View;
import java.util.Scanner;
public class CentralController{
    private static Scanner reader=new Scanner(System.in);
    public CentralController(){
    
    }
    
    public static void display(){
        View.getMenu();
        while(true){
            int command=reader.nextInt();
            switch(command){
                case 1:
                    View.getAbout();
                    break;
                case 2:
                    View.getHelp();
                    break;
                case 3:
                    ServiceController.display();
                    break;
                default:
                    break;
            }
        }
    }
    
    
}