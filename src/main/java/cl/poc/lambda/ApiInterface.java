package cl.poc.lambda;

@FunctionalInterface
public interface ApiInterface {

    String api(String cnt);


    default String apiN() {
        return "Api Default";
    }

}
