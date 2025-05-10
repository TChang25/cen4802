import java.util.HashMap;

public class Assignment1 {
    static HashMap<Integer, Integer> memo = new HashMap<>();
    public static void main (String[] args){
        int n = 10;
        System.out.printf("The %d term of the Fibonacci sequence is %d\n", n, fib(n));
    }

    /**
     * Returns the given nth number of the fibonacci sequence.
     * Utilizes memoization to reduce recursive depth.
     *
     * @param n representing the nth number
     * @return result given nth of fibonacci
     */
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
