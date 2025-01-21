import java.util.Scanner;
public class ques3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter radius of circle:");
        float radius= sc.nextFloat();
     double area;
       area=Math.PI*radius*radius;
        System.out.println(area);

    }
}
