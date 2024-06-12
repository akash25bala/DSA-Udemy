package Recursion;

public class Problem1 {

    public void problem1(int n){
        if(n>5){
            return;
        }
        System.out.println(n);
        problem1(n+1);
        System.out.println(n);
    }
}
