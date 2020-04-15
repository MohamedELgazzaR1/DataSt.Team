package tests;

import classes.LinkedBased;

public class Test {

	public static void main(String[] args) {
		LinkedBased Que=new LinkedBased();
		
		Que.enqueue(1545);
		Que.enqueue(667);
		System.out.println(Que.dequeue());
		System.out.println(Que.dequeue());
		System.out.println(Que.dequeue());
	}

}
