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
		
		public static Node<Integer> reversesublist(Node<Integer> n, int start, int finish){
			
			if(start == finish) {
				return n;
				
			}
			
			Node<Integer> dummy = new Node<>(0);
			dummy.next = n;
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
			
			
		}
		
		public static int hasCycle(Node<Integer> head){
			
			Node<Integer> fast = head, slow = head;
			
			while(fast != null && fast.next != null) {
				
				slow = slow.next;
				fast = fast.next.next;
				if(slow == fast) {
					
					int cyclelen = 0;
					do {
						++cyclelen;
						fast = fast.next;	
					}while(slow != fast);
					
					Node<Integer> cyclelenAdvance = head;
					while(cyclelen-- > 0) {
						cyclelenAdvance = cyclelenAdvance.next;
					}
					
					Node<Integer> iter = head;
					while(iter != cyclelenAdvance) {
						iter = iter.next;
						cyclelenAdvance = cyclelenAdvance.next;
					}
					return iter.data;
				}
			}
			return 0;
		}
		
		public static void deletionfromfirst(Node<Integer> nodetoDelete) {
			nodetoDelete.data = nodetoDelete.next.data;
			nodetoDelete.next = nodetoDelete.next.next;
			
		}
		
		public static Node<Integer> deletekth(Node<Integer> deletenode, int k) {
			Node<Integer> dh = new Node<>(0);
			dh.next = deletenode;
			Node<Integer> f = dh.next;
			
			while(k-- > 0) {
				
				f = f.next;
			}
			
			Node<Integer> s = dh;
			while(f != null) {
				
				s = s.next;
				f = f.next;
			}
			
			s.next = s.next.next;
			return dh.next;
		}
		
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
   
   Node<Integer> node4 = new Node<Integer>(4);
   node4 = node3;
   node4 = reversesublist(node4, 1, 4);
   print(node4);
   
   Node<Integer> node5 = new Node<Integer>(1);
   insert(node5, 1);
   insert(node5, 2);
   insert(node5, 3);
   insert(node5, 4);
   node5.next.next.next.next = node5.next;
   System.out.println("");
   System.out.println("");
   System.out.println(hasCycle(node5));
   
   Node<Integer> node6 = new Node<Integer>(1);
   insert(node6, 1);
   insert(node6, 2);
   insert(node6, 3);
   System.out.println("Before deletion: ");
   print(node6);
   System.out.println();
   deletionfromfirst(node6);
   System.out.println("After deletion: ");
   print(node6);
   
   deletekth(node6, 2);
   System.out.println();
   print(node6);
  }
 
}