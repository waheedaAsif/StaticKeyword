package StaticKeyWord;

public class CounterDemo {

	static int count = 0; // initiating the variable just one time when we are using static keyword with it
	
	void CounterDemo(){
		count++;
		System.out.println(count);
	
	}
	

public static void main (String[]args) {
	
 CounterDemo cd = new CounterDemo();
 cd.CounterDemo();
}
}