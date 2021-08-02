public class StringBufferBuilder {

    public static void main(String[] args) {

        String s1 = new String("Hello");

        StringBuffer s2 = new StringBuffer(s1);

        StringBuilder s3 = new StringBuilder(s1);

        s1.concat(" World");
        s2.append(" World");
        s3.append(" World");

        System.out.println(s1); // doesn't modify the original string
        System.out.println(s2);
        System.out.println(s3);

    }

}
