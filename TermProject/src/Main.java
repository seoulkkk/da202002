import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ �迭�� ũ�⸦ �Է��ϼ���");
		int N = scan.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0;i<N;i++) {

			array[i] = (int) (Math.random() * N + 1);			

		}
		System.out.println(Arrays.toString(array));
		
		System.out.print("����a:");
		int a = scan.nextInt();
		System.out.print("����b:");
		int b = scan.nextInt();
		scan.close();
		
		int max = array[a];
		int min = array[a];
				
		for(int i=a-1;i<b-1;i++) {
		    if(max<array[i]) {
		    	max = array[i];
		    }
					
		    if(min>array[i]) {
		    	min = array[i];
		    }
		}
				
		System.out.println("�ִ밪 : "+max);
		System.out.println("�ּҰ� : "+min);
		
		
		int sum = 0;
		for(int i = a-1; i <b; i++) {
			sum += array[i];
		}
		System.out.println("�հ�:" + sum);
	}

}