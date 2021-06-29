package LinkList;
import java.util.*;
public class isPalindrome {
	  public static Node<Integer> insert(Node node, int v){
	        Node<Integer> newNode = new Node<Integer>(v);
	        newNode.next = node.next;
	        node.next = newNode;
	        return node;
	  }

	  public static void print(Node node){
	     while(node != null){
	      System.out.print(node.data+" ");
	      node = node.next;
	    }
	  }
	  
	  public static boolean isLinkedListPalindromic(Node<Integer> n) {
		  if(n == null) {
			  return true;
		  }
		  
		  Node<Integer> slow = n, fast = n;
		  while(fast != null && fast.next != null) {
			  fast = fast.next.next;
			  slow = slow.next;
		  }
		  
		  Node<Integer> firsthalfIter = n;
		  Node<Integer> secondhalfIter = reverse(slow);
		  while(secondhalfIter != null && firsthalfIter != null) {
			  if(secondhalfIter.data != firsthalfIter.data) {
				  return false;
			  }
			  
			  secondhalfIter = secondhalfIter.next;
			  firsthalfIter = firsthalfIter.next;
		  }
		  return true;
	  }
	  
	  public static Node<Integer> reverse(Node<Integer> node){
	  Node<Integer> prev = null;
      Node<Integer> current = node;
      Node<Integer> next = null;
      while (current != null) {
          next = current.next;
          current.next = prev;
          prev = current;
          current = next;
      }
      node = prev;
      return node;
	  }
	  
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		Node<Integer> palinode = new Node<Integer>(3);
		   insert(palinode, 3);
		   insert(palinode, 2);
		   insert(palinode, 2);
		   
		   
		   print(palinode);
		   System.out.println();
		  System.out.println(isLinkedListPalindromic(palinode));
	
	}

}
