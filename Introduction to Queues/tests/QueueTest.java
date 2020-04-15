package tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import classes.ArrayBased;
import classes.LinkedBased;

class QueueTest {

	@Test
	void test() {
		ArrayBased test = new ArrayBased(2);
		assertEquals(test.isEmpty(), true);
		assertEquals(test.size(), 0);
		assertThrows(NullPointerException.class,()->test.dequeue());
		test.enqueue(7);
		test.enqueue(6);
		assertThrows(RuntimeException.class,()->test.enqueue(9));
		assertEquals(test.dequeue(), 7);
		assertEquals(test.isEmpty(), false);
		assertEquals(test.size(), 1);
		assertThrows(NullPointerException.class,()->test.enqueue(null));
		test.enqueue(9);
		assertEquals(test.dequeue(), 6);
		assertEquals(test.dequeue(), 9);
		assertThrows(NullPointerException.class,()->test.dequeue());
	}
	
	@Test
	void test2() {
		LinkedBased test = new LinkedBased();
		assertEquals(test.isEmpty(), true);
		assertEquals(test.size(), 0);
		assertThrows(RuntimeException.class,()->test.dequeue());
		test.enqueue(7);
		test.enqueue(6);
		assertEquals(test.dequeue(), 7);
		assertEquals(test.isEmpty(), false);
		assertEquals(test.size(), 1);
		assertThrows(NullPointerException.class,()->test.enqueue(null));
		test.enqueue(9);
		assertEquals(test.dequeue(), 6);
		assertEquals(test.dequeue(), 9);
		assertThrows(RuntimeException.class,()->test.dequeue());
	}

}
