import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        double target=s.nextDouble();
        double now=0;
        double speed=2;
        int step=0;
        for(;now<target;step++){
            now+=speed;
            speed*=0.98;
        }
        System.out.println(step);
    }
}