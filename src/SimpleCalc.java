public class SimpleCalc {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        String[] splitted_args = args[0].split(" ");

        if (splitted_args.length != 3) {
            System.out.println("Wrong arguments!");
            System.out.println("Here are some examples: ");
            System.out.println(" Add x y \n Mult x y\n Div x y\n Sub x y.");
            return;
        }

        float number1 = Float.parseFloat(splitted_args[1]);
        float number2 = Float.parseFloat(splitted_args[2]);

        String operand = splitted_args[0];

        if (operand.equals("Add")) {
            float result = Add(number1, number2);

            System.out.println(number1 + " + " + number2 + " = " + result);
        }
        else if (operand.equals("Mult")){
            float result = Multiply(number1, number2);

            System.out.println(number1 + " * " + number2 + " = " + result);
        }
        else if (operand.equals("Div")){
            float result = Divide(number1, number2);

            System.out.println(number1 + " / " + number2 + " = " + result);
        }
        else if (operand.equals("Sub")) {
            float result = Subtract(number1, number2);
            
            System.out.println(number1 + " - " + number2 + " = " + result);
        }
    }

    public static float Divide(float num1, float num2) {
        return num1 / num2;
    }

    public static float Multiply(float num1, float num2) {
        return num1 * num2;
    }

    public static float Subtract(float num1, float num2) {
        return num1 - num2;
    }

    public static float Add(float num1, float num2) {
        return num1 + num2;
    }
}
