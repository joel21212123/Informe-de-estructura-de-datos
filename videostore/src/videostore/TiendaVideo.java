package videostore;

public class TiendaVideo {
    private String nombreTienda; // Nombre de la tienda
    private String ruc; // RUC de la tienda
    private String ubicacion; // Dirección de la tienda
    private String horario; // Horario de atención
    private Lista inventario; // Lista doblemente enlazada para las películas

    public TiendaVideo(String nombreTienda, String ruc, String ubicacion, String horario, Lista inventario) {
        this.nombreTienda = nombreTienda;
        this.ruc = ruc;
        this.ubicacion = ubicacion;
        this.horario = horario;
        this.inventario = inventario;
    }

    public String getNombreTienda() {
        return nombreTienda;
    }

    public String getRuc() {
        return ruc;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public String getHorario() {
        return horario;
    }

    public Lista getInventario() {
        return inventario;
    }

    public void setNombreTienda(String nombreTienda) {
        this.nombreTienda = nombreTienda;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setInventario(Lista inventario) {
        this.inventario = inventario;
    }

 
}
