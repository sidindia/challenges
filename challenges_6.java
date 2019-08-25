/*
 Given an unsorted array of integers, find the length of longest continuous increasing subsequence (subarray).

Note: Length of the array will not exceed 10,000.

Example 1:

Input: [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5], its length is 3. 
Even though [1,3,5,7] is also an increasing subsequence, it's not a continuous one where 5 and 7 are separated by 4. 
*/

import java.util.ArrayList;
import java.util.*;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        int array[] = { 1,2,3,4};

        System.out.println(getLength(array));
    }


    private static int getLength(int array[]) {
        ArrayList<Integer> lengthList = new ArrayList<>();
        int lengthCounter = 1;
        for (int count = 1; count < array.length; count++) {
            if (array[count-1] < array[count]) {
                lengthCounter++;
                if(count==array.length-1)
                {
                    lengthList.add(lengthCounter);
                }
            } else {
                lengthList.add(lengthCounter);
                lengthCounter = 1;
            }
        }
        if(array.length > 0 && lengthList.size() <= 0)
        {
            return 1;
        }
        else if(lengthList.size() > 0)
        {
          return  Collections.max(lengthList);
        }
        else{
            return 0;
        }
    }
}
