
public class find_min {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 12, 3,0};
        System.out.println(find_min(arr));
    }
    public static int find_min(int[] arr){
        int start=0,end=arr.length-1;
        int min = 0;
        while(start<=end){ //&& start<arr.length){
            if(arr[start]<=arr[end]){
                min = arr[start];
                end--;
            }else{
                min = arr[end];
                start++;
            }
        }
        return min;
    }
}
