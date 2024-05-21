
package Polymorphism;


public class Rectangular extends Shape {
  double height,width;
Rectangular(double height , double width){
    this.height=height;
    this.width=width;
}  
@Override
double area(){
    
    System.out.print("Area of rectangular:");
    return height*width;
}}
