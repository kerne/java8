package cl.poc.herencia;

public class Main {

    public static void main(String[] args) {


        StringBuilder sb = new StringBuilder("ABCDEF");
        sb.delete(4, 6);
        sb.ensureCapacity(22);
        System.out.println(sb.capacity());
        sb.ensureCapacity(23);
        System.out.println(sb.capacity());

        sb.substring(4);


        char[] chars = new char[4];

        chars[0] = 0;
        chars[1] = 2;

        String out = "123456789";
        out.getChars(0, 3, chars, 0);

        for (char c : chars) {
            System.out.println(c);
        }

    }

}
