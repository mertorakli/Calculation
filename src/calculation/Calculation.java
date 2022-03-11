
package calculation;
import java.util.Scanner;


public class Calculation {

   
    public static void main(String[] args) {
        Scanner inp=new Scanner(System.in);
        int n1, n2,c;
       
        System.out.print("Enter First Number: ");
         n1 = inp.nextInt();
         System.out.print("Enter Second Number: ");
         n2 = inp.nextInt();
         
         System.out.println("add:1\nsubstract:2\nmultiply:3\ndivide:4");
         System.out.print("What do u want to do?:");
         c = inp.nextInt();
         
         switch (c){
             case 1:
                 System.out.println("Your Result:" + n1+n2);
                 break;
             case 2:
                 System.out.println("Your Result:" + (n1-n2));
                 break;
                 case 3:
                    
                 System.out.println("Your Result:" + n1*n2);
                 break;
                 case 4:
                 System.out.println("Your Result:" + (n1/n2));
                 break;
                 
                 default:
                     System.out.println("Hatalı giriş yaptınız!");
                     
             
         
         
         }
        
         
      
        
    }
    
}
