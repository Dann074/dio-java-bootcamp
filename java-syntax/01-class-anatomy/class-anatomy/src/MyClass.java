public class MyClass {
    public static void main (String [] args) {
        String firstName = "Danilo";
        String secondName = "Costa";
        String completeName = completeName (firstName,secondName);
        System.out.println(completeName);
    }

    public static String completeName (String firstName, String secondName) {
        return firstName.concat(" ").concat(secondName);
    }
}
