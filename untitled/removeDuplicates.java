import java.util.HashSet;

/**
 * @Auther: zhangyian
 * @Date: 2023/12/15 21:34
 * @Description:
 *输入：nums = [0,0,1,1,1,2,2,3,3,4]
 *输出：5, nums = [0,1,2,3,4]
 * 解释：函数应该返回新的长度 5 ， 并且原数组 nums 的前五个元素被修改为 0, 1, 2, 3, 4 。
 * 不需要考虑数组中超出新长度后面的元素。
 * 因为是有序数组，重复项一定是在当前元素的后面。
 * 用两个指针，一个指针指向当前元素，另一个指针从这个元素的后面开始遍历，遍历到不重复的数字的时候将它替换到当前元素的下一个位置。
 */
public class removeDuplicates {
    public static void main(String[] args) {
        removeDuplicates removeElement=new removeDuplicates();
        int nums[]={1,1,2};
        int len=removeElement.removeDuplicates(nums);
        System.out.println(len);
    }

    public int removeDuplicates(int[] nums) {
        int fast=1;
        int slow=0;
        while(fast< nums.length){
            if(nums[slow]==nums[fast]){
                fast++;
            }else{
                slow++;
                nums[slow]=nums[fast];
            }
        }
        return slow;
    }
}
