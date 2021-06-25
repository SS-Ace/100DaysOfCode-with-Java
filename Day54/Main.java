package LinkList;

public class Main {

 
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


		public static Node<Integer> mergeTwoSortedLists(Node<Integer> L1,
				Node<Integer> L2) {
				// Creates a placeholder for the result.
				Node <Integer> dummyHead = new Node<>(0);
				Node <Integer> current = dummyHead;
				Node <Integer> p1 = L1 , p2 = L2 ;
				
				while (p1 != null && p2 != null) {
					if (p1.data <= p2.data) {
					current.next = p1;
					p1 = p1.next ;
					} else {
					current.next = p2 ;
					p2 = p2.next ;
					}
					current = current.next ;
					}
					// Appends the remaining nodes of pi or p2.
					current.next = p1 != null ? p1 : p2 ;
					return dummyHead.next ;
		}
		
		/*public static Node<Integer> reversesublist(Node<Integer> n, int start, int finish){
			
			if(start == finish) {
				return n;
				
			}
			
			Node<Integer> dummy = new Node<>(0);
			Node<Integer> subHead = dummy;
			int k = 1;
			while(k++ < start) {
               subHead = subHead.next;     }
		 
			Node<Integer> subIt = subHead.next;
			
			while(start++ < finish) {
				
				Node<Integer> temp = subIt.next;
				subIt.next = temp.next;
				temp.next = subHead.next;
				subHead.next = temp;
			}
			
			return dummy.next;
			
			
		}*/
  public static void main(String[] args) {
	  Node<Integer> node = new Node<Integer>(1);
   insert(node, 5);
   print(node);
   
   Node<Integer> node2 = new Node<Integer>(4);
   insert(node2, 6);
   print(node2);
   
   Node<Integer> node3 = new Node<Integer>(4);
   node3 = mergeTwoSortedLists(node, node2);
   System.out.print("Required output: ");
   print(node3);
   
  /* Node<Integer> node4 = new Node<Integer>(4);
   node4 = node3;
   node4 = reversesublist(node4, 1, 2);
   print(node4);
    */
  }
 
}