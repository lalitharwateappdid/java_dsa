import java.util.*;

public class Main {
    public static void main(String [] args) {
      // contains duplicate
      
      // Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.
      
      // You should aim for a solution with O(n) time and O(n) space, where n is the size of the input array.
      int nums[] = {1,2,3,4};
      
      HashMap<Integer,Integer>duplicateNums = new HashMap<Integer,Integer>();
      
      for(int num : nums){
          if(duplicateNums.containsKey(num)){
              System.out.println("true");
              return;
          }
          
          duplicateNums.put(num,1);
      }
          System.out.println("false");
          return;
      
  }
}