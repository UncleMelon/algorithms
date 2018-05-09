package algorithms.practice;

/**
 * Created by Administrator on 2017/12/5.
 */
public class MaxSubArray {
    static int[] a = new int[]{3,-1,2,5,-3,4,-6,-7,1,8,-3,5,9};
    static int[] a1 = new int[]{1, -2, 3, 10, -4, 7, 2, -5};
    static int[] a2 = new int[]{1,-2,-3,5,10};

    /**
     * 暴力破解
     *
     * 蛮力法是最简单的实现方法，只要列出数组所有可能的组合，然后找出其中和最大的组合即可；
     * 蛮力法分三层循环实现：
     * 1）第一层循环用于固定子数组的起始位置；
     * 2）第二层循环用于确定子数组的结束位置；
     * 3）第三层循环用于子数组和的计算，从子数组的头开始遍历到其尾，累加起来就是该子数组的和。
     * 算法效率O(n2)
     */
    public static void maxSubArray1(int[] array) {
        int max = 0, sum = 0;
        int start_pos = 0, end_pos = 0;

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    sum += array[k];
                    if (sum > max) {
                        max = sum;
                        start_pos = i;
                        end_pos = j;
                    }
                }
            }
        }

        System.out.println(max + " " + start_pos + " " + end_pos);



    }

    /**
     * 分治法
     * 分治法的精髓：
     * 1）分--将问题分解为规模更小的子问题；
     * 2）治--将这些规模更小的子问题逐个击破；
     * 3）合--将已解决的子问题合并，最终得出“母”问题的解；
     * 所以原数组的最大子数组求法：
     * 1）分--将原数组拆分成两部分，每个部分再拆分成新的两部分......直到数组被分得只剩下一个元素；
     * 2）治--每个小型的数组找最大子数组，只有一个元素的数组，解就是该元素；
     * 3）合--将两个小型数组合并为一个数组，其中解有三种可能：
     * 左边的返回值大，
     * 右边的返回值大，
     * 中间存在一个更大的子数组和；
     * 返回值应选最大的；
     */
    public static void maxSubArray2(int[] array) {
        System.out.println(find_maximum_subarray(array, 0, array.length-1));
    }

    public static int find_maximum_subarray(int[] array, int low, int high) {
        if (low == high) { //只有一个元素时，返回该元素
            return array[low];
        } else {
            int mid = (low + high) / 2;
            int left_max = find_maximum_subarray(array, low, mid);
            int right_max = find_maximum_subarray(array, mid + 1, high);
            int cross_max = find_max_crossing_subarray(array, low, mid, high);
            //返回三个值中最大的一个
            if (left_max >= right_max && left_max >= cross_max) {
                return left_max;
            } else if (right_max >= left_max && right_max >= cross_max) {
                return right_max;
            } else {
                return cross_max;
            }

        }

    }

    public static int find_max_crossing_subarray(int[] array, int low, int mid, int high) {
        int sum = 0, left_sum = Integer.MIN_VALUE, right_sum = Integer.MIN_VALUE; //分别用于记录左、右方向累加的最大和
        for (int i = mid; i >= low; i--) { //中线开始向左寻找
            sum += array[i];
            if (sum > left_sum) {
                left_sum = sum;
            }
        }
        sum = 0;
        for (int i = mid+1; i <= high; i++) { //中线开始向右寻找
            sum += array[i];
            if(sum > right_sum) {
                right_sum = sum;
            }
        }
        return left_sum + right_sum; //返回左右之和
    }

    /**
     * 方法三线性时间实现基于这样的思路：
     * 如果a[1..j]已经得到了其最大子数组，那么a[1..j+1]最大子数组只能是两种情况
     * （1）a[1..j+1]的最大子数组就是a[1..j];
     * （2）a[1..j+1]的最大子数组是a[i..j+1],1<=i<=j;
     * 那么，如何求得所谓的（2）中的a[i..j+1]呢？
     * 首先需要承认这样的事实，如果一个数组a[p..r]求和得到负值，那么数组a[p..r+1]的最大子数组肯定不会是a[p..r+1]，
     * 因为a[p..r]+a[r+1]<a[r+1].
     * 在以上程序中，我们用temp存储所谓的a[p..r]，只要a[p..r]的求和是负值，
     * 那么从下一个a[r+1]值开始，temp重新从零开始求和，只要temp > summax,就更新summax,这样，
     * 我们一次遍历后，就能得到最大的summax,接下来，我们证明该算法是有效的
     *
     * 证明：
     * 对于所有数组元素，这样的元素对数组进行划分，如果加上该元素之前temp>0且temp+a[i]<0，
     * 那么该元素a[i]是一个边界，这样，数组会形成好多段，每段结束元素都满足temp>0且temp+a[i]<0.
     * 所以我们能得到多个划分块a[p..q]，每个划分快的和是负值，划分块有这样的性质，对任意p<=i<q,
     * 显然，sum(a[p..i])>=0且sum(a[i..q]）<0;
     * 我们要证明
     * （1）最大子数组一定在划分块之内
     * 证明：
     * 根据划分快性质，容易证明，只要子数组横跨多个划分快，其求和值必定小于某个单独的划 分快中的数组求和。
     * （2）一定存在首元素以划分块的首元素开始的最大子数组。
     * 证明：
     * 对于某个划分快a[p..q],假设存在a[i..j],其中p<i<=j<q,那么根据划分块性质，a[p..i-1]+a[i..j]>=a[i..j]必定成立,得证。
     * 所以，经历一次遍历，对于每个划分块，从首元素开始求和，得到最大值更新summax,一定能够得到最大子数组的值。
     */


    public static void maxSubArray3(int[] array) {
        int start_pos = 0, end_pos = 0;  //记录最大子数组的起始位置（在数组中的下标）
        int maxSumSub;   //最大子数组的值
        int[] dp = new int[array.length];  //动态规划记录


        dp[0] = array[0];  //初始为第一个数
        maxSumSub = dp[0];   //最大值初始为第一个数
        int temp = 0;

        for (int i = 1; i < array.length; i++) {
            if (dp[i - 1] <= 0) {  //前面的<0，直接丢弃
                dp[i] = array[i];
                temp = i;  //记录起始为止
            } else {
                dp[i] = dp[i-1] + array[i];  //往后求和
            }

            if (dp[i] > maxSumSub) {   //找到到i为止的最大子数组
                maxSumSub = dp[i];  //最大...
                start_pos = temp;   //标记起始
                end_pos = i;   //标记此时的结束位置
            }
        }

        System.out.println(maxSumSub + " " + start_pos + " " +end_pos);

    }


    public static void main(String[] args) {
        maxSubArray3(a2);
    }
}
