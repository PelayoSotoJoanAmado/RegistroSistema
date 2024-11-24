package Programa.Modelo;

public class LenguajeProgramacion {
    
    private int anioCreacion;
    private String caracteristicaPrincipal;
    private String Nombre;
    private String Utilizacion;

    public LenguajeProgramacion(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion){
        this.anioCreacion=anioCreacion;
        this.caracteristicaPrincipal=caracteristicaPrincipal;
        this.Nombre=nombre;
        this.Utilizacion=utilizacion;
    }
    
    public int getAnioCreacion() {
        return anioCreacion;
    }

    public void setAnioCreacion(int anioCreacion) {
        this.anioCreacion = anioCreacion;
    }

    public String getCaracteristicaPrincipal() {
        return caracteristicaPrincipal;
    }

    public void setCaracteristicaPrincipal(String CaracteristicaPrincipal) {
        this.caracteristicaPrincipal = CaracteristicaPrincipal;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUtilizacion() {
        return Utilizacion;
    }
    
    public void setUtilizacion(String Utilizacion) {
        this.Utilizacion = Utilizacion;
    }
    
    @Override
    public String toString(){
        return  "Lenguaje de Programacion {"+"Nombre: "+Nombre+"; Anio de creacion: "+anioCreacion+
                "; Caracteristica Principal: "+caracteristicaPrincipal+"; Utilizacion: "+Utilizacion+'}';
    }
    
    
}
