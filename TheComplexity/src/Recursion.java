/**
 * 递归
 * 自己调用自己
 * 一定要注意回归的条件
 */
public class Recursion {
    public int fib(int n){
        if (n == 1){
            return 0;
        } else if (n == 2) {
            return 1;
        }
        return fib(n - 1)  + fib(n - 2);
    }
}
