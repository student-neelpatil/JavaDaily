package oops;



public class ConsoleInput {

   public static String getString() {
        try {
            byte[] arrInput = new byte[100];

            int length = System.in.read(arrInput);

            if (length > 0 && arrInput[length - 1] == '\n') {
                length--;

                if (length > 0 && arrInput[length - 1] == '\r') {
                    length--;
                }
            }

            return new String(arrInput, 0, length);

        } catch (Exception e) {
            System.out.println(e);
            return null;
        }
    }

    public static double getDouble(){
        return Double.parseDouble(getString().trim());
    }

    public static int getInt() {
        return Integer.parseInt(getString().trim());
    }
}