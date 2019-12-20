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
public class Terror extends Pelicula {
     public Terror() {
    }

    public Terror(double precio) {
        this.precio = precio;
    }

    public Terror(double precio, String director) {
        this.precio = precio;
        this.director = director;
    }

    public Terror(double precio, String director, String productor) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
    }

    public Terror(double precio, String director, String productor, String casa) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
        this.casa = casa;
    }

    public Terror(double precio, String director, String productor, String casa, String protagonista) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
        this.casa = casa;
        this.protagonista = protagonista;
    }

    public Terror(double precio, String director, String productor, String casa, String protagonista, String duracion) {
        this.precio = precio;
        this.director = director;
        this.productor = productor;
        this.casa = casa;
        this.protagonista = protagonista;
        this.duracion = duracion;
    }
     public Terror(double precio, String director, String productor, String casa, String protagonista, String duracion, String nombre ) {
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
     @Override
  public void SetNombre(String nombre) {
        this.nombre = nombre;
    }

     @Override
    public String getNombre() {
        return this.nombre;
    }
    @Override
    public void setPrecio(double precio) {
        this.precio = precio+precio*0.10;
    }

    @Override
    public double getPrecio() {
        return this.precio;
    }

    @Override
    public void SetDirector(String director) {
        this.director = director;
    }

    @Override
    public String getDirector() {
        return this.director;
    }

    @Override
    public void SetProductor(String productor) {
        this.productor = productor;
    }

    @Override
    public String getProductor() {
        return this.productor;
    }

    @Override
    public void SetCasa(String casa) {
        this.casa = casa;
    }

    @Override
    public String getCasa() {
        return this.casa;
    }

    @Override
    public void SetProtagonista(String protagonista) {
        this.protagonista = protagonista;
    }

    @Override
    public String getProtagonista() {
        return this.protagonista;
    }

    @Override
    public void SetDuracion(String duracion) {
        this.duracion = duracion;
    }

    @Override
    public String getDuracion() {
        return this.duracion;
    }
    public void SetGenero(){
        this.genero="TERROR";
    }
}
