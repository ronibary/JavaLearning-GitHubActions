package learning;

import java.text.DecimalFormat;

public class CoreJavaBrushUp5 {

    public static void main(String[] args) {

        Integer x = 127;
        Integer y = 127;

        int a = 400;
        int b = 400;

        // int between -128 to 127 are chached and reused
        // that's why we get true
        System.out.println(x == y);

        Number num = 3.45;
        String c = num.getClass().toString();
        System.out.println(c);

        var score = "70";
        var scoreNum = Integer.valueOf(score);
        System.out.println(scoreNum +20);

        // formatting numbers
        //var pi = 3.147;
        var pi = 100000;

        var decimalF = new DecimalFormat("$###,###.00");
        var formattedText = decimalF.format(pi);

        System.out.println(formattedText);

        // using Math class

        var num1 = 64;
        //var answer = Math.min(90,56);
        var answer = Math.sqrt(num1);
        System.out.println(answer);

        var num2 = 64;
        answer = Math.sin(num2);
        System.out.println(answer);

        var randNum = Math.random();
        System.out.println(randNum);


    }

}
