import java.util.Scanner;

public class Calc {											//Title:Calc
	Stack<Integer> s1=new Stack<Integer>();					//Author:F�rat DEDE
	public static void main(String[] args) {				
		// TODO Auto-generated method stub					//Assignment:1
															//Section:1
		 Scanner a=new Scanner(System.in);					//Description:This class
		 Calc calc1=new Calc();                             //defines a Calculator
		 while(true) {
			 String sentence=a.next();
			 if(sentence.equalsIgnoreCase("S")) {
				 calc1.show();
			 }
			 else if(sentence.equalsIgnoreCase("P")) {
				System.out.println(calc1.showpopvalue());
			 }
			 else if(sentence.equalsIgnoreCase("E")) {
				 break;
			 }
			 else if(sentence.equalsIgnoreCase("*")){
				 calc1.multiply();
				 
			 }
			 else if(sentence.equalsIgnoreCase("+")) {
				 calc1.sum();
			 }
			 else if(sentence.equalsIgnoreCase("-")) {
				 calc1.subtraction();
			 }
			 else if(sentence.equalsIgnoreCase("/")) {
				 calc1.divide();
			 }
			 else if(sentence.equalsIgnoreCase("%")) {
				 calc1.remaind();
			 }
			 else {
				 try {
				 int number = Integer.parseInt(sentence);
				 calc1.addStack(number);
				 }
				 catch(Exception e) {
					 System.out.println("Error");
				 }
			 }
			 
			 
		 }
	}
	
	
	void addStack(int a) 
	/* Summary: 
	 Adds a new integer to the stack which is in calculator
	 Precondition: variable a is an integer
	 Postcondition:A new integer is added to stack with push method*/
	{
		s1.push(a);
	}
	void show() 
	/* Summary: 
	 Shows current state of the stack
	 Precondition: No parameter
	 Postcondition:Current state of stack is shown in output */
	{
		String answer="[";
		for(int i=0; i<s1.size; ++i) {
			if(i>0) answer+=", ";
			answer+=s1.get(i);	
		}
		answer+="]";
		System.out.println(answer);
		
	}
	void sum() 
	/* Summary: 
	 Makes a summation operation of the two integers in the stack according to post-fix notation
	 Precondition: No parameter
	 Postcondition:Sum of these two integers are added to the stack.And these two integers are popped*/
	{
		if(s1.size<2) {System.out.println("Error");
		return;
		}
		int first=s1.pop();
		int second=s1.pop();
		int result=first+second;
		s1.push(result);
	}
	void multiply() 
	/* Summary: 
	 Makes a multiplication operation of the two integers in the stack according to post-fix notation
	 Precondition: No parameter
	 Postcondition: Multiplication of these two integers are added to the stack.And these two integers are popped*/
	{
		if(s1.size<2) {System.out.println("Error");
		return;
		}
		int first=s1.pop();
		int second=s1.pop();
		int result=first*second;
		s1.push(result);
	}
	void subtraction()    
	/* Summary: 
	 Makes a subtraction operation of the two integers in the stack according to post-fix notation
	 Precondition: No parameter
	 Postcondition: Subtraction of these two integers are added to the stack.And these two integers are popped*/
	{
		if(s1.size<2) {System.out.println("Error");
		return;
		}
		int first=s1.pop();
		int second=s1.pop();
		int result=second-first;
		s1.push(result);
	}
	void divide() 
	/* Summary: 
	 Makes a division operation of the two integers in the stack according to post-fix notation
	 Precondition: No parameter
	 Postcondition: Division of these two integers are added to the stack.And these two integers are popped*/
	{
		if(s1.size<2) {System.out.println("Error");
		return;
		}
		int first=s1.pop();
		int second=s1.pop();
		int result=second/first;
		s1.push(result);
	}
	void remaind() 
	/* Summary: 
	 Makes a % operation of the two integers in the stack according to post-fix notation
	 Precondition: No parameter
	 Postcondition: % operation of these two integers are added to the stack.And these two integers are popped*/
	{
		if(s1.size<2) {System.out.println("Error");
		return;
		}
		int first=s1.pop();
		int second=s1.pop();
		int result=second%first;
		s1.push(result);
	}
	int showpopvalue() 
	/* Summary: 
	 Removes the value which is on the top of the stack in calculator.
	 Also it prints the value to the output.
	 Precondition: No parameter
	 Postcondition: Returns the integer value which is popped*/
	{
		if(s1.size==0) {
			System.out.println("Error");
			return -1;
		}
		int result=s1.pop();
		System.out.println(result);
		return result;
	}
	
}
