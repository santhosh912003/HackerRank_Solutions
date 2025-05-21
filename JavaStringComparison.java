import java.util.*;
public class JavaStringComparison{
    public static String getLargestAndSmallest(String a,int b){
         String smallest=a.substring(0,b);
         String largest=a.substring(0,b);
         for(int i=1;i<=a.length()-b;i++){
            String c=a.substring(i,i+b);
            if(c.compareTo(smallest)<0){
                smallest=c;
            }
            if(c.compareTo(largest)>0){
                largest=c;
            }
         }
         return smallest+"\n"+largest;
    }
    public static void main(String[]args){
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();
        int b=s.nextInt();
        System.out.println(getLargestAndSmallest(a,b));
    }
}

