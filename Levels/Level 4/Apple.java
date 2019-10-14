import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[] apples=new int[10];
        int height;
        for(int i=0;i<apples.length;i++)apples[i]=s.nextInt();
        height=s.nextInt()+30;
        int number=0;
        for(int i : apples)if(i<=height)number++;
        System.out.println(number);
    }
}