import java.util.Queue;
import java.util.Random;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Queue<Integer> que = new LinkedList<>();
		Stack<Integer> st = new Stack<Integer>(); 
		
		Scanner scan= new Scanner(System.in);
		int N= scan.nextInt();
		
		Random rand = new Random();
		que.add(rand.nextInt(100));
		
		que.peek();
	
		scan.close();

	}

}
