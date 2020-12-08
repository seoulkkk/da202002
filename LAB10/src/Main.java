import java.util.Scanner;
public class Main {
	// ���� ū ���簢���� ���̸� ��ȯ�մϴ�.
	//  n : ������ ��
	// v: n���� ���õ��� ����
	// ��ȣ
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
	
	// ���� ū ���簢���� ���̸� ��ȯ�մϴ�.
	// n: ������ ��
	// v: n���� ���õ��� ����
	// ��ȯ: ���簢���� ����
	static int histo(int[] v, int n) {
		return histo(v, 0, n-1);
	}

	public static void main(String[] args) {
		// ��ĳ�� ������Ʈ ����
		Scanner scan = new Scanner(System.in);
		// ������ �� �Է�
		int n = scan.nextInt();
		//������ ������ �迭 ����
		int[] v = new int[n];
		// n���� ������ �Է¹޾� �迭 v�� ����
		for(int i = 0; i<n; i++) {
			v[i] = scan.nextInt();
		}
		// ���� ū ���簢���� ���� ���
		int r = histo(v, n);
		// ���
		System.out.println(r);
	}

}
