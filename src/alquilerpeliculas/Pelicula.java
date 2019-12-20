/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquilerpeliculas;

/**
 *
 * @author Ingenieria
 */
public class Pelicula {

    protected double precio;
    protected String nombre;
    protected String director;
    protected String productor;
    protected String casa;
    protected String protagonista;
    protected String duracion;
    protected String genero;

    public Pelicula() {
    }

    public Pelicula(double precio) {
        this.precio = precio;
    }

    public Pelicula(double precio, String director) {
        this.precio = precio;
        this.director = director;
    }

    public Pelicula(double precio, String director, String productor) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
    }

    public Pelicula(double precio, String director, String productor, String casa) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
        this.casa = casa;
    }

    public Pelicula(double precio, String director, String productor, String casa, String protagonista) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
        this.casa = casa;
        this.protagonista = protagonista;
    }

    public Pelicula(double precio, String director, String productor, String casa, String protagonista, String duracion) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
        this.casa = casa;
        this.protagonista = protagonista;
        this.duracion = duracion;
    }
    
    public Pelicula(double precio, String director, String productor, String casa, String protagonista, String duracion, String nombre ) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
        this.casa = casa;
        this.protagonista = protagonista;
        this.duracion = duracion;
        this.nombre = nombre;
    }
    //*************************************************
    //SETTERS Y GETTERS

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return this.precio;
    }
     public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }
    public void SetDirector(String director) {
        this.director = director;
    }

    public String getDirector() {
        return this.director;
    }

    public void SetProductor(String productor) {
        this.productor = productor;
    }

    public String getProductor() {
        return this.productor;
    }

    public void SetCasa(String casa) {
        this.casa = casa;
    }

    public String getCasa() {
        return this.casa;
    }

    public void SetProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    public String getProtagonista() {
        return this.protagonista;
    }

    public void SetDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getDuracion() {
        return this.duracion;
    }
    
      public String getGenero(){
        return this.genero;
    }
}
