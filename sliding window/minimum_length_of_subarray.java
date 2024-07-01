import java.util.Scanner;

public class minimum_length_of_subarray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] nums = {2, 3, 1, 2, 4, 3};
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        
        System.out.println("Enter Target =");
        int target = input.nextInt();
        System.out.println("Minimum Array Size = " + get_subarray_length(target, nums));
    }

    public static int get_subarray_length(int target, int[] nums) {
        int start = 0, sum = 0;
        int min_length = Integer.MAX_VALUE;

        for (int end = 0; end < nums.length; end++) {
            sum += nums[end];

            while (sum >= target) {
                min_length = Math.min(min_length, end - start + 1);
                sum -= nums[start++];
            }
        }

        return (min_length == Integer.MAX_VALUE) ? 0 : min_length;
    }
}
