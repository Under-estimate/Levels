import java.io.IOException;

public class Main{
    public static void main(String[] args){
        int total=nextInt();
        int cont=0;
        int max=0;
        int prev=nextInt();
        int temp;
        for(int i=1;i<total;i++){
            temp=nextInt();
            if(temp>prev){
                cont++;
                max=Math.max(max,cont);
            }
            else{
                cont=0;
            }
            prev=temp;
        }
        System.out.println(max+1);
    }
    public static int nextInt(){
        String res="";
        char temp='\0';
        OUTER:
        while (true) {
            temp=safeRead();
            switch (temp) {
                case ' ':
                    break OUTER;
                case '\r':
                    safeRead();
                    break OUTER;
                case '\n':
                    break OUTER;
                default:
                    res=res+temp;
                    break;
            }
        }
        return Integer.parseInt(res);
    }
    public static char safeRead(){
        try{
            char temp=(char)System.in.read();
            return temp;
        }
        catch(IOException e){
            System.out.println("Read error:"+e);
            System.exit(1);
        }
        return '\0';
    }
}