

public class maximum_average_subarray_1 {
    public static void main(String[] args) {
        int[] nums = {5};
        int k = 1;
        System.out.println(findMaxAverage(nums, k));
    } """
    public static double findMaxAverage(int[] nums, int k) {
        int start=0,end=k;
        double avg=0.0;
        if (k==nums.length){
            double sum = 0;
            for(int i=0;i<nums.length;i++){
                sum+=nums[i];
            }
            return sum/k;
        }
        while (end<=nums.length) {
            float temp;
            double sum=0;
            for(int i=start;i<end;i++){
                sum+=nums[i];
            }
            if (sum/k > avg){
                avg=sum/k;
            }else{
                start++;
                end++;
            }
            
        }
        return avg;
    }
}
"""
        public double findMaxAverage(int[] nums, int k) {
        int windowSum = 0;
        // Calculate the sum of the first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;

        // Slide the window and update maxSum
        for (int i = k; i < nums.length; i++) {
            windowSum += nums[i] - nums[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }

        return (double) maxSum / k;
    }
}
