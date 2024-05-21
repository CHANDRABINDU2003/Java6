
import java.util.Scanner;


public class Break {
    public static void main(String[] args) {
        System.out.println("");
        Scanner input = new Scanner(System.in);
        int i,n;
        n = input.nextInt();
        System.out.println("number is "+n);
        for(i=0;i<=n;i++)
        {{
            if(i==10)
                break;
        }
            System.out.println(i);
        }
        
        
        for(i=0;i<=n;i++)
        {{
            if(i==10)
                continue;
        }
            System.out.println(i);
        }
    }
    
}
