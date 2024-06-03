package Recursion;
// sum of n natural numbers
public class Pr0blem2 {
    int sum=0;

    public int Pr0blem2(int n,int i) {

        int index = 1;
        if( n==i){
            return 0;
        }
        sum = sum+n;
        Pr0blem2(n-1,i);
        return sum;
    }



}
