package dominio;
import java.util.Scanner;
import java.util.ArrayList;
public class Ludoteca {
    private ArrayList <Videojuego> videojuegos;
    public void ludoteca(){
        this.videojuegos = new ArrayList<>();
    }
    public void agregar(Videojuego videojuegos){
        this.videojuegos.add(videojuegos);
    }
    @Override
    public String toString() {
        if (videojuegos.isEmpty()) {
            return "";
        }
        
        StringBuilder sb = new StringBuilder();
        for (Videojuego v : videojuegos) {
            sb.append(v.toString());
        }
        return sb.toString();
    }
    public Videojuego buscarPorTitulo(String titulo) {
        if (titulo == null) {
            return null;
        }
        
        for (Videojuego v : videojuegos) {
           
            if (titulo.equals(v.getTitulo())) {
                return v; 
            }
        }
        return null; 
    }
}

