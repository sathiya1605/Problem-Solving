import java.util.*;
class Node{

     int data;
     Node next = null;
     public Node(int data){
          this.data = data;
     }
}
class ArrToLL{
     public static void main(String[] args) {
          ArrayList<Integer> arr = new ArrayList<>();
          arr.add(5);
          arr.add(6);
          arr.add(3);
          arr.add(7);
          Node list = arrayToLL(arr);

          System.out.print("Linked list:");
          while(list!= null){
               System.out.print(list.data+"->");
               list = list.next;
          }
     }

     public static Node arrayToLL(ArrayList<Integer> arr){
          Node head = null;
          Iterator i = arr.iterator();
          while(i.hasNext())
               head = insertNode(head, (int)i.next());
          return head;
     }

     public static Node insertNode(Node head, int data){
          if(head == null){
               head = new Node(data);
               return head;
          }
          Node temp = head;
          while(temp.next != null)
               temp = temp.next;
          temp.next = new Node(data);
          return head;
     }
}


//System.out.print(arr);
