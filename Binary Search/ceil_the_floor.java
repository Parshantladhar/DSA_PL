
class Solve {
    Pair getFloorAndCeil(int[] arr, int n, int x) {
        // code here
        Arrays.sort(arr);
        int low = 0 , high = n-1;
        int _floor = -1 , _ceil = -1;
        
        // BS for Floor
        while(low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==x){
                _floor = arr[mid];
                _ceil = arr[mid];
            }
            else if(arr[mid]<x){
                _floor = arr[mid];
                low = mid+1;
            }else if(arr[mid]>x){
                _ceil = arr[mid];
                high = mid -1;
            }
        }
        return new Pair(_floor,_ceil);
    }
}
