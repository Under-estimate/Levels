import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int start_h=s.nextInt();
        int start_m=s.nextInt();
        int end_h=s.nextInt();
        int end_m=s.nextInt();
        start_m+=start_h*60;
        end_m+=end_h*60;
        end_m-=start_m;
        System.out.println(end_m/60+" "+end_m%60);
    }
}