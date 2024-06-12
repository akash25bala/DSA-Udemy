package Recursion;
// factorial by recursion
public class Factorial {

    public static int factorial(int n,int fact){
        if(n==0 || n==1){
            return 1;
        }

        return n*factorial(n-1,fact);
    }

}
