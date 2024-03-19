public class question3 {
   /* 230. Kth Smallest Element in a BST
    Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.*/
    /*Input: root = [3,1,4,null,2], k = 1
       Output: 1
   */
  public class TreeNode { //constructor for the structure of tree
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
public class Solution {  //Solution class i.e how to implement the solution
    int number = -1;
    int count = 1;

    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root, k);
        return number;
    }

    private void inorderTraversal(TreeNode node, int k) {
        if (node != null) {
            inorderTraversal(node.left, k);
            if (count == k) {
                number = node.val;
            }
            count++;
            inorderTraversal(node.right, k);
        }
    }
}
public static void main(String args[])
{
    question3 q = new question3();
    question3.TreeNode root = q.new TreeNode(3);
    root.left = q.new TreeNode(1);
    root.right = q.new TreeNode(4);
    root.left.right = q.new TreeNode(2);
    int k = 2;
    Solution obj = q.new Solution();
    System.out.println(obj.kthSmallest(root, k));


} 
}