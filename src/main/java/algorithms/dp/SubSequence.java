package algorithms.dp;

/**
 * Created by Administrator on 2017/12/4.
 */
public class SubSequence {
    /**
    一个序列有N个数：A[1],A[2],…,A[N]，求出最长非降子序列的长度。
    为了方便理解我们是如何找到状态转移方程的，我先把下面的例子提到前面来讲。 如果我们要求的这N个数的序列是：

            5，3，4，8，6，7
    根据上面找到的状态，我们可以得到：（下文的最长非降子序列都用LIS表示）
            •前1个数的LIS长度d(1)=1(序列：5)
            •前2个数的LIS长度d(2)=1(序列：3；3前面没有比3小的)
            •前3个数的LIS长度d(3)=2(序列：3，4；4前面有个比它小的3，所以d(3)=d(2)+1)
            •前4个数的LIS长度d(4)=3(序列：3，4，8；8前面比它小的有3个数，所以 d(4)=max{d(1),d(2),d(3)}+1=3
    OK，分析到这，我觉得状态转移方程已经很明显了，如果我们已经求出了d(1)到d(i-1)， 那么d(i)可以用下面的状态转移方程得到：


    d(i)=max{1,d(j)+1},其中j<i,A[j]<=A[i]
    用大白话解释就是，想要求d(i)，就把i前面的各个子序列中， 最后一个数不大于A[i]的序列长度加1，然后取出最大的长度即为d(i)。
    当然了，有可能i前面的各个子序列中最后一个数都大于A[i]，那么d(i)=1， 即它自身成为一个长度为1的子序列。
     **/

    public static void main(String[] args) {
        int[] a = new int[]{5, 3, 4, 8, 6, 7};
        int[] num2 = new int[a.length];

        for (int i = 0; i < a.length; i++) {
            num2[i] = 1;
        }

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < i ; j++) {
                if(a[j] < a[i] && num2[i] < num2[j] + 1) {
                    num2[i] = num2[j] + 1;
                }
            }
        }

        for (int i = 0; i < num2.length; i++) {
            System.out.println(num2[i]);
        }

    }
}