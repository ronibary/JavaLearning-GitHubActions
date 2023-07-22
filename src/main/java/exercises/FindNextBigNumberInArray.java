package exercises;


/**
 /// <summary>
 /// 1,3,2,4 -->  3,4,4,-1
 /// 4,3,2,1 -->  -1,-1,-1,-1
 ///
 /// for each number in the array find the next big number in the array if not
 /// found or if its last element place -1 in the output array
 ///
 /// int[] arr = FindNextBigNumbers(new int[] {4, 3, 2, 1});
 ///
 /// </summary>
 /// <param name="arr"></param>
 /// <returns></returns>
 */
public class FindNextBigNumberInArray {

    public static void main(String[] args) {
        int[] arr = findNextBigNumbers(new int[] {1, 3, 2, 4});

        for(int i : arr)
        {
            System.out.print(i + " ,");
        }
    }

    public static int[] findNextBigNumbers(int[] arr)
    {
        int[] outArr = new int[arr.length];


        for (int i = 0; i < arr.length - 1; i++)
        {
            Boolean found = false;
            for (int j = i; j < arr.length; j++)
            {
                if (j + 1 < arr.length && arr[j + 1] > arr[i])
                {
                    found = true;
                    outArr[i] = arr[j + 1];
                    break;
                }
            }

            if (!found)
                outArr[i] = -1;
        }

        outArr[arr.length - 1] = -1;

        return outArr;
    }


}
