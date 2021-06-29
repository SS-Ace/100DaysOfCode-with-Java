package LinkList;

public class listPivoting {
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
	  
	  public static Node<Integer> listpivoting(Node<Integer> n, int x){
		  Node<Integer> lessh = new Node<>(0);
		  Node<Integer> equalh = new Node<>(0);
		  Node<Integer> greaterh = new Node<>(0);
		  Node<Integer> lessiter = lessh;
		  Node<Integer> equaliter = equalh;
		  Node<Integer> greateriter = greaterh;
		  
		  Node<Integer> iter = n;
		  while(iter != null) {
			  if(iter.data < x) {
				  lessiter.next = iter;
				  lessiter = iter;
			  }
			  
			  else if(iter.data == x) {
				  equaliter.next = iter;
				  equaliter = iter;
				  
			  }
			  
			  else {
				  greateriter.next = iter;
				  greateriter = iter;
			  }
			  iter = iter.next;
		  }
		  
		  greateriter.next = null;
		  equaliter.next = greaterh.next;
		  lessiter.next = equalh.next;
		  return lessh.next;
	  }
	public static void main(String[] args) {
		Node<Integer> pivnode = new Node<Integer>(3);
		   insert(pivnode, 1);
		   insert(pivnode, 2);
		   insert(pivnode, 2);
		   
		   
		   print(pivnode);
		   System.out.println();
		   print(listpivoting(pivnode,1));
		   
	}

}
