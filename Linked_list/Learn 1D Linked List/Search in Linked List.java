// User function Template for Java

/* Node of a linked list
  class Node {
   int data;
    Node next;
    Node(int d)  { data = d;  next = null; }
}
*/
class Solution {
    static boolean searchKey(int n, Node head, int key) {
        // Code here
        if(n==0){
            return false;
        }else if(n==1 && head.data==key){
            return true;
        }else{
            Node temp = head;
            while(temp!=null && temp.data!=key){
                temp=temp.next;
            }
            if(temp==null){
                return false;
            }else{
                return true;
            }
        }
    }
}