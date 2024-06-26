
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
        int highestNum = nums.get(0);
        int lowestNum = nums.get(0);
        for(int num: nums){
            if (num > highestNum) highestNum = num;
            if (num < lowestNum) lowestNum = num;
        }
        return highestNum - lowestNum;
    }
}
