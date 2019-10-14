import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int dayofWeek=s.nextInt();
        int day=s.nextInt();
        int swimday=0;
        for(int i=0;i<day;){
            if(!(dayofWeek==6||dayofWeek==7))
                swimday++;
            i++;
            dayofWeek=(dayofWeek==7)?1:(dayofWeek+1);
        }
        System.out.println(swimday*250);
    }
}