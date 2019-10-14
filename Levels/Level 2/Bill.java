import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int total=s.nextInt();
        stdOutput(calc(total,0.4463,150)+calc(total-=150,0.4663,250)+calc(total-=250,0.5663,10000));
    }
    public static double calc(int elec,double price,int max){
       return Math.max(Math.min(elec, max),0)*price;
    }
    public static void stdOutput(double d){
        double head=((int)(d*10))/10.0;
        int tail=((int)(d*100))%10;
        head+=(tail>=5)?0.1:0;
        System.out.println(head);
    }
}