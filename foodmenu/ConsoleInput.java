package foodmenu;

public class ConsoleInput {

    public static String getString() {
        try {

            byte arrInput[] = new byte[60];

            int length = System.in.read(arrInput);

            String objString = new String(arrInput, 0, length);

            objString = objString.trim();

            return objString;

        } catch (Exception objException) {

            System.out.println(objException);
        }

        return null;
    }

    public static int getInt() {
        return Integer.parseInt(getString());
    }

    public static float getFloat() {
        return Float.parseFloat(getString());
    }
}