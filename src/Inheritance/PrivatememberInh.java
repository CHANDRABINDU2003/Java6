
package Inheritance;


public class PrivatememberInh {
   private String name;
   private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   void display1(){
       System.out.println(name);
       System.out.println(id);
   }
   
}
