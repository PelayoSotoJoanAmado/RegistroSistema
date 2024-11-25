package Programa.Controlador;

import Programa.Modelo.LenguajeProgramacion;

public class GestionLenguaje {
    private static final int FACTOR_CRECIMIENTO = 2;
    private static LenguajeProgramacion[] arregloLenguajes = new LenguajeProgramacion[FACTOR_CRECIMIENTO];
    private static int contadorLenguajes = 0;
    
    public static void AgregarLenguaje(int anioCreacion, String caracteristicaPrincipal, String nombre, String utilizacion){
        if(contadorLenguajes == arregloLenguajes.length){
        LenguajeProgramacion[] aux = new LenguajeProgramacion[arregloLenguajes.length+FACTOR_CRECIMIENTO];
        System.arraycopy(arregloLenguajes,0,aux,0, arregloLenguajes.length);
        arregloLenguajes=aux;
    }
        
        arregloLenguajes[contadorLenguajes] = new LenguajeProgramacion(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
        contadorLenguajes++;
    }
        
    public static LenguajeProgramacion BuscarLenguaje(String nombre){
        for(int i=0;i<contadorLenguajes;i++){
            if(arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)){
                return arregloLenguajes[i];
            } 
        }
        return null;
    }
    
    public static Boolean EliminarLenguaje(String nombre){
        boolean eliminado=false;
        for(int i=0;i<contadorLenguajes;i++){       
            if(arregloLenguajes[i].getNombre().equalsIgnoreCase(nombre)){
                   for (int j=i;j<arregloLenguajes.length-1;j++){
                       arregloLenguajes[j]=arregloLenguajes[j+1];
            }
                   contadorLenguajes--;
                   eliminado = true;
        }
    }
        return eliminado;
    }
    
    public static LenguajeProgramacion[] GetArregloLenguaje(){
        //Crear un arreglo del tamaño del contador de lenguajes, para que sea exacto el arreglo
        LenguajeProgramacion[] TodosLenguajes = new LenguajeProgramacion[contadorLenguajes];
        System.arraycopy(arregloLenguajes,0,TodosLenguajes,0,contadorLenguajes);
        return TodosLenguajes;
}
    
    public static void ImprimirLenguajes(){
        if(contadorLenguajes==0){
            System.out.println("No se ha encontrado ningún lenguaje");
        } else{
        for(int i=0; i<contadorLenguajes;i++){
            System.out.println(arregloLenguajes[i]);
            }
        }
    }
    
    
    
}
