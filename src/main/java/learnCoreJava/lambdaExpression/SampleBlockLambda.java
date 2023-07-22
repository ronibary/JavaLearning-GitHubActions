package learnCoreJava.lambdaExpression;

public class SampleBlockLambda {

    public static void main(String[] args) {

        // example using lambda with block of code
        Store store = (arr) -> {
          int sum = 0;
          for (int n : arr){
              sum += n;
          }
          return sum;
        };

        var array = new int[]{3,3,4};
        var result = store.add(array);

        System.out.println(result);

    }

    interface Store {
        int add(int[] arr);
    }
}
