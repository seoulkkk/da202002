import java.util.Scanner;
import java.util.Arrays;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		//time@@@@@@@@@@
		long t = System.currentTimeMillis();
		
		//배열크기@@@@@@@@@@nNNNNNNNNNN
		System.out.print("생성할 배열의 크기를 입력하세요");
		int N = scan.nextInt();
		
		int[] array = new int[N];
		
		for(int i = 0;i<N;i++) {

			array[i] = (int) (Math.random() * N + 1);			

		}
		System.out.println(Arrays.toString(array));
		
		//K입력받기@@@@@@@@@
		System.out.print("범위 갯수 입력:");
		int K = scan.nextInt();
		scan.close();
		int j;
		
		for(j=1; j<=K; j++) {
		//구간@@@@@@@@@@@@

			int a = (int)(Math.random()*N)+1;

			int b = (int)(Math.random()*N)+1;
			int c = 0;
			
			//작은값큰값변경
			if(a>b) {
				c = a;
				a = b;
				b = c;
			}
			
			System.out.println("구간"+a+"부터"+b+"까지");
			
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
		System.out.println("Elapsed time is "+(System.currentTimeMillis()-t+" ms"));
	}

}