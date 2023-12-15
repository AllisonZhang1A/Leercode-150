/**
 * @Auther: zhangyian
 * @Date: 2023/12/15 21:34
 * @Description:
 * 输入：nums = [3,2,2,3], val = 3
 * 输出：2, nums = [2,2]
 * 解释：函数应该返回新的长度 2, 并且 nums 中的前两个元素均为 2。你不需要考虑数组中超出新长度后面的元素。
 * 例如，函数返回的新长度为 2 ，而 nums = [2,2,3,3] 或 nums = [2,2,0,0]，也会被视作正确答案。
 */
public class removeElement {
    public static void main(String[] args) {
        removeElement removeElement=new removeElement();
        int nums[]={0,1,2,2,3,0,4,2};
        int val=2;
        removeElement.removeElement(nums,val);
    }

    public int removeElement(int[] nums, int val) {
        int j=0;//慢指针
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j]=nums[i];
                j++;
            }
        }
        return j;
    }
}
