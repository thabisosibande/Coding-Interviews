public class TwoSum{






    // Sorted Array: Brute Force: using BinarySearch Tree
    public int[] twoSum(int[] numbers, int target) {

       for (int i=0; i<numbers.length; i++) // T(N) = O(N)
       {
           int temp = target - numbers[i];
           int index = Arrays.binarySearch(numbers,temp);

           if (index>=0 && i!=index) // T(N) = O(logN)
           {
               if (i<index) return new int[]{i+1,index+1};
               else return new int[]{index+1,i+1};
           }
       }

       return new int[]{-1,-1};
   }

   // Sorted Array: Two Pointers Solution
   public int[] twoSum(int[] numbers, int target) {

        int beginPointer = 0;
        int endPointer = numbers.length-1;

        for (int i=0; i<numbers.length; i++) // Tn = O(N)
        {
            int result = numbers[endPointer] + numbers[beginPointer];

            if (result == target){
                return new int[]{beginPointer+1,endPointer+1};

            }else if (result>target){
                endPointer--;

            }else if (result<target){
                beginPointer++;
            }
        }

        return new int[]{-1,-1};
    }




}
