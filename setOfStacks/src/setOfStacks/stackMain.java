/**********AZIM WALIYANI***********PAGE 3**********
 * ***********MAIN FUNCTION************************
 */
package setOfStacks;

public class stackMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		setOfStacks set1 = new setOfStacks();
		set1.push(1);
		set1.push(2);
		set1.push(3);
		set1.push(4);
		set1.push(5);
		set1.push(6);
		set1.push(7);
		set1.push(8);
		set1.push(9);
		set1.push(10);
		set1.push(11);
		while(!set1.isEmpty())
			System.out.print(set1.pop()+ " ");
	}

}
