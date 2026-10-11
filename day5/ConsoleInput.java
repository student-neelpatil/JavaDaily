package day5;

public class ConsoleInput {

    public static String getString() {

        try {
            byte[] arrInput = new byte[100];

            int length = System.in.read(arrInput);

            byte[] arrString = new byte[length - 2];

            System.arraycopy(
                    arrInput,
                    0,
                    arrString,
                    0,
                    length - 2
            );

            String objString = new String(arrString);

            return objString;
        }
        catch (Exception objException) {

            System.out.println(objException);

            return null;
        }
    }

    public static float getFloat() {

        return Float.parseFloat(getString());
    }

    public static int getInt() {

        return Integer.parseInt(getString());
    }
}