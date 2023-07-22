package exercises;

public class BinarySearch {
    public static void main(String[] args) {

        int[] numbers = {3,5,8,9,13,25,54,65,76,78};
        System.out.println("the number 65 in numbers array : " +
                binarySearchRecursive(numbers,65,0,10));

        System.out.println("the number 55 in numbers array : " +
                binarySearchRecursive(numbers,55,0,10));

        System.out.println("the number 65 in numbers array : " +
                binarySearchIterative(numbers,65,0,10));

        System.out.println("the number 55 in numbers array : " +
                binarySearchIterative(numbers,55,0,10));


    }

    public static Boolean binarySearchRecursive(int[] arr, int x, int left, int right) {

        if (left > right)
            return false;

        int mid = left + ((right-left)/2);

        if (arr[mid] == x)
            return true;
        else if (x < arr[mid])
            return binarySearchRecursive(arr,x , left, mid-1);
        else if(x > arr[mid])
            return binarySearchRecursive(arr, x, mid+1, right);

        return false;
    }


    public static Boolean binarySearchIterative(int[] arr, int x, int left, int right) {

        left = 0;
        right = arr.length - 1;

        while(left <= right)
        {
            int mid = left + ((right-left)/2);

            if (arr[mid] == x)
                return true;
            else if (x < arr[mid])
            {
                right = mid - 1;
            }
            else if (x > arr[mid])
            {
                left = mid + 1;
            }
        }
        return false;
    }

}
