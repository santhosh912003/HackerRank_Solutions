import java.io.*;
import java.util.*;

public class StaticIntializer {

    public static void main(String[] args) {
           Scanner s=new Scanner(System.in);
           int b=s.nextInt();
           int h=s.nextInt();
           if(b>0 && h>0){
            int res=b*h;
            System.out.println(res);
           }else{
            System.out.println("java.lang.Exception: Breadth and height must be positive");
           }        
    }
}
