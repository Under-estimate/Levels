import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int length=s.nextInt();
        int areas=s.nextInt();
        boolean[] b=new boolean[length+1];
        for(int i=0;i<b.length;i++)b[i]=true;
        for(int i=0;i<areas;i++){
            clear(b,s.nextInt(),s.nextInt());
        }
        int num=0;
        for(boolean tree:b)if(tree)num++;
        System.out.println(num);
    }
    public static void clear(boolean[] b,int start,int finish){
        for(int i=start;i<=finish;i++)b[i]=false;
    }
}