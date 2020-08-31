/*   Created by IntelliJ IDEA.
 *   Author: Kuldeep Singh (kuldeep506)
 *   Date: 8/9/2020
 *   Time: 5:12 PM
 *   File: GreatestCommonDivisor.java
 */

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(getGreatestCommonDivisor(25, 15));
    }

    public static int getGreatestCommonDivisor(int first, int second) {
        int divisor = 0;
        if (first < 10 || second < 10) {
            return -1;
        }
        int max = Math.max(first,second);
        for (int i = 1; i <= max; i++) {
            if ((first % i == 0) && (second % i == 0))
                divisor = i;
        }
        return divisor;
    }
}