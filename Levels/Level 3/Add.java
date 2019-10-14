import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int target=s.nextInt();
        double now=0;
        int i=1;
        for(;now<=target;i++)now+=1.0/i;
        System.out.println(i-1);
    }
}