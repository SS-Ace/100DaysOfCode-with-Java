package LinkList;

public class deletesorted {


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
	  
	  public static Node<Integer> removeDuplicates(Node<Integer> node){
		  Node<Integer> iter = node;
		  while(iter != null) {
			  Node<Integer> nextDistinct = iter.next;
			  while(nextDistinct != null && nextDistinct.data == iter.data) {
				  nextDistinct = nextDistinct.next;
			  }
				  iter.next = nextDistinct;
				  iter = nextDistinct;
			  }
			  return node;
		  }
	  

	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node<Integer> node6 = new Node<Integer>(3);
		   insert(node6, 1);
		   insert(node6, 1);
		   insert(node6, 2);
		   insert(node6, 2);
		   
		   print(node6);
		   removeDuplicates(node6);
		   System.out.println();
		   print(node6);
	}

}
