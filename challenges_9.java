 /* 
 An array is monotonic if it is either monotone increasing or monotone decreasing.

An array A is monotone increasing if for all i <= j, A[i] <= A[j].  An array A is monotone decreasing if for all i <= j, A[i] >= A[j].

Return true if and only if the given array A is monotonic.

 

Example 1:

Input: [1,2,2,3]
Output: true

Example 2:

Input: [6,5,4,4]
Output: true


Note:

    1 <= A.length <= 50000
    -100000 <= A[i] <= 100000


 */
 
 class MonotonicArray{
    public static void main(String[] args)
    {
        int array[] = { 1,2,2,3 };
        System.out.print(isMonotonic(array));
    }
    public static boolean isMonotonic(int[] array) {
        int isIncreasing = 2;
        for(int i=1; i < array.length; i++)
        {
            if(array[i-1] < array[i])
            {
                if(isIncreasing == 1 || isIncreasing == 2 )
                {
                     isIncreasing = 1;
                }
                else
                {
                    return false;
                }
            }
            else if( array[i-1] > array[i] )
            {
                if(isIncreasing == 0 || isIncreasing == 2)
                {
                    isIncreasing = 0;
                }
                else
                {
                    return false;
                }
            }
        }
        
        return true;
    }
}
