

public class Stack<T> {						
	Node head=null;							
	int size=0;								
  private class Node{						
	  Node next;							
	  T value;								
	Node(T value){							
		next=null;
		this.value=value;
	}
	public Node getNext() 
	/* Summary: 
	 Gets next Node object's address
	 Precondition:No parameter it has
	 Postcondition:Returns next node object's address*/
	{
		return next;
	}
	public void setNext(Node next) 
	/* Summary: 
	 Assigns a node object address to the next reference
	 variable .
	 Precondition: variable next is a reference variable it has a node object's address
	 Postcondition:The value of next variable is set */
	{
		this.next = next;
	}
	public T getValue() 
	/* Summary: 
	 Gets the value of value variable
	 Precondition:No parameter 
	 Postcondition:Returns value of value variable */
	{
		return value;
	}
	public void setValue(T value) 
	/* Summary: 
	 Assigns a new value to value variable
	 Precondition: variable value's type is T (there is generic)
	 Postcondition:The value of value variable is set */
	{
		this.value = value;
	}  
	  
  }
  void push(T a) 
	/* Summary: 
	 Adds a new node which has a value inside it to stack
	 Precondition: variable a's type is T
	 Postcondition:New node which has a specified value is added to stack */
  {
	  if(size==0) {Node temp=new Node(a);
	  head=temp;
	  }
	  else {Node temp=new Node(a);
	  temp.setNext(head);
	  head=temp;
		  
	  }
	  ++size;
	  
  }
  T pop() 
	/* Summary: 
	 Removes the node which is on top of the stack .
	 Precondition: No parameter
	 Postcondition:Returns the value which is popped */
  { 
	  if(size==0) return null;
	  Node temp=head;
	  T answer=temp.getValue();
  		head=head.getNext();
      temp.next=null;
	 --size;
	  return answer;
	  
  }
  T get(int a) 
	/* Summary: 
	 Gets the value according to a variable,For example, if a is 0 it gets first
	 element of the stack
	 Precondition: variable a is an integer
	 Postcondition:Returns the value according to a variable */
  {
	  Node temp=head;
	  for(int i=0; i<a; ++i) {
		  temp=temp.getNext();
	  }
	  return temp.value;
  }

}
