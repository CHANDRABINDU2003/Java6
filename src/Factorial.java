
import java.util.Scanner;


public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i,fact=1,m;
        m=input.nextInt();
        for(i=m;i>=1;i--)
        {
            fact=fact*i;
        }
        System.out.println("factorial is"+fact);
    }
}
