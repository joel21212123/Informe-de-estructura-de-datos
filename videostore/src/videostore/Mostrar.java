/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostore;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class Mostrar extends javax.swing.JDialog {
    private DefaultTableModel modelo;
    String[] titulos = {"Código", "Título", "Director", "Año",
        "Género", "Precio Alquiler", "Disponibilidad", "Stock", "Formato"};
    String[][] fila = {}; 
    private Inventario In;   
    public Mostrar(Inventario parent, boolean modal) {
        super(parent, modal);
        In = parent; // Guarda la referencia al inventario
        initComponents();
        setLocationRelativeTo(null);
        modelo = new DefaultTableModel(new String[][]{}, titulos);
        tsalida.setModel(modelo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtBuscar = new javax.swing.JTextField();
        Eliminar = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        Mostrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tsalida = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Buscar:");

        txtBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBuscarActionPerformed(evt);
            }
        });

        Eliminar.setBackground(new java.awt.Color(255, 153, 102));
        Eliminar.setText("Eliminar ");
        Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(255, 51, 0));
        Regresar.setText("Regresar");
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        Mostrar.setBackground(new java.awt.Color(255, 102, 102));
        Mostrar.setText("Mostrar");
        Mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarActionPerformed(evt);
            }
        });

        tsalida.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Codigos", "Titulo ", "Genero", "Director", "Stock", "Año", "Precio de alquiler", "Formato", "Disponibilidad"
            }
        ));
        tsalida.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tsalidaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tsalida);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 733, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Eliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mostrar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private void buscarPeliculas(String query) {
        modelo.setRowCount(0);
        Nodo peliculaActual = In.ListaPelicula.getCab(); 
        while (peliculaActual != null) {
             Pelicula pelicula = (Pelicula) peliculaActual.getInfo();
            if (pelicula.getCodigo().contains(query) || 
                pelicula.getTitulo().toLowerCase().contains(query.toLowerCase()) ||
                pelicula.getDirector().toLowerCase().contains(query.toLowerCase()) ||
                String.valueOf(pelicula.getAño()).contains(query) ||
                pelicula.getGenero().toLowerCase().contains(query.toLowerCase()) ||
                String.valueOf(pelicula.getPrecioAlquiler()).contains(query) ||
                String.valueOf(pelicula.getCopias()).contains(query) ||
                pelicula.getFormato().toLowerCase().contains(query.toLowerCase())){
                  String[] datos = {
                    pelicula.getCodigo(),
                    pelicula.getTitulo(),
                    pelicula.getDirector(),
                    String.valueOf(pelicula.getAño()),
                    pelicula.getGenero(),
                    String.valueOf(pelicula.getPrecioAlquiler()),
                    pelicula.isDisponible() ? "Sí" : "No",
                    String.valueOf(pelicula.getCopias()),
                    pelicula.getFormato()
                  };
                  modelo.addRow(datos); 
             }
            peliculaActual = peliculaActual.getSig();
        }
        tsalida.setModel(modelo);
    }
    private void txtBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBuscarActionPerformed
        buscarPeliculas(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarActionPerformed
// Método para filtrar las películas basadas en el texto ingresado
  
    private void EliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarActionPerformed
          int filaSeleccionada = tsalida.getSelectedRow();
    if (filaSeleccionada != -1) {
        // Obtener el código de la película seleccionada
        String codigoPelicula = (String) modelo.getValueAt(filaSeleccionada, 0);    
        try {
            // Eliminar la película de la lista en Inventario
            In.ListaPelicula.eliminarPorCodigo(codigoPelicula); // Usar eliminarPorCodigo           
            // Limpiar la tabla y mostrar las películas actualizadas
            modelo.setRowCount(0);
            Nodo peliculaActual = In.ListaPelicula.getCab();
            while (peliculaActual != null) {
                Pelicula pelicula = (Pelicula) peliculaActual.getInfo();
                String[] datos = {
                    pelicula.getCodigo(),
                    pelicula.getTitulo(),
                    pelicula.getDirector(),
                    String.valueOf(pelicula.getAño()),
                    pelicula.getGenero(),
                    String.valueOf(pelicula.getPrecioAlquiler()),
                    pelicula.isDisponible() ? "Sí" : "No",
                    String.valueOf(pelicula.getCopias()),
                    pelicula.getFormato()
                };
                modelo.addRow(datos);
                peliculaActual = peliculaActual.getSig();
            }
            tsalida.setModel(modelo);  // Actualizar la tabla
        } catch (ListaVaciaException e) {
            JOptionPane.showMessageDialog(this, "Error: La lista está vacía.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } else {
        JOptionPane.showMessageDialog(this, "Por favor, selecciona una fila para eliminar.");
    }
    }//GEN-LAST:event_EliminarActionPerformed

    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        dispose();
    }//GEN-LAST:event_RegresarActionPerformed

    private void MostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarActionPerformed
      // Limpiar la tabla antes de listar
    modelo.setRowCount(0);
    
    // Obtener la lista de películas desde el inventario
    Nodo peliculaActual = In.ListaPelicula.getCab(); // Asegúrate de que getCab() esté implementado correctamente
    while (peliculaActual != null) {
        Pelicula pelicula = (Pelicula) peliculaActual.getInfo(); 
        double precio = pelicula.getPrecioAlquiler(); 
        int stock = pelicula.getCopias(); 
        String[] datos = {
            pelicula.getCodigo(),
            pelicula.getTitulo(),
            pelicula.getGenero(),
            pelicula.getDirector(),
            String.valueOf(pelicula.getAño()),
            String.valueOf(pelicula.getPrecioAlquiler()),
            pelicula.isDisponible() ? "Sí" : "No",
            String.valueOf(pelicula.getCopias()),
            pelicula.getFormato()
        };
        modelo.addRow(datos); // Agregar los datos a la tabla
        peliculaActual = peliculaActual.getSig(); // Avanzar al siguiente nodo
    }
    tsalida.setModel(modelo);  // Establecer el modelo actualizado en la tabla  
    }//GEN-LAST:event_MostrarActionPerformed

    private void tsalidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tsalidaMouseClicked
        int filaSeleccionada = tsalida.getSelectedRow();
    }//GEN-LAST:event_tsalidaMouseClicked

    /**
     * @param args the command line arguments
     */
 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Eliminar;
    private javax.swing.JButton Mostrar;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tsalida;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
