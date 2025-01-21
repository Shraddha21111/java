// Write a do-while loop that asks the user to enter two numbers. 
// The numbers should be added and the sum displayed. 
// The loop should ask the user whether he or she wishes to perform the operation again. 
// If so, the loop should repeat; otherwise it should terminate.
package loop;
import java.util.Scanner;
public class ques10 {
    public static void main(String[] args) {
        String choice;
      
        Scanner sc=new Scanner(System.in);
       
        int sum=0;
        do {
            System.out.println("Enter the first number:");
            int first=sc.nextInt();
            System.out.println("Enter second number:");
            int second=sc.nextInt();
            sum=first+second;
            System.out.println("sum of the given number is:"+sum);
            sc.nextLine();
            System.out.println("Do you want to continue :y?n");
            choice=sc.nextLine();
        } while (choice.equalsIgnoreCase("y"));
    
    }
}
