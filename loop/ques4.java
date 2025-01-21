package loop;
import java.util.Scanner;
public class ques4 {
    public static void main(String[] args) {
Scanner sc =new Scanner(System.in);
System.out.println("Enter a number:");
int num=sc.nextInt();
int sum_even=0;
int sum_odd=0;
for (int i = 0; i < num; i++) {
   if (i%2==0) {
    sum_even+=i;
   }
   else{
sum_odd+=i;
   }
}    
System.out.println("sum of even digits is" +sum_even);    
System.out.println("sum of odd digits is" +sum_odd);   
    }
}
