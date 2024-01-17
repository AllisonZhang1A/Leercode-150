/**
 * @Auther: zhangyian
 * @Date: 2024/1/17 14:09
 * @Description:
 * 给你一个整数数组 nums ，其中元素已经按 升序 排列，请你将其转换为一棵 高度平衡 二叉搜索树。
 *
 */
public class SearchTree {
    public static void main(String[] args) {

        SearchTree searchTree = new SearchTree();
        int[] nums={-10,-3,0,5,9};
        searchTree.sortedArrayToBST(nums);
    }

    public TreeNode sortedArrayToBST(int[] nums){
        int left=0;
        int right=nums.length-1;
        return Inorder(nums,left,right);
    }

    public TreeNode Inorder(int nums[],int left,int right){
        if(left>right){
            return null;
        }

        int mid=(left+right)/2;
        //建立根节点
        TreeNode root= new TreeNode(nums[mid]);//建立根节点
        //构建左子树和右子树
        root.left=Inorder(nums,left,mid-1);//中间节点左边
        root.right=Inorder(nums,mid+1,right);//中间节点右边
        return root;
    }
}