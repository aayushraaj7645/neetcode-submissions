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
    public int goodNodes(TreeNode root) {
        return inorder(root,  0,   Integer.MIN_VALUE);
        
    }
    public int inorder(TreeNode node , int count, int max){
        if(node == null){
            return 0;
        }

        if(node.val >= max){
            count++;
            max = node.val;
        }
      
        return count + inorder(node.left,0,max) + inorder(node.right,0,max) ;
    }













}
