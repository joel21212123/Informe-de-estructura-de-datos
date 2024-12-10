package videostore;

import java.util.Date;

public class Pelicula {
    private String codigo; // Código de la película
    private String titulo;
    private String director;
    private int año;
    private String genero;
    private double precioAlquiler; // Precio de alquiler de la película
    private boolean disponible; // Estado de disponibilidad
    private int Stock; // Número de copias disponibles
    private String formato; // Formato del video (DVD, Blu-ray, etc.)
    private Date fechaEntrada;  // Fecha de creación (entrada)
    private Date fechaSalida; 

    // Constructor

    public Pelicula(String codigo, String titulo, String director, int año, String genero, double precioAlquiler,
            boolean disponible, int Stock, String formato) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.director = director;
        this.año = año;
        this.genero = genero;
        this.precioAlquiler = precioAlquiler;
        this.disponible = disponible;
        this.Stock = Stock;
        this.formato = formato;
        this.fechaEntrada = new Date(); // Asignamos la fecha actual al agregarla
    }
   
    // Getters y Setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getPrecioAlquiler() {
        return precioAlquiler; // Getter para el precio de alquiler
    }

    public void setPrecioAlquiler(double precioAlquiler) {
        this.precioAlquiler = precioAlquiler; // Setter para el precio de alquiler
    }

    public boolean isDisponible() {
        return disponible; // Getter para la disponibilidad
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible; // Setter para la disponibilidad
    }

    public int getCopias() {
        return Stock; // Getter para el número de copias
    }

    public void setCopias(int copias) {
        this.Stock = copias; // Setter para el número de copias
    }

    public String getFormato() {
        return formato; // Getter para el formato
    }

    public void setFormato(String formato) {
        this.formato = formato; // Setter para el formato
    }

    public int getStock() {
        return Stock;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

}