//���� 20500 Ezreal �������� ���� ����
package baekjoon;

import java.io.*;
import java.util.*;
public class bj20500 {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		long d[][] = new long[4][1516];
		int mod = 1000000007;
		
		// 1�� �ڸ��� 5�� �����ϸ鼭 ���ڸ����÷����鼭 3���� ���� ������ 0,1,2 �� ������ ���
		// d[i][j] = j������ �ڸ��� �̷�����鼭 3���� ���� �������� i�� ��
	
		d[0][1] = 0; d[0][2] = 1; d[1][2] = 1; d[2][3] = 1;
		
		for(int i=3; i<=n; i++) {
			d[0][i] = d[1][i-1] + d[2][i-1];
			d[1][i] = d[0][i-1] + d[2][i-1];
			d[2][i] = d[0][i-1] + d[1][i-1];
			
			d[0][i] %= mod;
			d[1][i] %= mod;
			d[2][i] %= mod;
		}
		
		System.out.println(d[0][n]);
	}

}
