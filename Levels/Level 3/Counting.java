import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int dest=s.nextInt();
        int num=s.nextInt();
        int[] temp;
        int statistic=0;
        for(int i=1;i<=dest;i++){
            temp=parseInt(i);
            for(int j=0;j<temp.length;j++)
                if(temp[j]==num)statistic++;
        }
        System.out.println(statistic);
    }
    public static int[] parseInt(int a){
        if(a<10){
            int[] res=new int[1];
            res[0]=a;
            return res;
        }
        int num=0;
        int b=a;
        while(b>=10){
            b/=10;
            num++;
        }
        b=a;
        int[] res=new int[num+1];
        for(int i=0;i<=num;i++){
            res[i]=b%10;
            b/=10;
        }
        return res;
    }
}