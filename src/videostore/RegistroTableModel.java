
package videostore;

import java.util.Date;
import javax.swing.table.DefaultTableModel;


public class RegistroTableModel extends DefaultTableModel {
    public RegistroTableModel() {
        super(new Object[][] {}, new String[] {"ID", "Título", "Fecha", "Actividad"});
    }
// Método para agregar un registro
    public void agregarRegistro(String id, String titulo, Date fecha, String actividad) {
        Object[] fila = { id, titulo, fecha, actividad };
        this.addRow(fila);
    }

  
}
