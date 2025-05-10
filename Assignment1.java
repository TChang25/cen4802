import java.util.HashMap;

public class Assignment1 {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static void main (String[] args){
        int n = 10;
        System.out.printf("The %d term of the Fibonacci sequence is %d\n", n, fib(n));
    }
    public static int fib(int n){
        if (n <= 1){
            return n;
        }
        else if (memo.containsKey(n)) {
            return memo.get(n);
        }
        memo.put(n, fib(n-1) + fib(n-2));
        return memo.get(n);
    }
}
