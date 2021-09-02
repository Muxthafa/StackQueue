package datastructure;

public class MyLinkedList<k> {
	
	public INode<k> head;
	public INode<k> tail;
	
	public MyLinkedList() {
		this.head = null;
		this.tail = null;	
	}
	
	/**
	 * @method adds an element to the linked list
	 * @param newNode contains the new node value
	 * @return nothing
	 */
	public void add(INode<k> newNode) {
		if (this.tail == null) {
			this.tail = newNode;
		}
		if (this.head == null) {
			this.head = newNode;
		} else {
			INode<k> tempNode = this.head;
			this.head = newNode;
			this.head.setNext(tempNode);
		}
	}
	
	/**
	 * @method appends an element to the linked list
	 * @param newNode contains new node value
	 */
	public void append(INode<k> newNode) {
		if (this.head == null) {
			this.head = newNode;
		}
		if (this.tail == null) {
			this.tail = newNode;
		} else {
			this.tail.setNext(newNode);
			this.tail = newNode;
		}
	}

/* popping and printing elements in one function
	public void remove() {
		while(this.head != null) {
		if(this.tail == null) {
			System.out.println("Stack is empty!");
		}
		if(this.head == null) {
			System.out.println("Stack is empty!");
		}
		else {
			
			INode<k> tempNode = this.head.getNext();
			this.head = tempNode;
			System.out.println("Elements in stack after popping: ");
			printNodes();
			System.out.println("Top of the stack: "+peak());
		}}
	}
*/
	/*@method to perform popping of an element from stack
	 * if head or tail points to null then prints stack is empty
	 * else head points to second element in the linked list
	 * @return nothing
	 */
	public void remove() {
		if (this.tail == null) {
			System.out.println("Queue is empty!");
		}
		if (this.head == null) {
			System.out.println("Queue is empty!");
		} else {
			INode<k> tempNode = this.head.getNext();
			this.head = tempNode;
		}
	}
	
	/*@method to call current key value pointed by head 
	 * @return key as Integer object 
	 */
	public Integer peak() {
		return (Integer) this.head.getKey();
	}
	
	// @method to print the nodes of linked list
	public void printNodes() {
		if (this.head == null) {
			System.out.println("Queue is empty!!");
		} else {
			System.out.println("Elements are: " + head);
		}
	}
}
