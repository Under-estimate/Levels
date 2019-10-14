import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int yuan=s.nextInt();
        int jiao=s.nextInt();
        jiao+=yuan*10;
        System.out.println(jiao/19);
    }
}