import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class ArrayList {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        ArrayList<ArrayList<Integer>> data=new ArrayList<>();
        for(int i=0;i<n;i++){
            int a=s.nextInt();
            ArrayList<Integer> arr=new ArrayList<>();
            for(int j=0;j<a;j++){
                 arr.add(s.nextInt());  
            }
            data.add(arr);
        }
        int n1=s.nextInt();
        for(int i=0;i<n1;i++){
            int row=s.nextInt();
            int col=s.nextInt();
            if(row>0&&row<=data.size()&&col>0&&col<=data.get(row-1).size()){
                System.out.println(data.get(row-1).get(col-1));
            }else{
                System.out.println("ERROR!");
            }
            
        }
    }
}
