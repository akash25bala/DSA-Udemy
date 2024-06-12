package Recursion;

public class Fib {
    public static void findFibo(int a, int b, int n){
        if(n == 0){
            return;
        }
        int c = a + b;
        System.out.print(c + " ");
        findFibo(b, c, n-1);
    }

    public static void main(String args[]){
        int n = 5;
        int a = 0;
        int b = 1;
        System.out.print(a + " ");
        System.out.print(b + " ");
        findFibo(a,b,n-2);
    }
}
