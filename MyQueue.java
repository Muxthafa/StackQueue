package datastructure;

public class MyQueue {
	private final MyLinkedList<Integer> myLinkedList;

	/*
	 * @constructor where MyLinkedList class object is created non parameterized
	 */
	public MyQueue()
	{
		myLinkedList=new MyLinkedList<Integer>();
	}

	/**
	 * @method to append an element into the stack
	 * @param value added to the queue
	 */
	public void enqueue(INode<Integer> value) {
		myLinkedList.append(value);
	}
	
	// @method to print elements of the queue
	public void printQueue() {
		myLinkedList.printNodes();
	}
}
