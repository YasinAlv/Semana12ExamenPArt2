/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerpeliculas;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Ingenieria
 */
public class AlquilerPeliculas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu();
    }
        
       public static void Menu() {

        String nombre,director, productor, casa, protagonista, duracion, genero;
        int precio, op1, op2;
        Scanner Teclado = new Scanner(System.in);
        List<Pelicula> Catalogo = new ArrayList<>();
        Pelicula peliTerror = new Terror();////////POLIMORFISMO
        Pelicula peliDrama = new Drama();////////POLIMORFISMO
        Pelicula peliAccion = new Accion();////////POLIMORFISMO
        Pelicula peliComedia = new Comedia();////////POLIMORFISMO
            
        do {
            System.out.println("    Opciones");
            System.out.println("    1) Ingresar Pelicula de Drama");
            System.out.println("    2) Ingresar Pelicula de Terror");
            System.out.println("    3) Ingresar Pelicula de Comedia");
            System.out.println("    4) Ingresar Pelicula de Accion");
            System.out.println("    5) Mostrar el Catalogo Completo de Peliculas");
            System.out.println("    6) Mostrar el Catalogo de Peliculas del Genero Drama");
            System.out.println("    7) Mostrar el Catalogo de Peliculas del Genero Terror");
            System.out.println("    8) Mostrar el Catalogo de Peliculas del Genero Comedia");
            System.out.println("    9) Mostrar el Catalogo de Peliculas del Genero Accion");
            System.out.println("    10) Salir");
            System.out.println("Digite una opción");
            op1 = Teclado.nextInt();
            switch (op1) {
                case 1:
                    System.out.println("Digite el Nombre de la Pelicula");
                    nombre = Teclado.next();
                    peliDrama.SetNombre(nombre);
                    System.out.println("Digite el nombre del director de la pelicula");
                    director = Teclado.next();
                    peliDrama.SetDirector(director);
                    System.out.println("Digite el nombre del productor de la pelicula");
                    productor = Teclado.next();
                    peliDrama.SetProductor(productor);
                    System.out.println("Digite el nombre de la casa de la pelicula");
                    casa = Teclado.next();
                    peliDrama.SetCasa(casa);
                    System.out.println("Digite el nombre del protagonista de la pelicula");
                    protagonista = Teclado.next();
                    peliDrama.SetProtagonista(protagonista);
                    System.out.println("Digite la duracion de la pelicula (ejm 1:45mints");
                    duracion = Teclado.next();
                    peliDrama.SetDuracion(duracion);
                    System.out.println("Digite el precio del alquiler: ");
                    precio = Teclado.nextInt();
                    peliDrama.setPrecio(precio);
                    System.out.println("Esta Genero tiene un descuento de 20% que sera aplicado al precio digitado");
                    ((Drama)peliDrama).SetGenero();
                    Catalogo.add(peliDrama);
                    break;

                case 2:
                    System.out.println("Digite el Nombre de la Pelicula");
                    nombre = Teclado.next();
                    peliTerror.SetNombre(nombre);
                    System.out.println("Digite el nombre del director de la pelicula");
                    director = Teclado.next();
                    peliTerror.SetDirector(director);
                    System.out.println("Digite el nombre del productor de la pelicula");
                    productor = Teclado.next();
                    peliTerror.SetProductor(productor);
                    System.out.println("Digite el nombre de la casa de la pelicula");
                    casa = Teclado.next();
                    peliTerror.SetCasa(casa);
                    System.out.println("Digite el nombre del protagonista de la pelicula");
                    protagonista = Teclado.next();
                    peliTerror.SetProtagonista(protagonista);
                    System.out.println("Digite la duracion de la pelicula (ejm 1:45mints");
                    duracion = Teclado.next();
                    peliTerror.SetDuracion(duracion);
                    System.out.println("Digite el precio del alquiler: ");
                    precio = Teclado.nextInt();
                    peliTerror.setPrecio(precio);
                    System.out.println("Esta Genero tiene un recargo de 10% que sera aplicado al precio digitado");
                    ((Terror)peliTerror).SetGenero();
                    Catalogo.add(peliTerror);
                    break;
                case 3:
                    System.out.println("Digite el Nombre de la Pelicula");
                    nombre = Teclado.next();
                    peliComedia.SetNombre(nombre);
                    System.out.println("Digite el nombre del director de la pelicula");
                    director = Teclado.next();
                    peliComedia.SetDirector(director);
                    System.out.println("Digite el nombre del productor de la pelicula");
                    productor = Teclado.next();
                    peliComedia.SetProductor(productor);
                    System.out.println("Digite el nombre de la casa de la pelicula");
                    casa = Teclado.next();
                    peliComedia.SetCasa(casa);
                    System.out.println("Digite el nombre del protagonista de la pelicula");
                    protagonista = Teclado.next();
                    peliComedia.SetProtagonista(protagonista);
                    System.out.println("Digite la duracion de la pelicula (ejm 1:45mints");
                    duracion = Teclado.next();
                    peliComedia.SetDuracion(duracion);
                    System.out.println("Digite el precio del alquiler: ");
                    precio = Teclado.nextInt();
                    peliComedia.setPrecio(precio);
                    System.out.println("Esta Genero tiene un recargo de 5% que sera aplicado al precio digitado");
                    ((Comedia)peliComedia).SetGenero();
                    Catalogo.add(peliComedia);
                    break;

                case 4:
                    System.out.println("Digite el Nombre de la Pelicula");
                    nombre = Teclado.next();
                    peliAccion.SetNombre(nombre);
                    System.out.println("Digite el nombre del director de la pelicula");
                    director = Teclado.next();
                    peliAccion.SetDirector(director);
                    System.out.println("Digite el nombre del productor de la pelicula");
                    productor = Teclado.next();
                    peliAccion.SetProductor(productor);
                    System.out.println("Digite el nombre de la casa de la pelicula");
                    casa = Teclado.next();
                    peliAccion.SetCasa(casa);
                    System.out.println("Digite el nombre del protagonista de la pelicula");
                    protagonista = Teclado.next();
                    peliAccion.SetProtagonista(protagonista);
                    System.out.println("Digite la duracion de la pelicula (ejm 1:45mints");
                    duracion = Teclado.next();
                    peliAccion.SetDuracion(duracion);
                    System.out.println("Digite el precio del alquiler: ");
                    precio = Teclado.nextInt();
                    peliAccion.setPrecio(precio);
                    System.out.println("Esta Genero tiene un recargo de 15% que sera aplicado al precio digitado");
                    ((Accion)peliAccion).SetGenero();
                    Catalogo.add(peliAccion);
                    break;
                case 5:
                   printCatalogo(Catalogo);
                    break;
                case 6:
                    printDrama(Catalogo);
                    break;
                case 7:
                    printTerror(Catalogo);
                    break;
                case 8:
                    printComedia(Catalogo);
                    break;
                case 9:
                    printAccion(Catalogo);
                    break;
            }
        } while (op1 != 10);
    }
 //************************************************************************************
 private static void printCatalogo(List<Pelicula> Catalogo) {
        for (Pelicula peli : Catalogo) {
            if (null == peli.getGenero())
            {
               System.out.println("Nombre de la Pelicula: " + peli.getNombre() + 
                                            "  Genero: " + peli.getGenero()+
                                            "  Productor: " + peli.getProductor()+
                                            "  Casa: " + peli.getCasa()+
                                            "  Protagonista: " + peli.getProtagonista()+
                                            "  Duracion: " + peli.getDuracion()+
                                            "  Precio " + ((Drama)peli).getPrecio());
            } else
            {
                switch (peli.getGenero()) {
                    case "ACCION":
                        System.out.println("Nombre de la Pelicula: " + peli.getNombre() + 
                                            "  Genero: " + peli.getGenero()+
                                            "  Productor: " + peli.getProductor()+
                                            "  Casa: " + peli.getCasa()+
                                            "  Protagonista: " + peli.getProtagonista()+
                                            "  Duracion: " + peli.getDuracion()+
                                            "  Precio " + ((Accion)peli).getPrecio());
                        break;
                    case "COMEDIA":
                        System.out.println("Nombre de la Pelicula: " + peli.getNombre() + 
                                            "  Genero: " + peli.getGenero()+
                                            "  Productor: " + peli.getProductor()+
                                            "  Casa: " + peli.getCasa()+
                                            "  Protagonista: " + peli.getProtagonista()+
                                            "  Duracion: " + peli.getDuracion()+
                                            "  Precio " + ((Comedia)peli).getPrecio());
                        break;
                    case "TERROR":
                        System.out.println("Nombre de la Pelicula: " + peli.getNombre() + 
                                            "  Genero: " + peli.getGenero()+
                                            "  Productor: " + peli.getProductor()+
                                            "  Casa: " + peli.getCasa()+
                                            "  Protagonista: " + peli.getProtagonista()+
                                            "  Duracion: " + peli.getDuracion()+
                                            "  Precio " + ((Terror)peli).getPrecio());
                        break;
                    default:
                        System.out.println("Nombre de la Pelicula: " + peli.getNombre() + 
                                            "  Genero: " + peli.getGenero()+
                                            "  Productor: " + peli.getProductor()+
                                            "  Casa: " + peli.getCasa()+
                                            "  Protagonista: " + peli.getProtagonista()+
                                            "  Duracion: " + peli.getDuracion()+
                                            "  Precio " + ((Drama)peli).getPrecio());
                        break;
                }
            }
        }
    }
 //************************************************************************************
 private static void printComedia(List<Pelicula> Catalogo) {
       
        for (int i = 0; i < Catalogo.size(); i++) {
            if(Catalogo.get(i).getGenero()=="COMEDIA"){
                System.out.println("Nombre de la Pelicula: " + Catalogo.get(i).getNombre() + 
                                            "  Genero: " + Catalogo.get(i).getGenero()+
                                            "  Productor: " + Catalogo.get(i).getProductor()+
                                            "  Casa: " + Catalogo.get(i).getCasa()+
                                            "  Protagonista: " + Catalogo.get(i).getProtagonista()+
                                            "  Duracion: " + Catalogo.get(i).getDuracion()+
                                            "  Precio " + ((Comedia)Catalogo.get(i)).getPrecio());
            }
     }
    }
  //************************************************************************************
 private static void printAccion(List<Pelicula> Catalogo) {
       
        for (int i = 0; i < Catalogo.size(); i++) {
            if(Catalogo.get(i).getGenero()=="ACCION"){
                System.out.println("Nombre de la Pelicula: " + Catalogo.get(i).getNombre() + 
                                            "  Genero: " + Catalogo.get(i).getGenero()+
                                            "  Productor: " + Catalogo.get(i).getProductor()+
                                            "  Casa: " + Catalogo.get(i).getCasa()+
                                            "  Protagonista: " + Catalogo.get(i).getProtagonista()+
                                            "  Duracion: " + Catalogo.get(i).getDuracion()+
                                            "  Precio " + ((Comedia)Catalogo.get(i)).getPrecio());
            }
     }
    }
  //************************************************************************************
 private static void printDrama(List<Pelicula> Catalogo) {
       
        for (int i = 0; i < Catalogo.size(); i++) {
            if(Catalogo.get(i).getGenero()=="DRAMA"){
                System.out.println("Nombre de la Pelicula: " + Catalogo.get(i).getNombre() + 
                                            "  Genero: " + Catalogo.get(i).getGenero()+
                                            "  Productor: " + Catalogo.get(i).getProductor()+
                                            "  Casa: " + Catalogo.get(i).getCasa()+
                                            "  Protagonista: " + Catalogo.get(i).getProtagonista()+
                                            "  Duracion: " + Catalogo.get(i).getDuracion()+
                                            "  Precio " + ((Comedia)Catalogo.get(i)).getPrecio());
            }
     }
    }
  //************************************************************************************
 private static void printTerror(List<Pelicula> Catalogo) {
       
        for (int i = 0; i < Catalogo.size(); i++) {
            if(Catalogo.get(i).getGenero()=="TERROR"){
                System.out.println("Nombre de la Pelicula: " + Catalogo.get(i).getNombre() + 
                                            "  Genero: " + Catalogo.get(i).getGenero()+
                                            "  Productor: " + Catalogo.get(i).getProductor()+
                                            "  Casa: " + Catalogo.get(i).getCasa()+
                                            "  Protagonista: " + Catalogo.get(i).getProtagonista()+
                                            "  Duracion: " + Catalogo.get(i).getDuracion()+
                                            "  Precio " + ((Comedia)Catalogo.get(i)).getPrecio());
            }
     }
    }
//***************
}
    

