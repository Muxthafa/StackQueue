package datastructure;

public class MyQueueTest {
	public static void main(String[] args) {
	//Node object creation with values
			MyNode<Integer> myFirstNode = new MyNode<>(56);
			MyNode<Integer> mySecondNode = new MyNode<>(30);
			MyNode<Integer> myThirdNode = new MyNode<>(70);
			
			MyQueue myQueue=new MyQueue();		//creates an object of class MyStack
			
			//push method call by passing node object
			myQueue.enqueue(myFirstNode);
			myQueue.enqueue(mySecondNode);
			myQueue.enqueue(myThirdNode);
			myQueue.printQueue();
	}
}
