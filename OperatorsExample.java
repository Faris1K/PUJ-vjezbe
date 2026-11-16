public class OperatorsExample {
    public static void main(String[] args){
        int a = 10, b = 5;
        int sum = a + b;
        int diff = a - b;
        boolean isGreater = a > b;
        boolean bothPositive = (a > 0) && (b > 0);
        int product = a * b;
        int quotient = a / b;
        int modulus = a % b;

        int c = 13, d = 6;
        int sum2 = c + d;
        int diff2 = c - d;
        boolean isGreater2 = c > d;
        boolean bothPositive2 = (c > 0) && (d > 0);
        int product2 = c * d;
        int quotient2 = c/ d;
        int modulus2 = c % d;

        System.out.println("A :" + a + "\nB :" + b);
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Is greater than b? " + isGreater);
        System.out.println("Are both positive? " + bothPositive);
        System.out.println("Product :" + product);
        System.out.println("Quotient :" + quotient);
        System.out.println("Modulus :" + modulus + "\n");

        System.out.println("C :" + c + "\nD :" + d);
        System.out.println("Sum: " + sum2);
        System.out.println("Difference: " + diff2);
        System.out.println("Is greater than b? " + isGreater2);
        System.out.println("Are both positive? " + bothPositive2);
        System.out.println("Product :" + product2);
        System.out.println("Quotient :" + quotient2);
        System.out.println("Modulus :" + modulus2);


    }
}
