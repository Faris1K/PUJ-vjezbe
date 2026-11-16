public class DataTypeDemo {
    public static void main(String[] args){
        int x = 130;
        byte y = (byte) x;
        double result = 10 / 3.0;

        System.out.println("x = " + x);
        System.out.println("After casting to byte: y = " + y);
        System.out.println("10 / 3.0 = " + result);
    }
}
