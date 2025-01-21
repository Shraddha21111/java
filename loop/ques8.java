// Write a program to calculate the sum of following series where n is input by user.
// 1 + 1/2 + 1/3 + 1/4 + 1/5 +…………1/n
package loop;
import java.util.Scanner;
public class ques8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter a number to print the series upto:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int temp=i;
      System.out.print("1/"+i+"+");
        }
    }
}
