public class Calculator{

    public double addition(double a, double b){
        return (a+b);
    }

    public double subtraction(double a, double b){
        return (a-b);
    }

    public double multiplication(double a, double b){
        return (a*b);
    }

    public double division(double numerator, double denominator){
        return (numerator/denominator);
    }

    public double exponentiate (double base, double exponent) {
        int result = 1;
        for (int i = (int) exponent; i>0; i--) {
            result = result * (int) base;
        }
        return result;
    }



}
