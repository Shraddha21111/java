
package loop;
import java.util.Scanner;
public class ques1 {
    public static void main(String[] args) {
     System.out.println("enter the number");
        Scanner sc=new Scanner(System.in);
        int n = sc.nextInt();
        int factorial=1;
        for (int i = 1; i <= n; i++) {
          factorial*=i;
        }
        System.out.println(factorial);
    }
}
