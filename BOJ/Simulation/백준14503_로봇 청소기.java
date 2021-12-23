//���� 14503 �κ� û�ұ�
package codingTest1_4;

import java.io.*;
import java.util.*;

public class simulation6 {
	
					       //�� �� �� ��
	static final int dx[] = {-1, 0, 1, 0};
	static final int dy[] = {0, 1 , 0 ,-1}; 
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int map[][] = new int[n][m];
		
		st = new StringTokenizer(br.readLine());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		int d = Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		//-1 û���� 0 û�Ҿ��� 1 ��
		while(true) {
			if(map[x][y] == 0) map[x][y] =-1;
			
			//�׹��� û�Ұ� �Ǿ��ְų� ���ΰ��
			if(map[x+1][y] !=0 && map[x-1][y] !=0 && map[x][y+1] !=0 && map[x][y-1] !=0) {
				if(map[x-dx[d]][y-dy[d]] == 1) { //���� �� ���� ��
					break;					
				}else {
					x -= dx[d];
					y -= dy[d];
				}
			}else {
				//���� ���� ȸ��
				d = (d+3) % 4;
				
				if(map[x+dx[d]][y+dy[d]] == 0) {
					x += dx[d];
					y += dy[d];
				}
			}
			
		}
			
		int ans =0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(map[i][j] == -1) ans++;
			}
		}
		System.out.println(ans);
	}
}
