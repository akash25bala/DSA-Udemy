package Recursion;

public class Fibonacci {
    public void fibonacci(int n,int m,int index){
        if(index == 0){
            return;
        }
        int next = n+m;
        System.out.println(next);
        fibonacci(m,next,index-1);


    }

}
