
import java.util.ArrayList;
import java.util.List;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
    
        Integer min = Integer.MAX_VALUE;
        Integer max = Integer.MIN_VALUE;
        
        for (Integer i : nums ) {
            if (min > i) {
                min = i;
            }
        }

        for (Integer d : nums) {
            if (max < d) {
                max = d;
            }
      
        }
     
       int difference = max - min;

        return difference;
    }
        
    }

