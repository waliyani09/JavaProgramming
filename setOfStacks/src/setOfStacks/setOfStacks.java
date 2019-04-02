/**AZIM WALIYANI************PAGE 2*************
 * On this page, we are creating a function called set of Stacks using ArrayList.
 * 
 */
package setOfStacks;
import java.util.*;
public class setOfStacks {
	//******TO MAKE A NEW STACK AFTER 8 ELEMENTS
	
//Continued from page stack, this will create an ArrayList of the type stacks.
//Our default constructor is taking care of the size of stacks to be 8.
//
ArrayList<stack> setOfStacks = new ArrayList<stack>();
/******************************CONSTRUCTOR******************************
 * A default constructor which is just taking care of creating a new stack dynamically
 * and adding it to the setOfStacks.
 */
public setOfStacks() {
	setOfStacks.add(new stack());
}
/***************GETTING THE LAST STACK IN THE SET OF STACKS*************
 * In this method, we are using the .get() function to point towards
 * the last stack in the ArrayList by using size()-1.
 * @return
 */

public stack getLastStack() {
	if(setOfStacks.size()==0)
		return null;
	return setOfStacks.get(setOfStacks.size()-1);
}
/****************ADDING A NEW ELEMENT INTO THE SET OF STACKS**********
 * 1.Create a stack called last and assign the last stack using getLast() above.
 * 2.IF ELSE statement to see if your last stack has no element or if your last stack is full.
 * 3.If it is the case then create a new stack called snew and push i in it.
 * 4.After that add the stack in set using .add() function.
 * 
 * @param i is the input.
 */
public void push(int i) {
	stack last = getLastStack();
	if(last!=null && !last.isFull())
		last.push(i);
	else {
		stack snew = new stack();
		snew.push(i);
		setOfStacks.add(snew);
}
}
/***********GETTING THE ELEMENT IN LIFO STYLE: POP**********************
 * 1.Create a stack called last and use getLast() function.
 * 2.Create a new integer called output and pop the last element from the stack last.
 * 3.If the last stack gets empty, then remove the stack from the set of stacks. 
 * @return
 */
public int pop() {
	stack  last = getLastStack();
	int output = last.pop();
	if(last.isEmpty())
		setOfStacks.remove(setOfStacks.size()-1);
	return output;
}
/**************CHECK TO SEE IF THE SET IS EMPTY*****************
 * 1.Return true if the last stack is null or is emptied.
 * 2.Null means if the stack is assigned but not initialized.
 * 3.Empty means if the elements are alredy popped out of the stack.
 * @return
 */
public boolean isEmpty() {
	stack last = getLastStack();
	return (last==null || last.isEmpty());
}
}
