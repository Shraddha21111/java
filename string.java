import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner sc = new Scanner(System.in);
      String str=sc.nextLine();
        System.out.println(str.toUpperCase());
        String nonTrimmedString=   "  Shraddha  ";
        System.out.println(nonTrimmedString.trim());
    }
}
