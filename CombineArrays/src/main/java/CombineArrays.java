
public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        int length = arr1.length + arr2.length;
        int [] mergedArray = new int[length];
        int pos = 0;
        for(int element : arr1) {
            mergedArray[pos] = element;
            pos++;
        }
        for(int element : arr2) {
            mergedArray[pos] = element;
            pos++;
        }
       
        return mergedArray;
    }
}
