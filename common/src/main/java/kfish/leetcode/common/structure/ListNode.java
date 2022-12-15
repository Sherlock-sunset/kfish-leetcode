package kfish.leetcode.common.structure;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ikaf woyu2015@sina.com
 * @date ListNode.java, v 1.0.0 2022年06月16日 08:26 by ikaf
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ListNode {
    public int val;
    public ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
