// Write a program to print Fibonacci series of n terms where n is input by user :
// 0 1 1 2 3 5 8 13 24 ….
package loop;
import java.util.Scanner;
public class ques7 {
    public static void main(String[] args) {
        System.out.println("Enter a number:");
       Scanner sc =new Scanner(System.in);
       int num =sc.nextInt();
       System.out.println("Fibonacci series up to " + num + " terms:"); 
       int next;
       int first=0;
       int second=1;
        for (int i = 0; i < num; i++) {
          System.out.println(first+"");
          next=first+second;
          first=second;

          second=next;
        }
    }
}
