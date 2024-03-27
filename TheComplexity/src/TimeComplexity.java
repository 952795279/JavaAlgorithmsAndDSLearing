/**
 * 时间复杂度由 𝑇(𝑛) 中最高阶的项来决定
 */
public class TimeComplexity {
    // 常数阶 O(1)
    int constant(){
        int count = 0;
        int size = 1;
        // T(n) =  100000，近似看作1
        for (int i = 0; i < size; i++) {
            count++;
        }
        return count;
    }

    // 线性阶O(n)  ----  遍历数组、链表都是线性阶
    int linear(int n){
        int count = 0;
        // T(n) = n
        for (int i = 0; i < n; i++) {
            count++;
        }
        return count;
    }

    // 平方阶O(n^2)  ----  冒泡排序
    int quadratic(int n){
        int count = 0;
        // T(n) = n^2
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count++;
            }
        }
        return count;
    }

    // 指数阶O(2^n)  ---- 常见于递归函数、穷举（暴力搜索、回溯）  ----  动态规划、贪心算法解决
    // 循环实现
    int exponential(int n){
        int count = 0, base = 1;
        // 1, 2, 4, 8, ..., 2^(n-1)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < base; j++) {
                count++;
            }
            base *= 2;
        }
        return count;
    }
    // 指数阶递归实现
    int expRecur(int n){
        if(n == 1){
            return 1;
        }
        return expRecur(n-1) + expRecur(n-1) + 1;
    }

    // 对数阶O(log n)  ---- 同样常见于递归函数,分治策略
    // 循环实现
    int logarithmic(float n){
        // 1、计数
        int count = 0;
        // 2、循环实现对半
        while(n > 1){
            n = n/2;
            count ++;
        }
        return count;
    }
    // 递归实现
    int logRecur(float n){
        // 递归返回的条件
        if(n < 1){
            return 0;
        }
        // 对半操作
        return logRecur(n/2) + 1;
    }

    // 线性对数阶  ----  常见嵌套循环
    int linearLogRecur(float n){
        // 递归返回条件
        if(n <= 1){
            return 1;
        }
        // 对半操作
        int count = linearLogRecur(n / 2) + linearLogRecur(n / 2);
        // 循环操作
        for (int i = 0; i < n; i++) {
            count++;
        }
        return count;
    }

    // 阶乘阶  --  全排列
    int factorialRecur(int n){
        if (n == 0){
            return 1;
        }
        int count =0;
        // 从1个分裂出n个
        for (int i = 0; i < n; i++) {
            count += factorialRecur(n - 1);
        }
        return count;
    }
}
