public class fibonacci {

    public static int fibonacci(int N) {
        int res;
        if (N == 0) {
            res = 0;
        } else if (N == 1) {
            res=1;
        } else {
            res = fibonacci(N - 1) + fibonacci(N - 2);
        }
        return res;
    }


    public static void main(String[] args){
        int N =7;
        System.out.println(fibonacci.fibonacci(N));
    }
}