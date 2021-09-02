package cl.poc.pattern;

public class MainSingleton {

    public static void main(String[] args) {
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();

        Other o = new Other();
        o.other();

    }


}

class Other {
    public void other(){
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().count();
        PatternOne.getInstance().print();
    }
}

class PatternOne{

    private static  PatternOne INSTANCE = null;
    private int count;

    private PatternOne(){
        System.out.println("INSTANCIAS " +  count);
    }


    public static PatternOne getInstance(){
        if(INSTANCE == null){
            synchronized (PatternOne.class){
                INSTANCE = new PatternOne();
            }
        }
        return INSTANCE;
    }

    public void count(){
        count++;
        if(count == 9){
            count = 0;
        }
    }

    public void print(){
        System.out.println(count);
    }

}