import java.util.*;

class Node{
     int data;
     Node right = null;
     Node left = null;
     public Node(int data){
          this.data = data;
     }
}
class TreeProg{
     public static void main(String[] args) {
          Node root = new Node(1);
          root.right = new Node(2);
          root.left = new Node(3);
          root.left.left = new Node(4);
          root.left.right = new Node(5);

          preOrder(root);
     }

     public static void preOrder(Node root){
          if(root == null) return;
          System.out.print(root.data+" ");
          preOrder(root.left);
          preOrder(root.right);
     }
}
