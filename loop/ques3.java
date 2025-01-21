package loop;
// Write a program that prompts the user to input an integer and then 
// outputs the number with the digits reversed. For example, if the input is 12345, the output should be 54321.package loop;
import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=0;
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        while (n!=0) {
           int digit=n%10;
           num=num*10+digit;
          n= n/10;
        }
     System.out.println(num);
    }
}
