//From Linear Search Find Elements in Index.
public class LinearSearch {
    public static void main(String[] args) {
        int nums[] = {6,8,10,4,11};
        int target = 4;

        int result = LinearSearch(nums ,target);
        if(result != -1){
            System.out.println("Element found at index: " + result);
        }else{
            System.out.println("Element not found.");
        }
        
    }
    public static int LinearSearch(int[] nums ,int target){
        for(int i=1; i<nums.length; i++){
            if(nums[i]==target){
                System.out.println(nums[i]);
                return i;
            }
        }
        return -1;
    }
}
