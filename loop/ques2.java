package loop;
import java.util.Scanner;
public class ques2 {
    public static void main(String[] args) {
      int result=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
     int n=sc.nextInt();
     System.out.println("Enter the power of number");
     int power=sc.nextInt();
     for (int i = 0; i < power; i++) {
        result*=n;
     }
    System.out.println(result);
    }
}
