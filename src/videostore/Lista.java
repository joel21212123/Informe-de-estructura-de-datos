
package videostore;

import java.util.Date;

public class Lista {
    private Nodo cab; // Nodo que apunta al inicio de la lista
    private Nodo fin; // Nodo que apunta al final de la lista

    // Constructor de la lista, inicializa cab y fin como null
    public Lista() {
        this.cab = null;
         fin = null;
    }

    public Nodo getCab() {
        return cab;
    }

    public Nodo getFin() {
        return fin;
    }

    public void setCab(Nodo cab) {
        this.cab = cab;
    }

    public void setFin(Nodo fin) {
        this.fin = fin;
    }

    // Verifica si la lista está vacía
    public boolean listaVacia() {
        return cab == null; // Retorna true si cab es null
    }

    
   // Método para insertar un elemento al final de la lista

    public void insertarFinal(Object dato){
      if (listaVacia())
               cab = fin = new Nodo(null,null,dato);
   else
      {
          fin.setSig(new Nodo(null,fin,dato));
          fin=fin.getSig();
       }

    }

    public void insertarInicio(Object dato){
       if(listaVacia()){
           cab=new Nodo(null,null,dato);
           fin=cab;
       }
       else
       {
           cab.setAnt(new Nodo(cab,null,dato));
           cab=cab.getAnt();
       }

}
public Object eliminarFinal()throws ListaVaciaException{
Object itemEliminado = null;
           if (listaVacia())
                   throw new ListaVaciaException("lista sin elementos");

itemEliminado = fin.getInfo();
//restablecer las referencias primerNodo y ultimoNodo
   if(cab.equals(fin))
   {
       cab = fin = null;
   }
   else
    { Nodo aux = fin.getAnt();
      aux.setSig(null);
      fin=aux;
    }
    return itemEliminado;
}

public Object eliminarInicio()throws ListaVaciaException{
   if( listaVacia())
       throw new ListaVaciaException("Lista sin elementos");

   Object itemEliminado =cab.getInfo();
  //restablecer las referencias primerNodo y ultimoNodo
   if(cab.equals(fin))
      cab = fin = null;
   else
        cab = cab.getSig();

   return itemEliminado;
}

public int getTamaño()throws ListaVaciaException{
    if(listaVacia())
        throw new ListaVaciaException("lista sin elementos");
    Nodo p=cab;
    int cuenta=0;

    while(p!=null){
        cuenta++;
        p=p.getSig();
    }
 return cuenta;
}
public void eliminarPorCodigo(String codigo) throws ListaVaciaException {
    if (listaVacia()) {
        throw new ListaVaciaException("Lista sin elementos");
    }
    Nodo nodoActual = cab; // Comenzamos desde el inicio de la lista
    while (nodoActual != null) {
        Pelicula pelicula = (Pelicula) nodoActual.getInfo();
        if (pelicula.getCodigo().equals(codigo)) {
            // Si encontramos el nodo con el código de la película
            if (nodoActual == cab) {
                // Si el nodo a eliminar es el primero (cabeza)
                cab = nodoActual.getSig();
                if (cab != null) {
                    cab.setAnt(null); // Si hay un siguiente nodo, actualizamos su puntero 'ant'
                }
            } else if (nodoActual == fin) {
                // Si el nodo a eliminar es el último
                fin = nodoActual.getAnt();
                if (fin != null) {
                    fin.setSig(null); // Si hay un nodo anterior, actualizamos su puntero 'sig'
                }
            } else {
                // Si el nodo está en el medio
                nodoActual.getAnt().setSig(nodoActual.getSig());
                nodoActual.getSig().setAnt(nodoActual.getAnt());
            }
            break; // Salimos del ciclo después de eliminar el nodo
        }
        nodoActual = nodoActual.getSig(); // Avanzamos al siguiente nodo
    }
}
public boolean modificarPorCodigo(String codigo, String nuevoTitulo, String nuevoDirector, 
                                  int nuevoAño, String nuevoGenero, double nuevoPrecio, 
                                  int nuevoStock, String nuevoFormato, boolean nuevoDisponible) {
    if (listaVacia()) {
        return false;  // Si la lista está vacía, no se puede modificar
    }

    Nodo nodoActual = cab;  // Comienza desde el primer nodo
    while (nodoActual != null) {
        Pelicula pelicula = (Pelicula) nodoActual.getInfo();  // Obtener la película del nodo
        if (pelicula.getCodigo().equals(codigo)) {
            // Si encontramos el nodo con el código de la película
            pelicula.setTitulo(nuevoTitulo);
            pelicula.setDirector(nuevoDirector);
            pelicula.setAño(nuevoAño);
            pelicula.setGenero(nuevoGenero);
            pelicula.setPrecioAlquiler(nuevoPrecio);
            pelicula.setCopias(nuevoStock);
            pelicula.setFormato(nuevoFormato);
            pelicula.setDisponible(nuevoDisponible);
            return true;  // Se modificó correctamente
        }
        nodoActual = nodoActual.getSig();  // Avanzamos al siguiente nodo
    }

    return false;  // Si no se encuentra la película, retornar false
}

  // Método para insertar una película al final (registro de entrada de producto)
    public void insertarFinal(Pelicula pelicula) {
        if (listaVacia())
            cab = fin = new Nodo(null, null, pelicula);
        else {
            fin.setSig(new Nodo(null, fin, pelicula));
            fin = fin.getSig();
        }

        // Registrar la fecha de entrada cuando se agrega la película
        registrarEntrada(pelicula);
    }

// Método para registrar la fecha de entrada (cuando una película llega al inventario)
    private void registrarEntrada(Pelicula pelicula) {
        // Aquí registramos la fecha de entrada
        pelicula.setFechaEntrada(new Date());
        System.out.println("Película " + pelicula.getTitulo() + " registrada con fecha de entrada: " + pelicula.getFechaEntrada());
    }
    

    // Método para registrar la fecha de salida (cuando se alquila o vende)
    private void registrarSalida(Pelicula pelicula) {
        // Aquí registramos la fecha de salida
        pelicula.setFechaSalida(new Date());
    }

    // Método para mostrar el inventario completo
    public void mostrarInventario() {
        Nodo actual = cab;
        while (actual != null) {
            Pelicula pelicula = (Pelicula) actual.getInfo();
            System.out.println(pelicula);
            actual = actual.getSig();
        }
    }
// Método para obtener todos los registros (entrada o salida) de las películas
public void obtenerRegistros(RegistroTableModel modelo) {
    Nodo nodoActual = cab;
    while (nodoActual != null) {
        Pelicula pelicula = (Pelicula) nodoActual.getInfo();
        
        // Agregar la película a la tabla de registros con su actividad (entrada o salida)
        if (pelicula.getFechaEntrada() != null) {
            // Registro de entrada
            modelo.agregarRegistro(pelicula.getCodigo(), pelicula.getTitulo(), pelicula.getFechaEntrada(), "Entrada");
        }
        if (pelicula.getFechaSalida() != null) {
            // Registro de salida
            modelo.agregarRegistro(pelicula.getCodigo(), pelicula.getTitulo(), pelicula.getFechaSalida(), "Salida");
        }  
        nodoActual = nodoActual.getSig();
    }
}

}
