import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("생성할 배열의 크기를 입력하세요");
		int N = scan.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0;i<N;i++) {

			array[i] = (int) (Math.random() * N + 1);			

		}
		System.out.println(Arrays.toString(array));
		
		System.out.print("구간a:");
		int a = scan.nextInt();
		System.out.print("구간b:");
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
				
		System.out.println("최대값 : "+max);
		System.out.println("최소값 : "+min);
		
		
		int sum = 0;
		for(int i = a-1; i <b; i++) {
			sum += array[i];
		}
		System.out.println("합계:" + sum);
	}

}