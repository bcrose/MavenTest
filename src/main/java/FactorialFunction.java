public class FactorialFunction {
    public static int factorial(int n){
        int result=1,i=1;
        while(i<=n){
            result=result*i;
            i++;
        }

        return result;
    }
}
