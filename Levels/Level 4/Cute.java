import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();
        ArrayList<Integer> al=new ArrayList();
        Iterator<Integer> temp;
        int src;
        int less;
        for(int i=0;i<num;i++){
            less=0;
            al.add(src=s.nextInt());
            temp=al.iterator();
            while(temp.hasNext())if(temp.next()<src)less++;
            System.out.print(less+" ");
        }
    }
}