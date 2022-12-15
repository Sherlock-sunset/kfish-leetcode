package kfish.leetcode.sequence.positive.to100;

import kfish.leetcode.common.structure.ListNode;

/**
 * 两数相加
 *
 * @author ikaf woyu2015@sina.com
 * @date Leetcode2.java, v 1.0.0 2022年06月16日 08:25 by ikaf
 */
public class Leetcode2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        //1.翻转链表
        l1 = reverse(l1);
        l2 = reverse(l2);
        //2.相加
        while (l1.next!=null && l2.next!=null){

        }
        //3.再次翻转
        l1 = reverse(l1);
        return l1;

    }
    /**
     * 逆转链表
     */
    public ListNode reverse(ListNode node){
        ListNode ans = node;

        return ans;
    }
}
