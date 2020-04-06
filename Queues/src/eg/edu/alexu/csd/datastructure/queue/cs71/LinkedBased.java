package eg.edu.alexu.csd.datastructure.queue.cs71;

import Lists.DLinkedList;

public class LinkedBased implements IQueue,ILinkedBased {

	
	DLinkedList Queue=new DLinkedList();
	
	
	public void enqueue(Object item) {
		Queue.add(item);
	}
	
	
	public Object dequeue() {
		if(Queue.isEmpty()) {
			throw new RuntimeException();
		}
		Object ret=Queue.get(1);
		Queue.remove(1);
		return ret;
		
	}
	
	public boolean isEmpty() {
		if(Queue.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	public int size() {
		return Queue.size();
	}
}
