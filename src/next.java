
public class next {
  String name,gender;
int phone;
next(){
    System.out.println("no value");
}
next(String n,String g,int p){
    name=n;
    gender=g;
    phone=p;
}
next(String n,String g){
    name=n;
    gender=g;
}
void display()
{
    System.out.println(""+name);
    System.out.println(""+gender);
    System.out.println(""+phone);
}
}
