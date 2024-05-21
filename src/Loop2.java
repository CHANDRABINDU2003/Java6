
import java.util.Scanner;


public class Loop2 {
    public static void main(String[] args) {
        int i,m,n,res=0;
        Scanner input = new Scanner(System.in);
        System.out.println("give two numbers"); 
        m=input.nextInt();
        n=input.nextInt();
        for(i= m;i<=n;i++)
        {if(i%2==0)
            res=res+i;
        }
          System.out.println("the result is"+res);  
    }
    
}
