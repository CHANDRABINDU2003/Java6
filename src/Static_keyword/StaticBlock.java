
package Static_keyword;


public class StaticBlock {
    static int id;
    static String name;
    static{
        id=2102006;
        name="CHANDRABINDU";
    }
   static void display(){
       System.out.println(""+id);
       System.out.println(""+name);
   }
    public static void main(String[] args) {
        StaticBlock.display();
    }
    
}
