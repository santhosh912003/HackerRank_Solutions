import java.io.*;
import java.util.*;

public class StringToken {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        String[] b=a.trim().split("[^A-Za-z]+");
        if(b.length==1&&b[0].isEmpty()){
            System.out.println("0");
        }else{
            System.out.println(b.length);
        }
        for(String c:b){
            System.out.println(c);
        }
    }
}
