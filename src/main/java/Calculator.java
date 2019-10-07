public class Calculator {
    private int add;
    private int subtract;
    private int multiply;
    private double divide;

    public Calculator(int add, int subtract, int multiply, double divide) {
        this.add = add;
        this.subtract = subtract;
        this.multiply = multiply;
        this.divide = divide;
    }

        public static Number add(Number a, Number b){
             return a.intValue() + b.intValue();
        }

        public static Number subtract(Number a, Number b){
            return a.intValue() - b.intValue();
        }

        public static Number multiply(Number a, Number b){
            return a.intValue() * b.intValue();
        }

        public static  Number divide(Number a, Number b){
            return a.doubleValue() / b.doubleValue();
        }

}
