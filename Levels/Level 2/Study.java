import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int unhappy=0;
        int temp=0;
        int day=0;
        for(int i=1;i<=7;i++){
            temp=s.nextInt()+s.nextInt();
            if(temp>8&&(temp-8)>unhappy){
                unhappy=temp-8;
                day=i;
            }
        }
        System.out.println(day);
    }
}