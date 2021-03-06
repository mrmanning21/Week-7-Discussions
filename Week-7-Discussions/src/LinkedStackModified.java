// This class encapsulates an int value as a linked node
class LinkedNode {
	int x;            // The data value
	LinkedNode next;  // Reference to the next LinkedNode
	
	// Constructor that initializes the data value
	LinkedNode(int x) {
		this.x = x;
	}
	
}

// This class implements a Stack ADT as a linked list
public class LinkedStackModified {
	LinkedNode front;  // Reference to the first LinkedNode in the list
	int count;         // Number of nodes in the list
	
	// Constructor - initializes the front and count variables
	LinkedStackModified() {
		front = null;
		count = 0;
	}
	
	// Implements the push operation
	void push(int x) {
		LinkedNode newNode = new LinkedNode(x);
    	newNode.next = front;
    	front = newNode;
    	count++;
	}
	
	// Implements the pop operation
	int pop() {
		int x = front.x;
		front = front.next;
		count--;
		return x;
	}
	
	// Implements the peek operation
	int peek() {
		return front.x;
	}
	
	// Implements the isEmpty operation
	boolean isEmpty() {
		return front==null;
	}
	
	// Implements the size operation
	int size() {
		return count;		
	}
	
void removeBottomHalf() {
		int takeHalf = count/2;
		
		for (int y = 0; y < takeHalf; y++) {
			
			System.out.println ("Bottom half of the elements that are removed: "+pop());
		}
		
		System.out.println ("Now here's what remains: ");
		System.out.println (this);
}
	
	// This method returns a String containing
	// a space separated representation of the underlying linked list
	
	// This method returns a String containing
	// a space separated representation of the underlying linked list
	public String toString() {
		String str = "";
		
		LinkedNode cur = front;
		while (cur!=null) {
			str += cur.x + " ";
			cur = cur.next;
		}
		
		return str;
	}
	
}
