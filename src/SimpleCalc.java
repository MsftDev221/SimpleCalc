public class SimpleCalc {
    public static void main(String[] args) {
        if (args.length == 0) {
            return;
        }

        Calculations calculator = new Calculations();

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

        float result;

        if (operand.equals("Add")) {
            result = calculator.Add(number1, number2);

            System.out.println(number1 + " + " + number2 + " = " + result);
        }
        else if (operand.equals("Mult")){
            result = calculator.Multiply(number1, number2);

            System.out.println(number1 + " * " + number2 + " = " + result);
        }
        else if (operand.equals("Div")){
            result = calculator.Divide(number1, number2);

            System.out.println(number1 + " / " + number2 + " = " + result);
        }
        else if (operand.equals("Sub")) {
            result = calculator.Subtract(number1, number2);
            
            System.out.println(number1 + " - " + number2 + " = " + result);
        }
    }

    public static class Calculations {
        public float Divide(float num1, float num2) {
            return num1 / num2;
        }

        public float Multiply(float num1, float num2) {
            return num1 * num2;
        }

        public float Subtract(float num1, float num2) {
            return num1 - num2;
        }

        public float Add(float num1, float num2) {
            return num1 + num2;
        }
    }
}