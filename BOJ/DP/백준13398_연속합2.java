//���� 13398 ������2
package codingTest1_2;

import java.io.*;
import java.util.*;

public class dp_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		int d[] = new int[n]; // i��°���� ������ �ִ� ������
		int d2[] = new int[n]; // i��°���� �����ϴ� �ִ� ������
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
		}
		
		d[0] = a[0];
		for(int i=1; i<n; i++) {
			d[i] = d[i-1] + a[i];
			if(d[i-1] + a[i] < a[i]) {
				d[i] = a[i];
			}
		}
		
		d2[n-1] = a[n-1];
		for(int i=n-2; i>=0; i--) {
			d2[i] = d2[i+1] + a[i];
			if(d2[i+1] + a[i] < a[i]) {
				d2[i] = a[i];
			}
		}
		int ans = d[0]; // ans = -1001 ���ص���.
		
		
		//�� �������� ���� ���
		for(int i=0; i<n; i++) {
			if(ans < d[i]) {
				ans = d[i];
			}
		}
		//�� ������ ���
		for(int i=1; i<n-1; i++) {
			if(ans < d[i-1] + d2[i+1]) {
				ans = d[i-1] + d2[i+1];
			}
		}
		
		System.out.println(ans);
	}

}
