public class HelloEnv {
    public static void main (String[] args) {
        String systemVariable = System.getenv("MY_NAME");
        System.out.println("My name is " + systemVariable);
    }
}
