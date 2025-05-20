import java.io.*;
import java.util.*;

public class EndofFile {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int lines=1;
        while(sc.hasNext()){
            String Line=sc.nextLine();
            System.out.println(lines+" "+Line);
            lines++;
        }
    }
}
