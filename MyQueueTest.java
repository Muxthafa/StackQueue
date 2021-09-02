package datastructure;

public class MyQueueTest {
	public static void main(String[] args) {
			//Node object creation with values
			MyNode<Integer> myFirstNode = new MyNode<>(56);
			MyNode<Integer> mySecondNode = new MyNode<>(30);
			MyNode<Integer> myThirdNode = new MyNode<>(70);
			
			MyQueue myQueue=new MyQueue();		//creates an object of class MyQueue
			
			//enqueue method call by passing node object
			myQueue.enqueue(myFirstNode);
			myQueue.enqueue(mySecondNode);
			myQueue.enqueue(myThirdNode);
			
			System.out.println("Elements in queue before dequeueing: ");
			myQueue.printQueue();		//function call to print elements in queue
			
			System.out.println("Front of queue: "+myQueue.printPeak());
			
			myQueue.dequeue();			//function call to dequeue an element
			myQueue.printQueue();
			System.out.println("Front of the queue after dequeue: "+myQueue.printPeak());
			myQueue.dequeue();
			myQueue.printQueue();
			System.out.println("Front of the queue after dequeue: "+myQueue.printPeak());
			myQueue.dequeue();
			myQueue.printQueue();
	}
}
