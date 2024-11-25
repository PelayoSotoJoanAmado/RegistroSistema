package Programa.Vista;

import java.util.Scanner;
import Programa.Controlador.GestionLenguaje;

public class SistemaRegistro {
    public static void main(String[] args) {
        Menu();
    }
        private static void Menu(){
            Scanner lector = new Scanner(System.in);
            int opcion =0;
            String menu="""
                        ##############################
                        Gestión de Lenguajes
                        ##############################
                        1. Agregar Lenguaje
                        2. Buscar Lenguaje
                        3. Eliminar Lenguaje
                        4. Imprimir los lenguajes
                        5. Salir
                        ##############################
                        """;
            do {
                System.out.println(menu);
                System.out.println("Ingrese su opcion");
                opcion = lector.nextInt();
                lector.nextLine();                
                
                switch (opcion){
                    case 1 ->{
                        System.out.println("Ingrese el nombre del lenguajes");
                        String nombre = lector.nextLine();
                        System.out.println("Ingrese el año de creacion");
                        int anioCreacion = lector.nextInt();
                        lector.nextLine();
                        System.out.println("Ingrese la caracteristica principal");
                        String caracteristicaPrincipal = lector.nextLine();
                        System.out.println("Ingrese la utilizacoin");
                        String utilizacion = lector.nextLine();
                        GestionLenguaje.AgregarLenguaje(anioCreacion, caracteristicaPrincipal, nombre, utilizacion);
                    }
                    case 2 ->{
                        System.out.println("Ingrese el nombre del lenguaje a buscar");
                        String nombre = lector.nextLine();
                        if(GestionLenguaje.BuscarLenguaje(nombre)!=null){
                            System.out.println("Lenguaje encontrado: ");
                            System.out.println(GestionLenguaje.BuscarLenguaje(nombre));
                        } else {
                            System.out.println("No se encontraron coincidencias");
                        }

                    }
                    case 3 ->{
                        System.out.println("Ingrese el nombre del lenguaje a eliminar");
                        String nombre = lector.nextLine();
                        
                        if(GestionLenguaje.EliminarLenguaje(nombre)==true){
                            System.out.println("Se elimino el lenguaje");
                        } else{
                            System.out.println("No se encontraron coincidencias");
                        }
                    }
                    case 4 ->{
                        GestionLenguaje.ImprimirLenguajes();
                        System.out.println();
                    }
                    case 5 -> {
                        System.out.println("Se salio correctamente del programa");
                    }
                    default -> {
                        System.out.println("Opcion invalida");
                    }
                }
            } while(opcion!=5);
            
        }   
}
