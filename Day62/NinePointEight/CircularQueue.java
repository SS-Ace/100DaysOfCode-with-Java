package NinePointEight;

import java.util.*;

public class CircularQueue {

private int head, tail, queueElem;
private int Scale_Factor;
private Integer[] entries;

public CircularQueue(int capacity) {
	this.entries = new Integer[capacity];
	this.head = 0;
	this.tail = 0;
	this.queueElem = 0;
	this.Scale_Factor = 2;
}

public void enqueue(Integer x) {
	if(queueElem == entries.length) {
		Collections.rotate(Arrays.asList(entries),  -head);
		
		head = 0;
		tail = queueElem;
		entries = Arrays.copyOf(entries, queueElem * Scale_Factor);
		
	}
	
	entries[tail] = x;
	tail = (tail + 1) % entries.length;
	++queueElem;
}

public Integer dequeue() {
	
	if(queueElem != 0) {
		--queueElem;
		Integer ret = entries[head];
		head = (head + 1) % entries.length;
		return ret;
	}
	
	throw new NoSuchElementException("Dequeue called on an empty queue");
	
}

public int size() {
	return queueElem;
}

public String getEntries() {
	
	return Arrays.toString(this.entries);
}


	public static void main(String[] args) {
	CircularQueue c = new CircularQueue(4);
	c.enqueue(1);
	c.enqueue(2);
	c.enqueue(2);
	c.enqueue(2);
	
	System.out.println(c.size());
	System.out.println(c.dequeue());
	System.out.println(c.getEntries());
	c.enqueue(5);
	System.out.println(c.size());
	System.out.println(c.getEntries());

		
	}

}
