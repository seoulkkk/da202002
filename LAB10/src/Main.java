import java.util.Scanner;
public class Main {
	// 가장 큰 직사각형의 넓이를 반환합니다.
	//  n : 샘플의 수
	// v: n개의 샘플들의 도수
	// 번호
	static int histo(int[] v, int a, int b) {
		if(a == b) return v[a];
		
		int c = (a+b)/2;
		
		int max;
		
		max = Math.max(histo(v,a,c), histo(v,c+1,b));
		
		int h = v[c], left=c, right=c, w=1;
		
		while(left > a || right < b) 
		{
			int hleft,hright;
			if(left>a) hleft = Math.min(h, v[left-1]); 
			else hleft = -1;
			if(right<b) hright = Math.min(h, v[right+1]);
			else hright = -1;
			if(hleft>hright)
			{
				h = hleft; 
				left--;
			}
			else 
			{
				h = hright; 
				right++;
			}
			max = Math.max(max, ++w * h);
			}	
		
		return max;
	}
	
	// 가장 큰 직사각형의 넓이를 반환합니다.
	// n: 샘플의 수
	// v: n개의 샘플들의 도수
	// 반환: 직사각형의 넓이
	static int histo(int[] v, int n) {
		return histo(v, 0, n-1);
	}

	public static void main(String[] args) {
		// 스캐너 오브젝트 생성
		Scanner scan = new Scanner(System.in);
		// 샘플의 수 입력
		int n = scan.nextInt();
		//도수를 저장할 배열 생성
		int[] v = new int[n];
		// n개의 도수를 입력받아 배열 v에 저장
		for(int i = 0; i<n; i++) {
			v[i] = scan.nextInt();
		}
		// 가장 큰 직사각형의 넓이 계산
		int r = histo(v, n);
		// 출력
		System.out.println(r);
	}

}
