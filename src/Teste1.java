public class Teste1 {
    public static int findMaxSum(int[] nums) {
        int maxSum = nums[0];
        int currentSum = nums[0];
        int start = 0;
        int end = 0;
        int currentStartIndex = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > currentSum + nums[i]) {
                currentSum = nums[i];
                currentStartIndex = i;
            } else {
                currentSum += nums[i];
            }
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = currentStartIndex;
                end = i;
            }
        }
        System.out.print("Subarray com soma maxima: ");
        for (int i = start; i <= end; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        return maxSum;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, -4};
        int maximumSum = findMaxSum(nums);
        System.out.println("Soma maxima do subarray: " + maximumSum);
    }
}

