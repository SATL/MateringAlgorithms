package khan.recursion;

public class Power {


    public static boolean isEven(int n){
        return n%2 ==0;
    }

    public static double power(int x, int n){

        if(n<0) return 1/power(x, -n);
        else if (n==0) return 1;
        else{
            if(isEven(n)){
                double y = power(x, n/2);
                return y * y;
            }else{
                return power(x, n-1) * x;
            }
        }
    }

    public static void showPow(int x, int n){
        System.out.printf("%d^%d = %f \n", x, n, power(x,n));
    }

    public static void main(String[] args) {
        showPow(3, 0);
        showPow(3, 1);
        showPow(3, 2);
        showPow(3, -1);
    }
}
