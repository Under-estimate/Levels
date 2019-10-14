import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int handy=0;
        int saved=0;
        int result=0;
        for(int i=1;i<=12;i++){
            handy+=300;
            handy-=s.nextInt();
            if(handy<0){
                System.out.println(result=-i);
                while(s.hasNext())s.next();
                break;
            }
            saved+=100*(handy/100);
            handy-=100*(handy/100);
        }
        if(result==0)System.out.println(((int)(saved*1.2))+handy);
    }
}