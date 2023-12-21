/**
 * @Auther: zhangyian
 * @Date: 2023/12/15 21:34
 * @Description:出现超过两次的元素只能让它出现两次

输入：nums = [1,1,1,2,2,3]
输出：5, nums = [1,1,2,2,3]
解释：函数应返回新长度 length = 5,
并且原数组的前五个元素被修改为 1, 1, 2, 2, 3。 不需要考虑数组中超出新长度后面的元素。
 */
public class removeDuplicates2 {
    public static void main(String[] args) {
        removeDuplicates2 removeElement=new removeDuplicates2();
        int nums[]={0,0,1,1,1,1,2,3};
        int len=removeElement.removeDuplicates(nums);
        System.out.println(len);
    }

    public int removeDuplicates(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int slow = 2, fast = 2;
        while(fast<nums.length){
            if(nums[slow-2]!=nums[fast]){
                //TODO:
                nums[slow]=nums[fast];
                slow++;
            }
            fast++;
        }
        return slow;
    }
}
