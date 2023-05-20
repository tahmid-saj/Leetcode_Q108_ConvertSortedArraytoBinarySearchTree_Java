/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode balance(int[] nums, int left, int right) {
        while (left <= right) {
            int middle = (left + right) / 2;

            TreeNode node = new TreeNode(nums[middle]);
            node.left = balance(nums, left, middle - 1);
            node.right = balance(nums, middle + 1, right);

            return node;
        }

        return null;
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int last = nums.length - 1;

        return balance(nums, 0, last);
    }
}
