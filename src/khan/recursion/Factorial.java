package khan.recursion;

public class Factorial {

    public static int factorialNoRecursion(int n){
        int result = 1;
        for(int i=1; i<=n; i++){
            result *=i;
        }
        return result;
    }

    public static int factorialRecursive(int n){
        //base case
        if(n==0)
            return 1;

        return n * factorialRecursive(n-1);
    }

    public static void main(String[] args) {
        System.out.printf("5!= %d, %d \n", factorialNoRecursion(5), factorialRecursive(5));

        System.out.printf("10!= %d %d\n", factorialNoRecursion(10), factorialRecursive(10));
    }
}
