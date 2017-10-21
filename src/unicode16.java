import java.util.Scanner;

public class unicode16 {
    public static void main(String[]args){
        Scanner in=new Scanner(System.in);
        String str;
        str=in.next();
        System.out.println((char)Integer.parseInt(str,16));
    }
}
