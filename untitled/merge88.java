import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Auther: zhangyian
 * @Date: 2023/12/14 22:10
 * @Description:
 * leetcode88题
 *
 * 输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
 * 输出：[1,2,2,3,5,6]
 * 解释：需要合并 [1,2,3] 和 [2,5,6] 。
 * 合并结果是 [1,2,2,3,5,6] ，其中斜体加粗标注的为 nums1 中的元素。
 */public class merge88 {
    public static void main(String[] args) {
        merge88 merge88 = new merge88();
        int[] nums1={4,5,6,0,0,0};
        int[] nums2={1,2,3};
        int m=3;
        int n=3;
        merge88.merge(nums1,m,nums2,n);
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            for(int i=0;i<nums2.length;i++){
                nums1[i]=nums2[i];
            }
        }
        int i=m-1;
        int j=n-1;
        int k=m+n-1;//合并后的数组长度
        while(i>=0&&j>=0){
            if(nums2[j]>=nums1[i]){
                nums1[k]=nums2[j];
                j--;
                k--;
            }else{
                nums1[k]=nums1[i];
                i--;
                k--;
            }
        }
        while (j>=0){
            nums1[k]=nums2[j];
            j--;
            k--;
        }
    }

}
