
package videostore;

public class Nodo {
    private Object info; // Información almacenada en el nodo
    private Nodo sig; // Nodo anterior
    private Nodo ant; // Nodo siguiente
    
    // Constructor del nodo, inicializa la información y los punteros
    public Nodo(Nodo sig, Nodo ant,Object info) {
        this.info = info;
        this.sig = sig;
        this.ant = ant;
    }
    // Devuelve la información

    public Object getInfo() {
        return info;
    }

    public Nodo getSig() {
        return sig;
    }

    public Nodo getAnt() {
        return ant;
    }

    public void setInfo(Object info) {
        this.info = info;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public void setAnt(Nodo ant) {
        this.ant = ant;
    }
}
