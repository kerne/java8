package cl.poc.lambda;

public class Main {

    public static void main(String[] args) {
        ApiInterface inter = (e) -> "Api" + e;

        System.out.println(inter.api("2"));
    }
}
