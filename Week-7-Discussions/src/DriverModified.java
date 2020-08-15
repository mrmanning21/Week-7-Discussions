public class DriverModified {
	
	public static void main(String args []) {
		
		//Instance creation.
		ArrayStack firstOb = new ArrayStack ();
		System.out.println ("Push 1,7,3,4,9,2 on stacks.");
			firstOb.push (1);
			firstOb.push (7);
			firstOb.push (3);
			firstOb.push (4);
			firstOb.push (9);
			firstOb.push (2);
			
		System.out.println ("Array Stack is now "+firstOb.size()+" after pushing.");

		//Popping the stacks.
		firstOb.pop (); firstOb.pop (); firstOb.pop (); firstOb.pop (); firstOb.pop (); firstOb.pop ();
		
		System.out.println ("Array Stack is now "+firstOb.size()+" after popping.");
  
		//LinkedStack creation.
		LinkedStackModified secondOb = new LinkedStackModified ();
		System.out.println ("Push 1,7,3,4,9,2 again.");
		secondOb.push (1);
		secondOb.push (7);
		secondOb.push (3);
		secondOb.push (4);
		secondOb.push (9);
		secondOb.push (2);

		System.out.println ("Array Stack is now "+secondOb.size()+" after pushing again.");
		System.out.println (secondOb);

		System.out.println ("Implementing removal of the last half.");
		secondOb.removeBottomHalf ();
		
		System.out.println ("Array Stack is now "+secondOb.size()+" after popping again.");
		System.out.println (secondOb);
}
}