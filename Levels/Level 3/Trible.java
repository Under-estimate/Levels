import java.util.Arrays;

public class Main{
    public static void main(String[] args){
        for(int i=0;i<=333;i++){
            isRequired(i,i*2,i*3);
        }
    }
    public static void isRequired(int a,int b,int c){
        int[] all=unite(parseInt(a),unite(parseInt(b),parseInt(c)));
        Arrays.sort(all);
        if(all.length!=9)return;
        for(int i=1;i<10;i++){
            if(all[i-1]!=i)return;
        }
        System.out.println(a+" "+b+" "+c);
    }
    public static int[] unite(int[] a,int[] b){
        int[] res=new int[a.length+b.length];
        int i=0;
        for(;i<a.length;i++)res[i]=a[i];
        for(int j=0;j<b.length;j++,i++)res[i]=b[j];
        return res;
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