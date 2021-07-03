package NinePointTen;

import java.util.*;
public class QueueWithMax {

private Queue<Integer> entries = new LinkedList<>();
private Deque<Integer> D = new LinkedList<>();

public void enqueue(int x) {
	entries.add(x);
	while(!D.isEmpty()) {
		if(D.getLast().compareTo(x) >= 0)
           break;
		D.removeLast();
		
	}
	D.addLast(x);
}

public Integer dequeue() {
	if(!entries.isEmpty()) {
		Integer result = entries.remove();
		if(result.equals(D.getFirst())) {
			D.removeFirst();
		}
		
		return result;
	}
	throw new NoSuchElementException("called dequeueQ on empty queue");
	
}

public Integer max() {
	
	if(!D.isEmpty()) {
		return D.getFirst();
	}
	throw new NoSuchElementException("empty queue");
	
}


	public static void main(String[] args) {
		QueueWithMax q = new QueueWithMax();
       int e[] = {3,1,3,2,0};
       for(int i = 0; i < e.length; i++) {
    	   q.enqueue(e[i]);
       }
    	   System.out.println("\n Q:"+q.entries+"\n D:"+q.D );
    	   q.enqueue(1);
    	   System.out.println("delete:"+q.dequeue());
    	   System.out.println("delete:"+q.dequeue());
    	   System.out.println("\n Q:"+q.entries+"\n D:"+q.D );
    	 
    	   q.enqueue(2);
    	   System.out.println("\n Q:"+q.entries+"\n D:"+q.D );
    	   q.enqueue(4);
    	   System.out.println("delete:"+q.dequeue());
    	   System.out.println("\n Q:"+q.entries+"\n D:"+q.D );
       }
	}


