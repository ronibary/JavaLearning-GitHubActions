package learnCoreJava.lambdaExpression;

public class SampleLambdaWithGeneric {


    public static void main(String[] args) {

        var arrayInt = new Integer[]{3, 3, 4};
        var arrayStr = new String[]{"3","3","4"};

        Store<Integer> storeInt = (arr) -> {

            int sum = 0;
            for (int n : arr) {
                sum += n;
            }
            return sum;
        };

        Store<String> storeStr = (arr) -> {

            int sum = 0;
            for (String s : arr) {
                sum += Integer.parseInt(s);
            }
            return String.valueOf(sum);
        };

        var x = storeInt.add(arrayInt);
        System.out.println(x);

        var y = storeStr.add(arrayStr);
        System.out.println(y);
    }


    interface Store<T> {
        T add(T[] arr);
    }

}
