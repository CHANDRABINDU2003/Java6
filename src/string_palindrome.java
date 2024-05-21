
public class string_palindrome {
    public static void main(String[] args) {
        String S1="wow";
        StringBuffer s = new StringBuffer(S1);
        
        String S2=s.reverse().toString();
        if(S1.equals(S2))
        {
            System.out.println("true");
        }
        else
            System.out.println("false");
    }
   
}
