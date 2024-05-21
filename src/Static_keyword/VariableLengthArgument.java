
package Static_keyword;


public class VariableLengthArgument {
    void add (int...num){
        int sum=0;
        for(int x:num){
            sum=sum+x;
        }
        System.out.println(""+sum);
    }
    
}
