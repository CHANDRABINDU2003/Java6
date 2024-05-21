
package Inheritance;


public class InstanceOperator123Test {
    public static void main(String[] args) {
        InstanceOperator x = new InstanceOperator ();
        InstanceOperator2 y = new InstanceOperator2();
        InstanceOperator3 z = new InstanceOperator3();
        System.out.println(x instanceof InstanceOperator);
        System.out.println(y instanceof InstanceOperator);
        System.out.println(z instanceof   InstanceOperator2);
                System.out.println(z instanceof InstanceOperator);
     System.out.println(x instanceof   InstanceOperator2);
    }
   
}
