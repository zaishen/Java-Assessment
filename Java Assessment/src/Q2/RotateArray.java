package Q2;

import java.util.Arrays;

public class RotateArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		solution(new int[] {3, 8, 9, 7, 6},5,1);
		solution(new int[] {3, 8, 9, 7, 6},5,3);
		solution(new int[] {3, 8, 9, 7, 6},5,5);
	}
	
	public static int[] solution(int[] A, int N, int K) {

	    int[] rotate = new int [N];
	    for (int i=0; i<N; i++) {
	    	rotate[(i + K) % N] = A[i]; 
	    }
	    System.out.print(Arrays.toString(rotate)+"\n");
	    return rotate;
	} 

}

