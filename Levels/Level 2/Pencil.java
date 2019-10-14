import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int number=s.nextInt();
        int[] pencils=new int[3];
        int[] prices=new int[3];
        for(int i=0;i<3;i++){
            pencils[i]=s.nextInt();
            prices[i]=s.nextInt();
        }
        int money=Integer.MAX_VALUE;
        for(int i=0;i<3;i++)
            money=Math.min(money, (up(((double)number)/((double)pencils[i]))*prices[i]));
        System.out.println(money);
    }
    public static int up(double d){
        return (int)((d>(int)d)?d+1:d);
    }
}