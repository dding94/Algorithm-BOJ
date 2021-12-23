//���� 6603 �ζ�
package codingTest2_1;

import java.io.*;
import java.util.*;

public class BruteForce1 {
	static StringBuilder sb = new StringBuilder();
	static ArrayList<Integer> lotto = new ArrayList<>();
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int n = Integer.parseInt(st.nextToken());
			if(n == 0) break;
			
			int a[] = new int[n];
			for(int i=0; i<n; i++) {
				a[i] = Integer.parseInt(st.nextToken());
			}
			
			go(a,0,0);
			sb.append('\n');
		}
		System.out.println(sb);
	}
	static void go(int a[], int index, int cnt) {	
		//������ ã�� ���
		if(cnt == 6) {
			for(int ans : lotto) {
				sb.append(ans + " ");
			}
			sb.append('\n');
			return;
		}
		//�Ұ����� ���
		if(index == a.length) return;
		//���� ��� ȣ��
		lotto.add(a[index]); //���� �Ѱ�� �߰�
		go(a,index+1,cnt+1);
		lotto.remove(lotto.size()-1); //�� ���������� ���õȰ� ����
		go(a,index+1,cnt);	
		
	}

}
