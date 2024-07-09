
class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Binary_tree {
    private Node root = null;
    private Node tempNode = root;

    boolean Is_Empty() {
        return this.root == null;
    }

    Node Create_Node(int data) {
        return new Node(data);
    }

    void Insert(int item) {
        Node newNode = Create_Node(item);
        if (this.Is_Empty()) {
            this.root = newNode;
        } else {
            Insert_Rec(this.root, newNode);
        }
    }

    void Insert_Rec(Node root, Node newNode) {
        if (newNode.data < root.data) {
            if (root.left == null) {
                root.left = newNode;
            } else {
                Insert_Rec(root.left, newNode);
            }
        } else if (newNode.data > root.data) {
            if (root.right == null) {
                root.right = newNode;
            } else {
                Insert_Rec(root.right, newNode);
            }
        } else {
            System.out.println("Same Element doesn't allowed in BST");
        }
    }

    Node Search(int val){
        if(this.root == null){
            return null;
        }else{
            return Search_Rec(this.root, val);
        }
    }

    Node Search_Rec(Node root,int val){
        if(root==null){
            return null;
        }
        if(root.data==val){
            return root;
        }else if(root.data > val){
            tempNode = root;
            return Search_Rec(root.left, val);
        }else {
            tempNode = root;
            return Search_Rec(root.right, val);
        }
    }

    void delete(int val){
        if(this.root == null){
            System.out.println("Empty Tree");
        }else{
            delete_Rec(this.Search(val));
        }
    }

    void delete_Rec(Node root){
        if(root==null){
            System.out.println("value Doesn't exist");
            return;
        }else{
            if(root.left==null && root.right==null){
                if(tempNode.data > root.data){
                    tempNode.left = null;
                }else{
                    tempNode.right = null;
                }
            }else if(root.left!=null && root.right==null){
                if(tempNode.data > root.data){
                    tempNode.left = root.left;
                }else{
                    tempNode.right = root.left;
                }
            }
            else if (root.left==null && root.right!=null){
                if(tempNode.data > root.data){
                    tempNode.left = root.right;
                }else{
                    tempNode.right = root.right;
                }
            }else{
                Node temp_root1 = this.tempNode;
                Node temp_root2 = Find_Min(root);
                root.data = temp_root2.data;
                if(tempNode.data > temp_root2.data){
                    tempNode.left = null;
                }else{
                    tempNode.right = null;
                }
            }
        }
    }

    Node Find_Min(Node root){
        if(root==null){
            return tempNode;
        }else{
            tempNode = root;
            return Find_Min(root.left);
        }
    }

    Node Find_Min(){
        return Find_Min(root.left);
    }

    Node Find_Max(Node root){
        
        if(root==null){
            return tempNode;
        }else{
            tempNode = root;
            return Find_Max(root.right);
        }
    }

    Node Find_Max(){
        return Find_Max(root.right);
    }

    void Inoder_Traversal(Node root_Node) {
        if (root_Node == null) {
            return;
        }
        this.Inoder_Traversal(root_Node.left);
        System.out.print(root_Node.data+" ");
        this.Inoder_Traversal(root_Node.right);
    }

    void Preorder_Traversal(Node root_Node) {
        if (root_Node == null) {
            return;
        }
        System.out.print(root_Node.data+" ");
        this.Preorder_Traversal(root_Node.left);
        this.Preorder_Traversal(root_Node.right);
    }

    void Postorder_Traversal(Node root_Node) {
        if (root_Node == null) {
            return;
        }
        this.Postorder_Traversal(root_Node.left);
        this.Postorder_Traversal(root_Node.right);
        System.out.print(root_Node.data+" ");
    }

    void Inoder_Traversal() {
        Inoder_Traversal(this.root);
    }

    void Preorder_Traversal() {
        Preorder_Traversal(this.root);
    }

    void Postorder_Traversal() {
        Postorder_Traversal(this.root);
    }

    Node get_TempNode(){
        return this.tempNode;
    }
}

public class Binary_search_tree {
    public static void main(String[] args) {
        try {
            Binary_tree b1 = new Binary_tree();
            b1.Insert(40);
            b1.Insert(70);
            b1.Insert(10);
            b1.Insert(7);
            b1.Insert(27);
            b1.Insert(80);
            b1.Insert(20);
            b1.Insert(30);
            b1.Insert(35);
            b1.Inoder_Traversal();
            System.out.println();
            b1.delete(27);
            b1.Inoder_Traversal();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }
}
