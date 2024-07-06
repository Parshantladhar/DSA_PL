class Solution {

    void printNos(int N) {
        // code here
        if(N==0){
            return;
        }else{
            System.out.print(N+" ");
            printNos(N-1);
        }
    }
}