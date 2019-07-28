/*  
Given an array of unique integers, return the all possible unique pairs of numbers such that they add up to a specific target.
Try to minimize time & space complexity of your solution.

INPUT
array = [2, 7, 11, 15, -2], target = 9,

OUTPUT
"[2,7],[11,-2]"

Avoid duplicate pairs, e.g - "[2, 7], [7, 2]" */
   
   
   private String getPairs(int[] arr, int target) {
        SparseIntArray trace = new SparseIntArray();
        SparseIntArray result = new SparseIntArray();
        int counter = 0;

        while (counter < arr.length) {
            int temp = target - arr[counter];
            if (trace.get(arr[counter])!=temp) {
                trace.put(temp, arr[counter]);
            } else {
                result.put(temp, arr[counter]);
            }
            counter++;
        }
        String tempResult = result.toString().replace(",",";");
        return tempResult.replace("=",",");
    }
