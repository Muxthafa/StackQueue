package datastructure;

public class MyStack {
	
	private final MyLinkedList<Integer> myLinkedList;
	
	/*@constructor where MyLinkedList class object is created
	 * non parameterized
	 */
	public MyStack()
	{
		myLinkedList=new MyLinkedList<Integer>();
	}
	
	/**
	 * @method to add an element into the stack
	 * @param value added to the stack
	 */
	public void push(INode<Integer> value)
	{
		myLinkedList.add(value);
	}
	
	//@method to print elements of the stack
	public void printStack()
	{
		myLinkedList.printNodes();
	}
}
