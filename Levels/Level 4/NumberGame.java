import java.util.Scanner;
import java.util.Stack;

public class Main{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack();
        int temp;
        while((temp=s.nextInt())!=0)st.push(temp);
        while(!st.empty()){
            System.out.print(st.pop()+" ");
        }
    }
}