package pokemon;

public abstract class TipoAgua {
    String nombre,accesorio;
    int edad;

    public TipoAgua(String nombre, String accesorio, int edad) {
        this.nombre = nombre;
        this.accesorio = accesorio;
        this.edad = edad;
    }
    
    public TipoAgua(){
    }
    
    public void comer(){
        System.out.println("Comiendo");
    }
    public void traslado(){
        System.out.println("Trasladandose");
    }
    public void coshar(){
        System.out.println("Coshandome a tu gfa!");
    }
}
