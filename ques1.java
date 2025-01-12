import java.util.Scanner;
public class ques1 {
   public static void main(String[] args) {
   
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter marks of first subject:");
    int num1=sc.nextInt();
    System.out.println("enter marks of second subject");
    int num2 =sc.nextInt();
    System.out.println("enter marks of third subject");
    int num3 =sc.nextInt();
    System.out.println("Enter marks of fourth subject:");
    int num4 =sc.nextInt();
    System.out.println("Enter marks of fifth subject");
    int num5 =sc.nextInt();
    int average=(num1+num2+num3+num4+num5)/5;
    System.out.println(average);
   }
 
    
}
