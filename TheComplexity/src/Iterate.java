/**
 * 迭代
 * 重复执行直至完成任务
 * 即循环
 */

public class Iterate {
    // for求和
    public int forLoop(int n){
        int sum = 0;
        for(int i=0; i < n; i++){
            sum += i;
        }
        return sum;
    }

    // while求和
    public int whileLoop(int n){
        int sum = 0;
        int i = 0;
        while(i < n){
            sum += i;
            i ++;
        }
        return sum;
    }

    // 嵌套循环
    public String nestedLoop(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                stringBuilder.append("(" + i + "," + j + ")");
            }
        }
        return stringBuilder.toString();
    }

}
