package kfish.leetcode.common.structure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Node {
    public int val;
    public TreeNode left;
    public TreeNode right;
}
