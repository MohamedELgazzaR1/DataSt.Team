package classes;


public class Stack {

	private class SLNode {

		private Object element;
		private SLNode next;
		
		public void setElement(Object newElement) {
			element = newElement;
		}
		public void setNext(SLNode newNext) {
			next = newNext;
		}
		public Object getElement() {
			return element;
		}
		public SLNode getNext() {
			return next;
		}
	}
	
	private SLNode top;
	private int size;
	
	public Stack() {
		top = null;
		size = 0;
	}
	
	
	public Object pop() {
		
		if(isEmpty() == true) {
			throw new NullPointerException("Stack is empty");
		}
		
		Object temp = top.getElement();
		top = top.getNext();
		size--;
		
		return temp;
	}

	
	public Object peek() {
		
		if(isEmpty() == true) {
			throw new NullPointerException("Stack is empty");
		}
		
		Object temp = top.getElement();
		
		return temp;
	}

	
	public void push(Object element) {

		SLNode newTop = new SLNode();
		newTop.setElement(element);
		newTop.setNext(top);
		top = newTop;
		size++;
		
	}

	
	public boolean isEmpty() {

		return (top==null);
	}

	
	public int size() {
		
		return size;
	}

}
