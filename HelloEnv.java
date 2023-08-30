public class HelloEnv {
    public static void main (String[] args) {
        String systemVariable = System.getenv("MY_NAME");
        System.out.println("My name is " + systemVariable);

        if (systemVariable != null) {
            String reversed = "";
            int n = systemVariable.length();

            for(int i = 0; i < n; i++){
                reversed = systemVariable.charAt(i) + reversed;
            }

            System.out.println("My name have been reversed: " + reversed);
        }


    }
}
