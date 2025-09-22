public class ConversaoWrapper {
    public static void main (String[] args) {

        //Int -> Integer
        int numeroInt = 42;
        Integer wrapperInt = Integer.valueOf(numeroInt);
        System.out.println("Primeiro int: " + numeroInt);
        System.out.println("Wrapper Integer: " + wrapperInt);

        System.out.println("-----------------------");

        //double -> Double
        double numeroDouble = 3.14;
        Double wrapperDouble = Double.valueOf(numeroDouble);
        System.out.println("Primeiro double: " + numeroDouble);
        System.out.println("Wrapper Double: " + wrapperDouble);

        System.out.print("-------------------------\n");

        // boolean -> Boolean
        boolean numeroBoolean = true;
        Boolean wrapperBoolean = Boolean.valueOf(numeroBoolean);
        System.out.println("Primeiro Boolean: " + numeroBoolean);
        System.out.println("Wrapper Boolean: " + numeroBoolean);

        System.out.println("-----------------------");

        //char -> Char
        char numeroChar = 'A';
        Character wrapper = Character.valueOf(numeroChar);
        System.out.println("Primeiro Char: " + numeroChar);
        System.out.println("Wrapper Char: " + numeroChar);

        System.out.println("-----------------------\n");
    }
}
