// Write a program to print out all Armstrong numbers between 1 and 500. If sum of 
// cubes of each digit of the number is equal to the number itself, then the number is called an Armstrong number.
// For example, 153 = ( 1 * 1 * 1 ) + ( 5 * 5 * 5 ) + ( 3 * 3 * 3 )


package loop;
import java.util.Scanner;
public class ques6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=0;
        int n;
        System.out.println("Enter a number");
        int num =sc.nextInt();
        n=num;
        while (num!=0) {
            int digit=num%10;
       temp+=digit*digit*digit;
      num=num/10;
        }
 if (temp==n) {
    System.out.println("it is armstrong number");
 }
    }
}
