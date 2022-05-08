public class CompareTwoNumbers {
    public static void main(String[] args) {

        int nums[]={1,2,3,4,5,6};
        int target=5;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if ((nums[i] + nums[j]) == target) {
                    int arr[] = {i, j};

                    System.out.println("indexes of array producing output are  :" + arr[0]
                    + " and " + arr[1]);
                }
            }
        }}}


