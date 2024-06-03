package Recursion;

import java.sql.SQLOutput;

public class BasicRecursion {
    public void recursion(int n){
        System.out.println(n);
        if(n==0){
            return;
        }
        recursion(n-1);
        System.out.println(n);
    }

}
