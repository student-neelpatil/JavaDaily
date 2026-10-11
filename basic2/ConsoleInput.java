package basic2;


public class ConsoleInput {

    public static String getString() {
        try {
            byte arrInput[] = new byte[100];

            int length = System.in.read(arrInput);

            byte[] arrFinal = new byte[length - 2];

            System.arraycopy(arrInput, 0, arrFinal, 0, length - 2);

            String objstring = new String(arrFinal);

            return objstring;

        } catch (Exception objException) {

            System.out.println(objException);
            return null;
        }
    }

    public static int getInt() {
        return Integer.parseInt(getString());
    }
}