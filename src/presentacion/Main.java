package presentacion;
import dominio.Ludoteca;
import dominio.Videojuego;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
       /*  ArrayList <Videojuego> videojuegos = new ArrayList();

        videojuegos.add(new Videojuego("FIFA","PC",67,3));
        videojuegos.add(new Videojuego("Halo","PC",4,189));
        videojuegos.add(new Videojuego("Mario","Nintendo",95,200));
        videojuegos.add(new Videojuego("Call of Duty","Ps4",20,5));
        videojuegos.add(new Videojuego("Vice City","PC",99,1));
        
for (Videojuego juego : videojuegos) {
    System.out.println(juego);
}


System.out.println("Número de videojuegos: " + videojuegos.size());
    }*/
    Ludoteca miLudoteca = new Ludoteca();
    Videojuego videojuegos = new Videojuego("FIFA","PC",67,3);
    miLudoteca.agregar(videojuegos);
    Videojuego videojuegos2 = new Videojuego("Halo","PC",4,189);
    miLudoteca.agregar(videojuegos2);
    Videojuego videojuegos3 = new Videojuego("Mario","Nintendo",95,200);
    miLudoteca.agregar(videojuegos3);
    miLudoteca.buscarPorTitulo("Zelda");
    miLudoteca.buscarPorTitulo("FIFA");
    

    }}
