package NinePointNine;
import java.util.*;
public class Queue {
	
	private Deque<Integer> enq = new LinkedList<>();
	private Deque<Integer> deq = new LinkedList<>();
	
	public void enqueue(Integer x) {
		this.enq.addFirst(x);
	}
	
	public Integer dequeue() {
		if(deq.isEmpty()) {
			
			while(!enq.isEmpty()) {
				deq.addFirst(enq.removeFirst());
			}
		}
		
		if(!deq.isEmpty()) {
			return deq.removeFirst();
		}
		throw new NoSuchElementException("Cannot pop empty queue");	
	}
	
	public Deque<Integer> enqdisplay() {
		return this.enq;
	}
	
	public Deque<Integer> deqdisplay() {
		return this.deq;
	}
	
	public static void main(String[] args) {
		Queue q = new Queue();
		
		q.enqueue(1);
		q.enqueue(2);
		q.enqueue(2);
		q.enqueue(3);
		
		System.out.println(q.enqdisplay());
		
		q.dequeue();
		System.out.println();
		System.out.println(q.deqdisplay());
		
		q.enqueue(5);
		System.out.println(q.enqdisplay());
		
		

	}

}
