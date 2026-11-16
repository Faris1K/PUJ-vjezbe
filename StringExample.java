public class StringExample {
    public static void main(String[] args){
        String first = "Java";
        String second = "Programming";
        String third = "Coding";
        String fourth = "is";
        String fifth = "difficult";

        String combined = first + " " + second;
        String combined2 = third + " " + fourth + " " + fifth;
        System.out.println("Combiner: " + combined);
        System.out.println("Length: " + combined.length());
        System.out.println("Uppercase: " + combined.toUpperCase());
        System.out.println("Contains 'Java'? " + combined.contains("Java"));

        System.out.println("\nCombiner: " + combined2);
        System.out.println("Length: " + combined2.length());
        System.out.println("Uppercase: " + combined2.toUpperCase());
        System.out.println("Contains 'Coding'? " + combined2.contains("Coding"));

    }
}