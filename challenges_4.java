/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

    Open brackets must be closed by the same type of brackets.
    Open brackets must be closed in the correct order.

Note that an empty string is also considered valid.

*/
import java.io.*; 
import java.util.*; 

public class BalancedParenthesis
{
    
	public static void main(String[] args) {
		System.out.println(balancedParenthesis(""));
	}
	
		public static boolean balancedParenthesis(String myString)
	{
	    Stack<Character> myStack = new Stack<Character>();
	    HashMap<Character,Character> myMap = new HashMap<Character,Character>();
	    myMap.put(')','(');
	    myMap.put('}','{');
	    myMap.put(']','[');
	    
	    
	    for(int index=0; index < myString.length(); index++)
	    {
	        char element = myString.charAt(index);
	        
	        if(element =='(' || element =='{' ||element =='[')
	        {
	            myStack.push(element);
	        }
	        else if(element == ')' || element == '}' || element == ']')
	        {
	            if(myStack.empty())
	            {
	                return false;
	            }
	            
	          if(!myStack.peek().equals(myMap.get(element)))
	          {
	              return false;
	          }
	          else
	          {
	            myStack.pop();
	          }
	        }
	    }
	    if(!myStack.empty())
	    {
	        return false;
	    }
	    return true;
	}
}
