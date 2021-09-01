package datastructure;

public class MyStackTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Node object creation with values
		MyNode<Integer> myFirstNode = new MyNode<>(70);
		MyNode<Integer> mySecondNode = new MyNode<>(30);
		MyNode<Integer> myThirdNode = new MyNode<>(56);
		
		MyStack myStack=new MyStack();		//creates an object of class MyStack
		
		//push method call by passing node object
		myStack.push(myFirstNode);
		myStack.push(mySecondNode);
		myStack.push(myThirdNode);
		
		myStack.printStack();				//function call to print the elements in the stack
	}

}
