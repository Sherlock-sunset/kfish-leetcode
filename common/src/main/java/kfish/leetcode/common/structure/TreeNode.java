package kfish.leetcode.common.structure;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
}
