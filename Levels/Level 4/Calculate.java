import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int total=s.nextInt();
        int[] number=new int[total];
        for(int i=0;i<number.length;i++)number[i]=s.nextInt();
        int result=0;
        boolean flag;
        for(int i=0;i<number.length;i++){
            flag=false;
            for(int j=0;j<number.length;j++){
                for(int k=j+1;k<number.length;k++){
                    if(number[i]==number[j]+number[k]){
                        result++;
                        flag=true;
                        break;
                    }
                }
                if(flag)break;
            }
        }
        System.out.println(result);
    }
}