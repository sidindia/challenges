/*

You are given an n x n 2D matrix representing an image.
Rotate the image by 90 degrees (clockwise).

Note:

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

*/


public class Main
{
	public static void main(String[] args) {
		int array[][] = {
		    {1,  2,  3,  4,  5},
			{6,  7,  8,  9,  10},
			{11, 12, 13, 14, 15},
			{16, 17, 18, 19, 20},
			{21, 22, 23, 24, 25}
		    
		};
			rotate90(array);
	}
	
	private static void rotate90(int array[][])
	{
	    for(int i = 0; i<array.length;i++)
	    {
	        for(int j=i; j<array[0].length; j++)
	        {
	           int temp = array[i][j];
	            array[i][j]=array[j][i];
	            array[j][i]=temp;
	        }
	    }
	    
	    for(int i=0; i < array.length; i++)
	    {
	        int j = array[0].length-1;
	        int k = 0;
	        while(k < j)
	        {
	            int temp = array[i][k];
	            array[i][k]=array[i][j];
	            array[i][j]=temp;
	            k++;
	            j--;
	        }
	    }
	    
	    
	    
	    for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				System.out.print(array[i][j] + " "); 
			}
			System.out.println();
		}
	}
}
