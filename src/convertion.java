import java.util.Scanner;
public class convertion {
    public static void main(String[] args) {
        String bi ="101011";
        Integer de=Integer.parseInt(bi,2);
        System.out.println(""+de);
        String oc="675";
        Integer dec=Integer.parseInt(oc,8 );
        System.out.println(""+dec);
        String hex="F";
        Integer d=Integer.parseInt(hex,16 );
        System.out.println(""+d);
        int decimal;
        Scanner input=new Scanner(System.in);
        decimal=input.nextInt();
        String b=Integer.toBinaryString(decimal);
        System.out.println(""+b);
        String o=Integer.toOctalString(decimal);
        System.out.println(""+o);
        String h= Integer.toHexString(decimal);
        System.out.println(""+h);
    }
  
}
