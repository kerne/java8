package cl.poc.clases;

public class MainCasting extends  Principal{

    public static void main(String[] args) {
        Principal m = new MainCasting();

        if(m instanceof  MainCasting){
            MainCasting p = (MainCasting) m;
            System.out.println("CASTING OK");
        }

    }

}

class Principal{}