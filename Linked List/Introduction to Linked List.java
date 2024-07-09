// User function Template for Java

/*
class Node {
    int data;
    Node next;

    Node() { data = 0; }
    Node(int d) { data = d; }  //constructor to create a new node
}
*/
class Solution {
    private Node head = null;
    private Node tail = null;

    Node constructLL(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            end_insert(arr[i]);
        }
        return head;
    }

    void end_insert(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            tail = newnode;
        } else {
            tail.next = newnode;
            tail = newnode;
        }
    }

    
}