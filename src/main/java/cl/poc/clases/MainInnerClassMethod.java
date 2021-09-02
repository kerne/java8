package cl.poc.clases;

public class MainInnerClassMethod {

    public static void main(String[] args) {

        MainInnerClassMethod m = new MainInnerClassMethod();

        System.out.println(m.method(2, 2));

    }

    public int method(int x, int y) {
        class M {
            public int multiply() {
                return y * x;
            }
        }
        return new M().multiply();
    }


}
