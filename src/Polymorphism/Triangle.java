
package Polymorphism;


public class Triangle extends Shape {
   double base,length;
   Triangle(double base , double length)
   {
       this.base=base;
       this.length=length;
   }
   @Override
   double area(){
       System.out.print("area of triangle:");
       return 0.5*base*length;
   }
}
