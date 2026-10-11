// package practice1;

// public class ConsoleInput {
     
//     public static String getString()
//     {
//         try {
            
//             byte arrInput[]=new byte[60];
//             int length=System.in.read(arrInput);
//             byte arrFinal[]=new byte[length-2];
//             System.arraycopy(arrInput, 0, arrFinal, 0, length-2);
//             String objString=new String(arrFinal);
//             objString=objString.trim();
//             return objString;


//         } catch (Exception objException) {
            
//             System.out.println(objException);
//         }
//         return  null;
//     }

//     public static int getInt(){
//         return Integer.parseInt(getString());
//     }

//      public static float getFloat(){
//         return Float.parseFloat(getString());
//     }
// }

package practice1;

 class ConsoleInput {

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