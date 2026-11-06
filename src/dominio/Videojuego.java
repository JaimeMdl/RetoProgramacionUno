package dominio;
public class Videojuego {
    private String titulo;
    private String plataforma;
    private int puntuacion;
    private int horasJugadas;
    
    public Videojuego(String titulo, String plataforma, int puntuacion, int horasJugadas) {
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.puntuacion = puntuacion;
        this.horasJugadas = horasJugadas;
        if (titulo.isEmpty()){
            System.out.println("Error titulo vacío");
        }
        if (puntuacion<0||puntuacion>100){
            System.out.println("Puntuación invalida");
        }
        if (horasJugadas < 0){
            System.out.println("Error horas jugadas negativas");
        }
    }
    
public String getTitulo() {
    
    return titulo;
}

public String getPlataforma() {
    return plataforma;
}

public int getPuntuacion() {
    return puntuacion;
}

public int getHorasJugadas() {
    return horasJugadas;
}


public void setTitulo(String titulo) {
    if (titulo.isEmpty()){
            System.out.println("Error titulo vacío");
        }
    this.titulo = titulo;
}

public void setPlataforma(String plataforma) {
    this.plataforma = plataforma;
}

public void setPuntuacion(int puntuacion) {
    if (puntuacion<0||puntuacion>100){
            System.out.println("Puntuación invalida");
        }
    this.puntuacion = puntuacion;
}

public void setHorasJugadas(int horasJugadas) {
    if (horasJugadas < 0){
            System.out.println("Error horas jugadas negativas");
        }
    this.horasJugadas = horasJugadas;
}

@Override 
public String toString(){
    return "Titulo: " + titulo + ", puntuacion: " + puntuacion + ", horas jugadas: " + horasJugadas + ", plataforma: " + plataforma;
    
}

    }
