import java.util.*;

public class LargestProduct {
    public static void main(String[] args) {
        int array[] = { 2,3,-2,4 };
        System.out.println(largestProduct(array));
    }
    
    private static int largestProduct(int array[]) {
        HashMap<Integer, ArrayList<Integer>> subArray = new HashMap<>();
        ArrayList<Integer> tempList = new ArrayList<Integer>();
        int tempMul = 1;
        int largestProduct = 0;
        if (array.length > 0) {
            tempMul = array[0];
            tempList.add(array[0]);
        } else {
            return 0;
        }
        for (int index = 1; index < array.length; index++) {
            if (array[index] > array[index - 1]) {
                tempList.add(array[index]);
                tempMul = tempMul * array[index];
            } else {
                if (!tempList.isEmpty()) {
                    subArray.put(tempMul, new ArrayList<Integer>(tempList));
                    tempList.clear();
                    if (largestProduct < tempMul) {
                        largestProduct = tempMul;
                    }
                    tempMul = 1;
                }
            }
        }
        if (!tempList.isEmpty()) {
            subArray.put(tempMul, new ArrayList<Integer>(tempList));
            if (largestProduct < tempMul) {
                largestProduct = tempMul;
            }
        }
        ArrayList<Integer> result = new ArrayList<>();
        result = subArray.get(largestProduct);
        if(result!=null)
        {
            return result.contains(0) ? 0 : largestProduct;
        }
        else{
            return 0;
        }

    }
}
