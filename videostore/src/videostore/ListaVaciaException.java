/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videostore;

import javax.swing.JOptionPane;

/**
 *
 * @author CRISTOPHER
 */
public class ListaVaciaException extends Exception{
public ListaVaciaException(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

