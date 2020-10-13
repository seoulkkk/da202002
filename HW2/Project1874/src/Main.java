import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	      int n = scan.nextInt();
	      
	      scan.close();
	      
	      Stack stack = new Stack();
	      int[] Array = new int[n];
	      for(int i=0;i<n;i++) Array[i]=scan.nextInt();
	      
	      ArrayList AL = new ArrayList();
	      int index=0;
	      for(int i=1;i<=n;i++) {
	         stack.push(i);
	         AL.add('+');
	         while(!stack.isEmpty() && Array[index]==(int)stack.peek()) {
	            index++;
	            stack.pop();
	            AL.add('-');
	         }
	      }
	      if(!stack.isEmpty()) System.out.println("NO");
	      else for(int i=0;i<AL.size();i++) System.out.println(AL.get(i));

	   }

	}