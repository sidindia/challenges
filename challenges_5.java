/*
Given a matrix of m x n elements (m rows, n columns), return all elements of the matrix in spiral order.

Example:

Input:
[
 [ 1, 2, 3 ],
 [ 4, 5, 6 ],
 [ 7, 8, 9 ]
]
Output: [1,2,3,6,9,8,7,4,5]

*/
import java.util.ArrayList;

public class SpiralMatrix {
	static ArrayList<Integer> result;

	public static void main(String[] args) {
		result = new ArrayList<>();
		int matrix[][] = { 
						{ 1, 2, 3, 4 }, 
						{ 6, 7, 8, 9 }, 
						{ 11, 12, 13, 14 }, 
						{ 16, 17, 18, 19 },
						{ 21, 22, 23, 24 } 
					};
		spiral(matrix);
	}

	static void spiral(int[][] matrix) {
		int top,bottom,left,right, direction;
		top=0;
		bottom=matrix.length-1;
		left=0;
		right=matrix[0].length-1;
		direction=0;
		while (top <= bottom && left <= right) {
			switch (direction) {
				case 0: {
					for (int i = left; i <= right; i++) {
						result.add(matrix[top][i]);	
					}
					top++;
					direction = 1;
					break;
				}
				case 1: {
					for (int i = top; i <= bottom; i++) {
						result.add(matrix[i][right]);	
					}
					right--;
					direction = 2;
					break;
					}
				case 2: {
					for (int i = right; i >= left; i--) {
						result.add(matrix[bottom][i]);	
					}
					bottom--;
					direction = 3;
					break;
					}
				case 3: {
					for (int i = bottom; i >= top; i--) {
						result.add(matrix[i][left]);
					}
					left++;
					direction = 0;
					break;
				}
			}
		}
		System.out.println(result.toString());
	}
}
