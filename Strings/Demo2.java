package Strings;

public class Demo2 {
    public static void main(String[] args) {
        String s1="java";
        String s2=s1;

        System.out.println(s1==s2);//this will give true output

        String s3="ja";
        String s4=s3+"va";
        String s5="java";

        System.out.println(s4==s5);//this will give false output because s5 will saved on string pool
                                  //  but s4 will saved on heap since it is created at runtime
    }
}

