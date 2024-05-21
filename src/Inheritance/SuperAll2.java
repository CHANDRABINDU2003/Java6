
package Inheritance;


public class SuperAll2 extends SuperAll1 {
    int gear;
    SuperAll2(String c, double w  ,int g){
        super(c,w);
        gear=g;
    }
    @Override
   void display(){
       super.display();
        System.out.println(gear);
   }
}
