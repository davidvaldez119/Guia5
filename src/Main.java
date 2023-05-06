import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Cancion> miscanciones= new ArrayList<>();
        miscanciones.add(new Cancion("cumparsa",2,Genero.ROCK));
        miscanciones.add(new Cancion("muchachos",3,Genero.HIPHOP));
        miscanciones.add(new Cancion("lalola",2,Genero.TRAP));
        System.out.println(miscanciones.size());
        System.out.println(miscanciones);
    }
}