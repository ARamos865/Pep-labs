import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    /**
     * Determine if an array of items contains any duplicate values. You should use a Set for this: remember that
     * Sets can not have duplicate values, but you may check if a value is already contained using the .contains method.
     * @param nums an array of ints.
     * @return true if nums contains any duplicate values, false if it does not.
     */
    public boolean containsDuplicate(int[] nums){
        Set<Integer> n = new HashSet<Integer>();
        for (int i : nums)
        {
          if (n.contains(i)) 
          return true;
          n.add(i);
        }
        return false;
    }
}
