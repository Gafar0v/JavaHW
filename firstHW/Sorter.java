public class Sorter {
    static void bubbleSort(int[] nums) {
        int len = nums.length;
        int tmp = 0;
        for (int i = 0; i < len - 1; i++) {
            for (int j = 0; j < len - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    tmp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = tmp;
                }
            }
        }
        for (int i = 0; i < len; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
