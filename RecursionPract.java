package Recursion;

public class RecursionPract {
    int result = 1;
    public int recurtionPract(int fact){
        if(fact == 0){
            return 1;
        }
        result = result*fact;
        recurtionPract(fact-1);
       return result;
    }

}
