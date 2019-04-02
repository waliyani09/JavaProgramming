/** AZIM WALIYANI ************PAGE 1********
 * Imagine a (literal) stack of plates. If the stack gets too high, it might topple. 
 * There­fore, in real life, we would likely start a new stack 
 * when the previous stack exceeds some threshold. 
 * Implement a data structure SetOfStacks that mimics this.
 * SetOf­Stacks should be composed of several stacks, 
 * and should create a new stack once the previous one exceeds capacity.
 * SetOfStacks.push() and SetOfStacks.pop() 
 * should behave identically to a single stack (that is, pop() 
 * should return the same values as it would if there were just a single stack).
 */
package setOfStacks;

public class stack {
	/**
	 * maxSize is the size of the stack that will be created.
	 * top is the element that will be accessed first.
	 * By default, it is set to -1.
	 */
private int maxSize;
int [] stackArray;
int top;
/***********************CONSTRUCTOR*******************
 * 
 * @param s refers to the size of the stack you will create.
 */
public stack(int s) {
	maxSize=s;
	stackArray = new int[maxSize];
	top=-1;
}
/***********DEFAULT CONSTRUCTOR***********************
 * This is a default constructor which will create a stack of size 8.
 */

public stack() {
	this(8);
}
/*************ADD AN ELEMENT TO A STACK***************
 * 
 * @param i Will put the value i into the stack. The stack structure is LIFO(LAST IN FIRST OUT).
 */
public void push(int i) {
	stackArray[++top] = i;
}
/*************WILL POP THE TOP ELEMENT FROM THE STACK*********
 * 
 * @return the first item on the stack
 */
public int pop() {
	return stackArray[top--];
}
/**************WILL CHECK IF THE STACK IS EMPTY************
 * 
 * @return true if it is empty. Else false.
 */
public boolean isEmpty() {
	return (top==-1);
}
/************WILL CHECK IF THE STACK IS FULL**************
 * 
 * @return true if the stack is full. Else false.
 */
public boolean isFull() {
	return (top==stackArray.length-1);
}

}
