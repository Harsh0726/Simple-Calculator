package sample;

public class Model {

    public float calculate(long num1, long num2, String operator){
        switch (operator){
            case "+":
                System.out.print(num1+"+"+num2+"=");
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
                return num1 * num2;
            case "/":
                if(num2 == 0)
                    return 0;
                else
                return (float)num1 / num2;

            default:
                return 0;
        }

    }
}
