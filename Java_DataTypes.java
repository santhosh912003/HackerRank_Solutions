import java.io.*;
import java.util.*;

public class Java_DataTypes {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            try{
               long a=s.nextLong();
               System.out.println(a+" can be fitted in:");
               if(a>=Byte.MIN_VALUE && a<=Byte.MAX_VALUE)
                  System.out.println("* byte");
               if(a>=Short.MIN_VALUE && a<=Short.MAX_VALUE)
                  System.out.println("* short");
               if (a >= Integer.MIN_VALUE && a <= Integer.MAX_VALUE)
                    System.out.println("* int");
                if (a >= Long.MIN_VALUE && a <= Long.MAX_VALUE)
                    System.out.println("* long");  
            }
            catch(Exception e){
                System.out.println(s.next()+" can't be fitted anywhere.");
            }
            
        }
    }
}
