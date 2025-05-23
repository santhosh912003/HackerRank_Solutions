import java.io.*;
import java.util.*;

public class Javamap {

    public static void main(String[] args) {
       Scanner s=new Scanner(System.in);
       int n=Integer.parseInt(s.nextLine());
       HashMap<String,Integer> map=new HashMap<>();
       for(int i=0;i<n;i++){
        String key=s.nextLine();
        Integer values=s.nextInt();
        map.put(key, values);
        s.nextLine();
       }
      
       while(s.hasNext()){
        String x=s.nextLine();
        
        if(map.containsKey(x)){
            System.out.println(x+"="+map.get(x));
        }else{
            System.out.println("Not found");
        }
       }
    }
}
