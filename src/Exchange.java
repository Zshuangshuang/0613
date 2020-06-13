/**
 * @ClassName: Exchange
 * @Author: 邹双双
 * Date: 2020/6/13 11:41
 * @Description:牛客网习题
 */
public class Exchange {
    public int[] exchangeAB() {
        // write code here
        int[] AB = new int[10];
        for (int i = 0; i < AB.length-1; i++) {
            int tmp = AB[0];
            AB[0] = AB[AB.length-1];
            AB[AB.length-1] = tmp;
        }
       return AB;
    }
}